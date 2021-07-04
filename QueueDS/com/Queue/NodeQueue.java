package com.Queue;

/**
 * @author BALU
 * Ability to create a linked of variable Node type
 */
public class NodeQueue<T> {

	NodeQueue<T> next;
	T data;

	/**
	 * Assigning data and makes next to null
	 * @param data, next
	 */
	public NodeQueue(T data, NodeQueue<T> next) {
		this.data = data;
		this.next = next;
	}

}
