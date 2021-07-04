package com.Stacks;

/**
 * @author BALU
 * Ability to create a Stack of Elements using Linked List
 * Ability to perform Stack Operations on the list
 */
public class OperationStacks<T extends Comparable <T>> {
	
	NodeStacks<T> head;
	
	public OperationStacks() {
		head = null;
	}
	
	/**
	 * Pushing a new element to it
	 * @param args
	 */
	public void push(T data) {
		NodeStacks<T> newNode = new NodeStacks<T>(data);
		newNode.next=head;
		head = newNode;
	}
	
	/**
	 * Displaying the elements in the Stack
	 */
	public void display() {
		NodeStacks<T> temp = head;
		System.out.print("Stack Sequence is :\n  ");
		while(temp!=null) {
			System.out.print(temp.data+"\n  ");
			temp=temp.next;
		}
	}
	
	public void peek() {
		if (head == null) {
			System.out.println("Stack is Empty\nThere's no element to peek\n");
		} else {
			System.out.println("\nPeeked Element is: "+head.data);
		}
	}
	
	public void pop() {
		if (head == null) {
			display();
			System.out.print("Empty\nThere's no element to pop");
		} else {
			System.out.println("\nAfter Popping element '"+head.data+"'");
			head=head.next;
			display();
			if (head==null) System.out.print("Empty\n\n");
		}
	}
}
