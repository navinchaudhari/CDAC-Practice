package com.stack;

/*
 * Stack Using LinkedList
 * Push -> Add_First();
 * Pop -> Delete_First()
 * Peek -> First_Element()
 *  
 */

public class StackLinkedList2 {

	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}
	}

	Node head;

	boolean isEmpty() {
		if (head == null) {
			return true;
		}
		return false;
	}

	void push(int value) {
		Node nextNode = new Node(value);
		nextNode.next = head;
		head = nextNode;
	}

	void pop() {
		if (isEmpty()) {
			System.err.println("Stack is Empty...!");
			return;
		}

		System.out.println(head.data + " removed");
		head = head.next;
	}

	void peek() {
		if (isEmpty()) {
			System.err.println("Stack is Empty...!");
			return;
		}

		System.out.println(head.data + " is at top of the Stack");
	}

	public static void main(String[] args) {
		StackLinkedList2 stack = new StackLinkedList2();
		stack.peek();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		
		stack.peek();
		
		stack.pop();
		stack.peek();
		

	}

}
