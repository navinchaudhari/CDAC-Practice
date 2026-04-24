package com.queue;

public class QueueDemo {
	int max = 5;
	int queue[] = new int[max];
	int front = -1;
	int rear = -1;

	void enqueue(int a) {
		if (rear == max - 1) {
			System.out.println("Queue Overflow...!");
			return;
		}

		if (front == -1) {
			front = 0;
		}
		queue[++rear] = a;
		System.out.println(a + " value inserted");
	}

	int dequeue() {
		if (front == -1) {
			System.out.println("Queue Underflow...!");
		}

		int removed = queue[front++];
		if (front > rear) {
			front = -1;
			rear = -1;
		}

		return removed;
	}

	public static void main(String[] args) {
		QueueDemo q = new QueueDemo();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		// q.enqueue(60);

		System.out.println(q.dequeue() + " value removed");
		System.out.println(q.dequeue() + " value removed");
		System.out.println(q.dequeue() + " value removed");
		System.out.println(q.dequeue() + " value removed");
		System.out.println(q.dequeue() + " value removed");

		q.enqueue(60);
	}

}
