package com.queue;

public class QueueLL {

	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}
	}

	Node head;
	Node front;
	Node rear;

	void enqueue(int value) {
		Node nextNode = new Node(value);
		if (rear == null) {
			front = rear = nextNode;
			return;
		}

		rear.next = nextNode;
		rear = nextNode;

	}

	void dequeue() {
		if (front == null) {
			System.err.println("Queue is Empty.....");
			return;
		}

		System.out.println(front.data + " removed from queue");
		front = front.next;

		if (front == null) {
			rear = null;
		}
	}

	void peek() {
		if (front == null) {
			System.err.println("Queue is Empty.....");
			return;
		}
		System.out.println(front.data + " is at Front");
	}

	public static void main(String[] args) {
		QueueLL q1 = new QueueLL();
		q1.dequeue();
		
		q1.enqueue(15);
		q1.enqueue(25);
		q1.enqueue(35);
		q1.enqueue(45);
		q1.enqueue(55);
		q1.peek();
		
		q1.dequeue();
		q1.peek();
	}

}
