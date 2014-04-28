package com.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {

	
	Node root; 
	private class Node{
		public int key;
		Node left,right;
		
	public Node(int key){
		this.key = key;
	  }	
	}
	
	public void put(int key){
		
		root = put(root,key);
		
	}
	
	private Node put(Node node, int key){
		
	if(node == null) {
		System.out.println(" Creating Node :"+key);
		return new Node(key);}
	
	if( key < node.key ){
		System.out.println(" Moving left : "+key);
		node.left = put(node.left,key);
	}
	
	if(key > node.key){
		System.out.println(" Moving Right : "+key);
		node.right =put(node.right,key);
	}
		
	return node;
	}
	
	public int get(int key){
		
		return get(root,key);
	}
	
	private int get(Node node,int key){
		
		if (key == node.key) return node.key;
		
		if(key < node.key) {
			return get(node.left,key);
		}
		
		if(key > node.key){
			return get(node.right,key);
		}
		return -1;
	}
	
	
	public void print(){
		System.out.println("In order ");
		printInOrder(root);
		System.out.println("Level order :");
		printLevelOrder(root);
		
	}
	private void printInOrder(Node node){
		if(node == null) return;
		printInOrder(node.left);
		System.out.println("Key : "+ node.key);
		printInOrder(node.right);
	}
	
	
	private void printLevelOrder(Node node){
			
	Queue<Node> nodequeue =new LinkedList<Node>();
		
	 nodequeue.add(node);
	 
	 while( !nodequeue.isEmpty()){
		 Node firstNode = nodequeue.remove();
		 System.out.println("Key :  "+ firstNode.key);
		 
		 if(firstNode.left != null) nodequeue.add(firstNode.left);
		 if(firstNode.right != null) nodequeue.add(firstNode.right);
	 }
		
	}
		
	public static void main(String args[]){
		
		BinarySearchTree bst =new BinarySearchTree();
		
		
		bst.put(300);
		bst.put(250);
		bst.put(350);
		bst.put(100);
		bst.put(500);
		bst.put(50);
		bst.put(125);
		bst.print();
		
		
		
	}
}
