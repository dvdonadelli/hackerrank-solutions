package br.com.hackerrank.solutions.trees;

import java.util.LinkedList;
import java.util.Queue;

class Node {

    Node left;
    Node right;
    int value;

    Node(int value) {
        this.value = value;
        left = null;
        right = null;
    }

    public Node insert(Node root, int value) {
        if (root == null)
            return new Node(value);
        else {
            Node currentNode;
            if (value <= root.value) {
                currentNode = insert(root.left, value);
                root.left = currentNode;
            } else {
                currentNode = insert(root.right, value);
                root.right = currentNode;
            }
            return root;
        }
    }

    // Method to find the height of the tree using recursion
    private int height(Node root) {
        if (root == null)
            return -1;
        else {
            int leftH = height(root.left);
            int rightH = height(root.right);

            return Math.max(leftH, rightH) + 1;
        }
    }

    // Method to find the height of the tree iteratively
    private static int heightIterative(Node root) {
        if (root == null)
            return 0;

        Queue<Node> q = new LinkedList();

        q.add(root);
        int height = -1;

        while (true) {
            int nodeCount = q.size();
            if (nodeCount == 0)
                return height;
            height++;

            while (nodeCount > 0) {
                Node newNode = q.peek();
                q.remove();
                if (newNode.left != null)
                    q.add(newNode.left);
                if (newNode.right != null)
                    q.add(newNode.right);
                nodeCount--;
            }
        }
    }

    // Given a pointer to the root of a binary tree, you need to print the level order traversal of this tree.
    // In level-order traversal, nodes are visited level by level from left to right
    private static void levelOrder(Node root) {

        if (root == null) return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (true) {
            int nodeCount = q.size();

            if (nodeCount == 0) return;

            while (nodeCount > 0) {
                Node curNode = q.peek();
                q.remove();
                if (curNode.left != null) {
                    q.add(curNode.left);
                }
                if (curNode.right != null) {
                    q.add(curNode.right);
                }
                System.out.print(curNode.value + " ");
                nodeCount--;
            }
        }
    }
}
