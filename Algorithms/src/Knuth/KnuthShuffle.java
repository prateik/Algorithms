package Knuth;

public class KnuthShuffle {

	public static Object[] Knuth(Object[] arr){
		
		int N =arr.length;
		System.out.println("N : "+N);
		for(int i = 0;i < N;i++){
			System.out.println("Add : "+(int)(Math.random()*(N-i)));
			int r = i + (int)(Math.random()*(N-i));
			System.out.println("Random index : "+r+":"+Math.random());
			Object swap = arr[r];
			arr[r] =arr[i];
			arr[i]=swap;
			
		}
		
		return arr;
	}
	
	
	public static void main(String args[]){
		
		
		String[] str = {"hello1","hello2","hello3","hello4","hello5","hello6"};
		
		
		for(String s:str){
			System.out.print(s);
		}
		
		System.out.println();
		
		str=(String [])Knuth(str);
		System.out.println("After Shuffle : ");
		for(String s:str){
			System.out.print(s);
		}
		
		System.out.println();
	}
}
