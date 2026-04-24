package com.stack;


public class StackDemo {
	int top = -1;
	int max = 5;
	int[] stack = new int[max];

	boolean isFull() {
		return top == max - 1;
	}

	boolean isEmpty() {
		return top == -1;
	}

	void push(int a) {
		if (isFull()) {
			System.out.println("Stack Overflow...!!");
		} else {
			top++;
			stack[top] = a;
			System.out.println("Value " + a + " added to stack");
		}

	}

	void pop() {
		if (isEmpty()) {
			System.out.println("Stack Under Flow....!!");
		} else {
			System.out.println(stack[top] + " removed from stack");
			top--;

		}
	}

	void peek() {
		if (isEmpty()) {
			System.err.println("Stack is Empty...!!");
		} else {
			System.out.println(stack[top] + " is at the top of the stack");
		}
	}

	void display() {
		if (isEmpty()) {
			System.out.println("Stack is Empty");
		} else {
			System.out.println("Stack Elements : ");
			for (int i = top; i >= 0; i--) {
				System.out.print(stack[i] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		StackDemo s = new StackDemo();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);

		s.pop();
		s.push(60);
		s.peek();
		s.display();

		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop(); // Stack under flow
		s.peek();

	}

}
