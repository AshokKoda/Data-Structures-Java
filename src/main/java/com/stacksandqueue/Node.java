package com.stacksandqueue;

public class Node<K> {

	K data;
	Node<K> next;

	public Node(K data) {
		this.data = data;
		this.next = null;
	}
}
