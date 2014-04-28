package com.Heap;

import java.util.ArrayList;

public class BinaryHeap {

	ArrayList<Integer> heap;
	
	
	public BinaryHeap() {

    heap = new ArrayList<Integer>();
    
	}
	
	
	public void siftDown(){
		Integer root = heap.get(0);
		
		int k = heap.size() -1;
		Integer child = heap.get(k);
		
		k=0;
		
		heap.set(k, child);
		
		while(k < heap.size() -1){
			
			int leftChild = 2*k + 1;
			int rightChild = 2*k + 2;
			
			if(heap.get(leftChild) > heap.get(rightChild) && heap.get(leftChild) > heap.get(k)){
				heap.set(2*k +1,child);
				heap.set(k, heap.get(leftChild));
				System.out.println("Swapping : "+heap.get(leftChild) + ":" +heap.get(k) );
				k = 2*k +1;
			}
			else if(heap.get(leftChild) <= heap.get(rightChild) && heap.get(rightChild) > heap.get(k)) {
				heap.set(2*k +2,child);
				heap.set(k, heap.get(rightChild));
				System.out.println("Swapping : "+heap.get(rightChild) + ":" +heap.get(k) );
				k = 2*k +2;
			}

		}
		System.out.println("Removed : "+root);
		
	}
	
	
	public void siftUp(){
		int k = heap.size() -1;
		
		
		while(k > 0){
			
			int p = (k-1)/2;
			
			Integer child = heap.get(k);
			Integer parent = heap.get(p);
			
			if(child > parent){
				heap.set(p, child);
				heap.set(k, parent);
			    k = p;    
			}
			    else{
			      break;}
			    
		}
	}
	
	public void put(int num){
		heap.add(num);
		siftUp();
	}
	
	public void delete(){
		heap.remove(0);
		siftDown();
	}
	
	public void printInorder(int root){
		
	for(int i:heap){
		System.out.print(";"+i);
	}
	}
	
	public static void main(String args[]){
		
		BinaryHeap bh =new BinaryHeap();
		bh.put(10);
		bh.put(30);
		bh.put(50);
		bh.put(5);
		bh.put(25);
		bh.put(95);
		
		bh.printInorder(0);
		
		bh.delete();
		bh.printInorder(0);
	}
	
	
	
}
