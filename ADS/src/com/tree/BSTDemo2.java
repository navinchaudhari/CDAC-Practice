package com.tree;

public class BSTDemo2 {

	static class Node {
		int data;
		Node left;
		Node right;

		public Node(int data) {
			this.data = data;
		}
	}

	Node root;

	public void insert(int data) {
		root = insert(root, data);
	}

	private Node insert(Node current, int data) {
		if (current == null) {
			return new Node(data);
		}

		if (data < current.data) {
			current.left = insert(current.left, data);
		} else if (data > current.data) {
			current.right = insert(current.right, data);
		} else {
			System.out.println("Duplicate Value");
		}

		return current;

	}

	// Have some bug
	/*
	 * public void search(int value) { search(root, value); }
	 * 
	 * private void search(Node current, int value) { if (current == null) {
	 * System.err.println("Tree is Empty........"); return; }
	 * 
	 * if (value == current.data) { System.out.println(value + " found"); } else if
	 * (value < current.data) { search(current.left, value); } else if (value >
	 * current.data) { search(current.right, value); } }
	 */

	public boolean search(int value) {
		return search(root, value);
	}

	private boolean search(Node current, int value) {
		if (current == null) {
			return false;
		}

		if (value == current.data) {
			return true;
		}

		if (value < current.data) {
			search(current.left, value);
		}
		return search(current.right, value);

	}

	public int height() {
		return height(root);
	}

	private int height(Node current) {
		if (current == null) {
			return 0;
		}

		int lh = height(current.left);
		int rh = height(current.right);

		return 1 + Math.max(lh, rh);
	}

	public int heightByEdge() {
		return heightByEdge(root);
	}

	public int heightByEdge(Node root) {
		if (root == null) {
			return -1;
		}
		int lh = heightByEdge(root.left);
		int rh = heightByEdge(root.right);
		int ht = Math.max(lh, rh) + 1;
		return ht;
	}

	public int min() {
		return min(root);
	}

	private int min(Node node) {
		Node current = node;
		while (current.left != null) {
			current = current.left;
		}

		return current.data;
	}

	public int max() {
		return max(root);
	}

	private int max(Node node) {
		Node current = node;
System.out.println();		while (current.right != null) {
			current = current.right;
		}

		return current.data;
	}

	public void inorder() {
		inorder(root);
		System.out.println();
	}

	private void inorder(Node current) {
		if (current == null) {
			return;
		}

		inorder(current.left);
		System.out.print(current.data + " ");
		inorder(current.right);

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

	public void delete(int value) {
		root = delete(root, value);
	}

	private Node delete(Node current, int value) {
		if (current == null) {
			return null;
		}

		if (value < current.data) {
			current.left = delete(current.left, value);
			return current;
		}
		if (value > current.data) {
			current.right = delete(current.right, value);
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

		int successor = min(current.right);
		current.data = successor;
		current.right = delete(current.right, successor);
		return current;
	}

	public int depth(int value) {
		Node current = root;
		int depth = 0;
		while (current != null) {
			if (current.data == value) {
				return depth;
			}

			if (value < current.data) {
				current = current.left;
				depth++;
			} else {
				current = current.right;
				depth++;
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		BSTDemo2 tree = new BSTDemo2();
		tree.insert(20);
		tree.insert(10);
		tree.insert(50);
		tree.insert(30);

//		System.out.print("Inorder: ");
//		tree.inorder();
//
//		System.out.print("Preorder: ");
//		tree.preorder();
//
//		System.out.print("Postorder: ");
//		tree.postorder();
//
//		System.out.println("Height: " + tree.height());
//
//		System.out.println(tree.search(40));
//
//		System.out.println(tree.min());
//		System.out.println(tree.max());
//		
//		tree.delete(10);
//		tree.preorder();
		System.out.println("Depth of 50 is " + tree.depth(50));
		System.out.println("Depth of 30 is " + tree.depth(30));
		System.out.println("Depth of 20 is " + tree.depth(20));
		System.out.println("Depth of 70 is " + tree.depth(70));

		tree.delete(50);
		tree.preorder();

	}

}
