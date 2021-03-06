package com.stacksandqueue;

public class Queue<K> {

	LinkedList<K> linkedList;

	public Queue() {
		this.linkedList = new LinkedList<K>();
	}

	public void enQueue(K data) {
		linkedList.appendNode(data);
	}

	public void deQueue() {
		linkedList.popLast();
	}

	public static void main(String[] args) {
		
		Queue<Integer> queue = new Queue<Integer>();
		queue.enQueue(56);
		queue.enQueue(30);
		queue.enQueue(70);

	}

}
