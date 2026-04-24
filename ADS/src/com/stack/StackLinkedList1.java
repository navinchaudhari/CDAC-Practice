package com.stack;

/*
 * Stack Using LinkedList
 * Push -> Add_Last();
 * Pop -> Delete_Last()
 * Peek -> Last_Element()
 *  
 */

public class StackLinkedList1 {

	public static class Node {
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

		if (isEmpty()) {
			head = nextNode;
			return;
		}

		Node current = head;
		while (current.next != null) {
			current = current.next;
		}

		current.next = nextNode;

	}

	void peek() {
		if (isEmpty()) {
			System.err.println("Stack is Empty...!");
			return;
		}
		Node current = head;
		while (current.next != null) {
			current = current.next;
		}

		System.out.println("Value at Top is " + current.data);
	}

	void pop() {
		if (isEmpty()) {
			System.err.println("Stack is Empty...!");
			return;
		}

		if (head.next == null) {
			System.out.println(head.data + " removed");
			head = null;
			return;
		}

		Node current = head;
		while (current.next.next != null) {
			current = current.next;
		}
		System.out.println(current.next.data + " removed");
		current.next = null;

	}

	void insertAtFirst(int value) {
		Node newNode = new Node(value);
		newNode.next = head;
		head = newNode;
	}

	void deleteFromFirst() {
		if (isEmpty()) {
			System.err.println("LinkedList is Empty..!");
			return;
		}

		System.out.println(head.data + " removed");
		head=head.next;
		

	}

	public static void main(String[] args) {
		StackLinkedList1 stack = new StackLinkedList1();

		stack.peek();
		stack.insertAtFirst(55);
		stack.peek();

		stack.push(10);
		stack.pop();

		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(70);

		stack.peek();
		stack.pop();
		stack.peek();

	}

}
