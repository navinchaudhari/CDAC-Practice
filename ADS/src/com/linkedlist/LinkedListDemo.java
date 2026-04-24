package com.linkedlist;


public class LinkedListDemo {

	private static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}
	}

	Node head;

	public void insertAtEnd(int value) {
		Node nextNode = new Node(value);
		if (head == null) {
			head = nextNode;
			return;
		}
		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = nextNode;
	}

	public void insertAtBegining(int value) {
		Node newNode = new Node(value);
		newNode.next = head;
		head = newNode;
	}

	public void insertAtPosition(int value, int position) {
		if (position <= 1 || head == null) {
			insertAtBegining(value);
			return;
		}
		Node current = head;
		int index = 1;
		while (current.next != null && index < position - 1) {
			current = current.next;
			index++;
		}

		Node newNode = new Node(value);
		newNode.next = current.next;
		current.next = newNode;
	}

	public int deleteAtBeginning() {
		if (head == null) {
			System.out.println("Linkedlist is Empty");
			return -1;
		}
		int removed = head.data;
		head = head.next; // updating address
		return removed;
	}

	public int deleteAtEnd() {
		if (head == null) {
			System.out.println("Linkedlist is Empty");
			return -1;
		}
		if (head.next == null) {
			int removed = head.data;
			head = null;
			return removed;
		}

		Node current = head;
		while (current.next.next != null) {
			current = current.next;
		}
		int removed = current.next.data;
		current.next = null;
		return removed;

	}

	public void reverse() {
		Node previous = null;
		Node current = head;

		while (current != null) {
			Node nextNode = current.next;
			current.next = previous;
			previous = current;
			current = nextNode;
		}
		head = previous;
	}

	public void display() {
		if (head == null) {
			System.out.println("LinkedList is Empty");
			return;
		}

		Node current = head;
		while (current != null) {
			System.out.println(current.data + " ");
			current = current.next;
		}
	}

	public boolean search(int value) {
		Node current = head;

		while (current != null) {
			if (current.data == value) {
				return true;
			}
			current = current.next;
		}
		return false;
	}

	public static void main(String[] args) {
		LinkedListDemo l = new LinkedListDemo();
		l.insertAtEnd(10);
		l.insertAtEnd(20);
		l.insertAtEnd(30);
		l.insertAtEnd(40);

//		System.out.println(l.search(50));

		/*
		 * System.out.println(l.deleteAtBeginning());
		 * System.out.println(l.deleteAtBeginning());
		 * System.out.println(l.deleteAtEnd());
		 */
		/*
		 * l.insertAtEnd(50); l.insertAtBegining(60); l.insertAtPosition(500, 3);
		 */
//		l.display();
		System.out.println("check.....");
	}

}
