package com.Stacks;

/**
 * @author BALU
 * Main function for calling of Stack Class
 * To pass data to Linked list to do different Stack operations
 */
public class MainStacks {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Welcome Message
		System.out.println("Program for the Stacks of Linked List");
		
		OperationStacks<Integer> stacks = new OperationStacks<Integer>();//Object Creation
		stacks.push(70);
		stacks.push(30);
		stacks.push(56);
		stacks.display();//Printing Elements
	}

}