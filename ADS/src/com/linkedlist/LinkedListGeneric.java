package com.linkedlist;

public class LinkedListGeneric<T> {

	static class Node<T> {
		T data;
		Node next;

		Node(T data) {
			this.data = data;
		}
	}

	Node<T> head;

	public boolean isEmpty() {
		return head == null;
	}

	public void insertAtBegining(T data) {
		Node<T> newNode = new Node<>(data);
		if (isEmpty()) {
			head = newNode;
			return;
		}

		newNode.next = head;
		head = newNode;
	}

	public void insertAtEnd(T data) {
		Node<T> newNode = new Node<T>(data);
		if (isEmpty()) {
			head = newNode;
			return;
		}

		Node<T> current = head;
		while (current.next != null) {
			current = current.next;
		}

		current.next = newNode;

	}

	public void insertAtPosition(int position, T data) {

		if (position <= 1 || isEmpty()) {
			insertAtBegining(data);
			return;
		}

		int index = 1;
		Node<T> current = head;
		while (current.next != null && index < position - 1) {
			current = current.next;
			index++;
		}

		Node<T> newNode = new Node<>(data);
		newNode.next = current.next;
		current.next = newNode;
	}

	void deleteFromBegining() {
		if (isEmpty()) {
			System.err.println("List is Empty......");
			return;
		}

		System.out.println(head.data + " removed from list");
		head = head.next;
	}

	void deleteFromEnd() {
		if (isEmpty()) {
			System.err.println("Linked list is Empty");
			return;
		}

		if (head.next == null) {
			System.out.println(head.data + " removed from list");
			head = null;
		}

		Node<T> current = head;
		while (current.next.next != null) {
			current = current.next;
		}
		System.out.println(current.next.data + " removed from list");
		current.next = null;

	}

	void display() {
		if (isEmpty()) {
			System.err.println("List is Empty.....");
			return;
		}

		Node<T> current = head;

		while (current != null) {
			System.out.print(current.data + " -> ");
			current = current.next;
		}
		System.out.println(" null");
	}

	void search(T value) {
		if (isEmpty()) {
			System.err.println("List is Empty....");
			return;
		}

		Node<T> current = head;
		while (current != null) {
			if (current.data.equals(value)) {
				System.out.println("Value Found");
				break;
			}
			current = current.next;
		}
	}

	public static void main(String[] args) {
		LinkedListGeneric<String> city = new LinkedListGeneric<>();
		city.insertAtBegining("Bhusawal");
		city.insertAtBegining("Jalgaon");
		city.insertAtBegining("Mumbai");
		city.insertAtBegining("Pune");
		city.insertAtEnd("Nashik");

		/*
		 * city.display(); city.deleteFromBegining(); city.deleteFromEnd();
		 * city.display();
		 */

		city.display();
		city.insertAtPosition(2, "Delhi");
		city.display();

		city.search("bhusawal");
	}

}
