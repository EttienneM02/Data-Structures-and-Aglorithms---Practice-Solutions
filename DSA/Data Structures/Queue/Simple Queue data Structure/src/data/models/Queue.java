package data.models;

import java.util.List;
import java.util.ArrayList;
//this is a simple Queue data structure that will be used to store a list of integers
//will be optimized to Generic types soon
public class Queue {
	
	//variables
	private List<Integer> list;
	//queue size
	private int size;
	private int front;//points to the index in front of the queue
	private int rear;//points to the index of the last element of the queue
	private int max;
	
	public Queue() {
		//create an empty list
		this.list = new ArrayList<Integer>();
		front = 0;
		rear = 0;
		size = 0;
		max = 4;
	}
	
	public void enqueue(int value) {
		//add the value to the queue
		this.list.add(value);
		//increase the size
		this.size++;
		//increase the rear
		this.rear++;
	}
	
	//remove and return the first value from the queue
	public int dequeue() {
		if(!isEmpty()) {
			int firstval = 0;
			//get the value at the first element of the list
			firstval = list.get(front);
			//remove the value
			list.remove(front);//remove it from the list
			size--;
			rear--;
			
			return firstval;
		}else {
			
			//list is empty
			return -1;
		}
		
	}
	
	//validator
	private boolean isEmpty() {
		if(size == 0) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public boolean isFull() {
		if(size == max) {
			return true;
			
			
		}else {
			return false;
		}
	}
	
	public void show() {
		for(int i = 0; i < size; i++) {
			
			System.out.println("Queue Data: " +this.list.get(i));
		}
		
	}
	
	

}
