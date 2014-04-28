package com.hashtables;

import java.util.HashMap;
import java.util.Hashtable;

public class HashtableExample {

	
	public static void main(String args[]){
		
	Hashtable<Integer,String> hashtable = new Hashtable<Integer,String>();
		hashtable.put(10,"Hello10");
		hashtable.put(11,"Hello11");
		hashtable.put(12,"Hello12");
		hashtable.put(13,"Hello13");
		hashtable.put(14,"Hello14");
		hashtable.put(15,"Hello15");
		hashtable.put(16,"Hello16");
		hashtable.put(17,"Hello17");
		
		System.out.println(hashtable.values());
		System.out.println(hashtable.get(11));
		
		
		HashMap<Integer,String> hashmap = new HashMap<Integer,String>();
		hashmap.put(10,"hello");
		System.out.println(hashmap.values());
		System.out.println(hashmap.get(11));
		
		
	}

}
