package com.Queue;

/**
 * @author BALU
 * Ability to create a Queue of Elements using Linked List
 * Ability to perform Queue Operations on the list
 */
public class OperationQueue<T> {
	
	NodeQueue<T> front;
	NodeQueue<T> last;
	
	public OperationQueue() {
		front = null;
		last = null;
	}
	
	/**
	 * Adding a new element to Queue list
	 * @param data
	 */
	public void enqueue(T data) {
		if (last!=null) {
			last.next = new NodeQueue<T>(data, null);
			last = last.next;
		} else {
			last = new NodeQueue<T>(data, null);
			front = last;
		}
	}
	
	/**
	 * Displaying the elements in the Queue
	 */
	public void display() {
		NodeQueue<T> temp = front;
		System.out.print("Queue Sequence is :\n  ");
		while(temp!=null) {
			System.out.print(temp.data+"\n  ");
			temp=temp.next;
		}
	}
	
	/**
	 * Removing the element from Queue list
	 * Making next element as front
	 * @param data
	 */
	public void dequeue() {
		if (front==null) {
			display();
			System.out.print("Empty\nThere's no element to dequeue");
		} else {
			System.out.println("\nAfter Deque element '"+front.data+"'");
			front=front.next;
			display();
			if (front==null) System.out.print("Empty\n\n");
		}
	}
}
