package com.greatlearning.gradedproject3;

class Node {
	int value;
	Node left, right;

	Node(int item) {
		value = item;
		left = right = null;
	}
}

class BSTToSkewed {
	public static Node node;
	static Node prevNode = null;
	static Node headNode = null;

	static void bSTtoSkewed(Node root) {

		if (root == null) {
			return;
		}

		bSTtoSkewed(root.left);
		Node rightNode = root.right;
		Node leftNode = root.left;

		if (headNode == null) {
			headNode = root;
			root.left = null;
			prevNode = root;
		} else {
			prevNode.right = root;
			root.left = null;
			prevNode = root;
		}

		bSTtoSkewed(rightNode);

	}

	static void traverseRightSkewedTree(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.value + " ");
		traverseRightSkewedTree(root.right);
	}

	public static void main(String[] args) {

		BSTToSkewed tree = new BSTToSkewed();
		tree.node = new Node(50);
		tree.node.left = new Node(30);
		tree.node.right = new Node(60);
		tree.node.left.left = new Node(10);
		tree.node.right.left = new Node(55);

		bSTtoSkewed(node);
		System.out.println("The resultant  output is :");
		traverseRightSkewedTree(headNode);
	}
}