package com.stack;

public class Queue {

	int queue_capacity = 10; // default capacity
	int current_size = 0;
	int[] queue_items;
	
	
	Queue(int q_capacity)
	{
		this.queue_capacity = q_capacity;
		 queue_items = new int[queue_capacity];
	}
	
	int pop()
	{
		
	
		
		return 0;
	}
	
	
	void push(int num){
		queue_items[current_size] = num;
		current_size++;
	}
	
}
