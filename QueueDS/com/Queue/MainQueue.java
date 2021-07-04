package com.Queue;

/**
 * @author BALU
 * Main function for calling of Queue Class
 * To pass data to Linked list to do different Queue operations
 */
public class MainQueue {

	public static void main(String[] args) {
		// Welcome Message
		System.out.println("Program for the Queue of Linked List");
		OperationQueue<Integer> queue = new OperationQueue<Integer>();
		queue.enqueue(56);
		queue.enqueue(30);
		queue.enqueue(70);
		queue.display();
	}

}
