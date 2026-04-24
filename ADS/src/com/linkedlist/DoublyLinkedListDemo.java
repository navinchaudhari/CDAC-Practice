package com.linkedlist;

public class DoublyLinkedListDemo {

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

	void insertAtBeginning(int value) {
		Node newNode = new Node(value);

		if (head == null) {
			head = tail = newNode;
			return;
		}

		newNode.next = head;
		head.prev = newNode;
		head = newNode;
	}

	void insertAtEnd(int value) {
		Node newNode = new Node(value);
		if (head == null) {
			head = tail = newNode;
			return;
		}

		tail.next = newNode;
		newNode.prev = tail;
		tail = newNode;
	}

	void insertAtPosition(int position, int value) {

		if (position <= 1 && head == null) {
			insertAtBeginning(value);
			return;
		}

		int index = 1;
		Node current = head;
		while (current != null && index < position - 1) {
			current = current.next;
			index++;
		}

		if (current.next == null) {
			insertAtEnd(value);
			return;
		}

		Node newNode = new Node(value);
		Node nextNode = current.next;

		current.next = newNode;
		newNode.prev = current;
		newNode.next = nextNode;
		nextNode.prev = newNode;

	}

	void deleteAtBegining() {
		if (head == null) {
			System.err.println("List is Empty......");
			return;
		}
		System.out.println(head.data + " removed");
		head = head.next;

		if (head == null) {
			tail = null;
		} else {
			head.prev = null;
		}

	}

	void deleteAtEnd() {
		if (tail == null) {
			System.err.println("Linked list is Empty......");
			return;
		}

		System.out.println(tail.data + " removed");
		tail = tail.prev;
		if (tail == null) {
			head = null;
		} else {
			tail.next = null;
		}
	}

	void displayForward() {
		if (head == null) {
			System.out.println("Doubly linked list is empty");
			return;
		}

		Node current = head;

		while (current != null) {
			System.out.print(current.data + " -> ");
			current = current.next;
		}
		System.out.println("null");
		System.out.println();
	}

	void displayBackward() {
		if (head == null) {
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
		DoublyLinkedListDemo dll = new DoublyLinkedListDemo();
		dll.insertAtBeginning(10);
		dll.insertAtBeginning(20);
		dll.insertAtEnd(30);
		dll.insertAtEnd(40);
		dll.insertAtPosition(3, 100);
		dll.displayForward();
		dll.deleteAtBegining();
		dll.deleteAtEnd();
		dll.displayForward();
		dll.displayBackward();
//		System.out.println(dll.head.prev.data);
	}

}
