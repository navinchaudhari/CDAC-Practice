package com.linkedlist;

public class DLL {

	private static class Node {
		int data;
		Node next;
		Node prev;

		public Node(int data) {
			this.data = data;
		}
	}

	Node head;
	Node tail;

	public boolean isEmpty() {
		return head == null;
	}

	public int size() {
		if (isEmpty()) {
			return -1;
		}
		int size = 0;
		Node cureNode = head;
		while (cureNode != null) {
			cureNode = cureNode.next;
			size++;
		}
		return size;
	}

	public void insertAtBegining(int value) {
		Node newNode = new Node(value);

		if (isEmpty()) {
			head = tail = newNode;
			return;
		}

		newNode.next = head;
		head.prev = newNode;
		head = newNode;
	}

	public void insertAtEnd(int value) {
		Node newNode = new Node(value);
		if (isEmpty()) {
			head = tail = newNode;
		}

		tail.next = newNode;
		newNode.prev = tail;
		tail = newNode;
	}

	public void insertAtPosition(int position, int value) {
		Node newNode = new Node(value);

		if (position <= 1 || isEmpty()) {
			insertAtBegining(value);
			return;
		}

		Node current = head;
		int index = 1;

		while (current != null && index < position - 1) {
			current = current.next;
			index++;
		}

		if (current.next == null) {
			insertAtEnd(value);
			return;
		}

		Node nextNode = current.next;
		current.next = newNode;
		newNode.prev = current;
		newNode.next = nextNode;
		nextNode.prev = newNode;

	}

	public void deleteFromBegining() {
		if (isEmpty()) {
			System.err.println("List is Empty....");
			return;
		}

		System.out.println(head.data + " removed");
		head = head.next;
		head.prev = null;

	}

	public void deleteFromEnd() {
		if (isEmpty()) {
			System.err.println("List is Empty....");
			return;
		}

		System.out.println(tail.data + " removed");
		tail = tail.prev;
		tail.next = null;
	}

	public void deleteByValue(int value) {
		if (isEmpty()) {
			System.err.println("List is Empty...");
			return;
		}

		Node current = head;
		while (current != null) {
			if (current.data == value) {
				break;
			}
			current = current.next;
		}

		current.prev.next = current.next;
		current.next.prev = current.prev;

	}

	void displayForward() {
		if (isEmpty()) {
			System.err.println("List is Empty");
			return;
		}

		Node current = head;
		while (current != null) {
			System.out.print(current.data + " -> ");
			current = current.next;
		}
		System.out.print(" null");
		System.out.println();
	}

	void displayBackward() {
		if (isEmpty()) {
			System.err.println("List is Empty....");
			return;
		}

		Node current = tail;
		while (current != null) {
			System.out.print(current.data + " -> ");
			current = current.prev;
		}
		System.out.print("null");
		System.out.println();
	}

	public static void main(String[] args) {
		DLL list = new DLL();

		list.insertAtBegining(10);
		list.insertAtBegining(20);
		list.insertAtBegining(30);
		list.insertAtBegining(40);
		list.insertAtEnd(50);
		list.insertAtPosition(2, 500);

		System.out.println("Size: " + list.size());

		list.displayForward();
		
		list.deleteFromBegining();
		list.deleteFromEnd();
		list.deleteByValue(20);
		
		list.displayForward();
		list.displayBackward();
		System.out.println("Size: " + list.size());
	}

}
