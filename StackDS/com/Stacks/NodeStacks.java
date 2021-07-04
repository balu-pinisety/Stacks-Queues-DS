package com.Stacks;

/**
* @author BALU
* Ability to create a linked of variable Node type
*/
public class NodeStacks<T> {

	public NodeStacks<T> next;
	public T data;

	/**
	 * Assigning data and makes next to null
	 * @param data
	 */
	public NodeStacks(T data) {
		this.data = data;
		this.next = null;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
