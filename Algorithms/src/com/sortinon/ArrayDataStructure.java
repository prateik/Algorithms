package com.sortinon;

public class ArrayDataStructure {

	int arr[] = new int[10];
	boolean arrFlag[]=new boolean[10];
	
	int GLOBAL_VALUE = 0;
	
	public int getValue(int index){
		if(arrFlag[index])
		{
			setValue(index, GLOBAL_VALUE);
			return GLOBAL_VALUE;
		}
		return arr[index];
	}
	
	public void setValue(int index,int value){
		arr[index]=value;
	}
	
	public void setAll(int value){
		
		GLOBAL_VALUE = value;
	}
	public static void main(String args[]){
	
		System.out.println(ArrayDataStructure.class.hashCode());
		
		ArrayDataStructure orig= new ArrayDataStructure();
		
		System.out.println("Orig : "+orig.hashCode());
		
		try {
			ArrayDataStructure clone= (ArrayDataStructure)orig.clone();
			System.out.println("Clone :"+clone.hashCode());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
