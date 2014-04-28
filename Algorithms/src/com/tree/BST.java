package com.tree;

import java.util.Comparator;

public class BST<Key extends Comparable<Key>,Value> {
	
	Node root;
	
	private class Node {
		
		private Key key;
        private Value val;  
		private int N;
		
        private Node left;
        private Node right;
        
        public Node(Key k,Value v,int N)
        {
        	this.key = k;
        	this.val = v;
        	this.N = N;
        }
	}    
        private int size(Node x){
        	if (x == null) return 0;
        	else return x.N;
        }
        
        
        
        public void put(Key newKey,Value newValue){
                 	
        	root = put(root,newKey,newValue);
   
        }
        
        
        public Node put(Node x, Key newKey,Value newValue){
        
        	int cmp = newKey.compareTo(x.key);
        	
        	if(cmp < 0)  x.left = put(x.left,newKey,newValue);
        	else if(cmp > 0)  x.right = put(x.right,newKey,newValue);
        	else x.val = newValue;
        	return x;
        }
        
        
        public Value get(Key key){
        
        	return get(root,key);
        }
	
	    public Value get(Node x,Key key){
	    	
	    	int cmp = key.compareTo(x.key);
	    	
	    	if(cmp == 0) return x.val;
	    	
	    	else if(cmp < 0)
	    		{x=x.left;
	    		get(x.left,key);}
	    	
	    	else if(cmp > 0) 
	    		{x=x.right;
	    		get(x.right,key);}
	    	
			return null;
	    }
	
	
	public static void main(String args[]){
		
		
		BST<String,Integer> bst =new BST<String, Integer>();
		
		bst.put("hello10", 10);
		bst.put("hello5", 5);
		bst.put("hello6", 6);
		bst.put("hello8", 8);
		bst.put("hello14", 14);
		
		System.out.println(bst.get("hello5"));
		
	}

}
