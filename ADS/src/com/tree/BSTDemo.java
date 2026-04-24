package com.tree;

public class BSTDemo {

	private static class Node {
		int data;
		Node left;
		Node right;

		public Node(int data) {
			this.data = data;
		}
	}

	private Node root;

	public void insert(int value) {
		root = insertRecursive(root, value);
	}

	private Node insertRecursive(Node current, int value) {
		if (current == null) {
			return new Node(value);
		}

		if (value < current.data) {
			current.left = insertRecursive(current.left, value);
		} else if (value > current.data) {
			current.right = insertRecursive(current.right, value);
		} else {
			System.out.println("Duplicates are not allowed.");
		}

		return current;
	}

	public void inorder() {
		inorderRecursive(root);
		System.out.println();
	}

	private void inorderRecursive(Node current) {
		if (current == null) {
			return;
		}

		inorderRecursive(current.left);
		System.out.print(current.data + " ");
		inorderRecursive(current.right);
	}

	public void preorder() {
		preorder(root);
		System.out.println();
	}

	private void preorder(Node current) {
		if (current == null) {
			return;
		}

		System.out.print(current.data + " ");
		preorder(current.left);
		preorder(current.right);
	}

	public void postorder() {
		postorder(root);
		System.out.println();
	}

	private void postorder(Node current) {
		if (current == null) {
			return;
		}

		postorder(current.left);
		postorder(current.right);
		System.out.print(current.data + " ");
	}

	public boolean search(int value) {

		return searchRecursive(root, value);
	}

	private boolean searchRecursive(Node current, int value) {
		if (current == null) {
			return false;
		}

		if (current.data == value) {
			return true;
		}

		if (value < current.data) {
			return searchRecursive(current.left, value);
		}
		return searchRecursive(current.right, value);
	}

	public void delete(int value) {
		root = deleteRecursive(root, value);
	}

	private Node deleteRecursive(Node current, int value) {
		if (current == null) {
			return null;
		}

		if (value < current.data) {
			current.left = deleteRecursive(current.left, value);
			return current;
		}
		if (value > current.data) {
			current.right = deleteRecursive(current.right, value);
			return current;
		}

		if (current.left == null && current.right == null) {
			return null;

		}

		if (current.left == null) {
			return current.right;
		}

		if (current.right == null) {
			return current.left;
		}

		int succesor = minValue(current.right);
		current.data = succesor;
		current.right = deleteRecursive(current.right, succesor);

		return current;
	}

	public int minValue() {
		return minValue(root);
	}

	private int minValue(Node node) {
		Node current = node;
		while (current.left != null) {
			current = current.left;
		}
		return current.data;
	}

	public int height() {
		return heightRecursive(root);
	}

	private int heightRecursive(Node current) {
		if (current == null) {
			return -1;
		}

		int leftHeight = heightRecursive(current.left);
		int rightHeight = heightRecursive(current.right);

		return 1 + Math.max(leftHeight, rightHeight);
	}

	public int depth(int value) {
		Node current = root;
		int depth = 0;
		if (value == current.data) {
			return depth;
		}

		while (current != null) {
			if (value < current.data) {
				current = current.left;
			} else {
				current = current.right;
			}
			depth++;
		}
		return -1;

	}

	public static void main(String[] args) {
		BSTDemo tree = new BSTDemo();
		tree.insert(10);
		tree.insert(5);
		tree.insert(6);
		tree.insert(50);
		tree.insert(13);
		tree.insert(97);
		tree.insert(20);

		System.out.println(tree.height());
		System.out.println(tree.depth(10));

		System.out.println("Inorder: ");
		tree.inorder();
		System.out.println("Preorder: ");
		tree.preorder();
		System.out.println("Postorder: ");
		tree.postorder();

		System.out.println(tree.minValue());

	}

}
