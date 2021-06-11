package br.com.hackerrank.solutions.trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TreeHeightSolution {

    public static Node insert(Node root, int value) {
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

    // Method to solve the problem using recursion
    private static int height(Node root) {
        if (root == null)
            return -1;
        else {
            int leftH = height(root.left);
            int rightH = height(root.right);

            return Math.max(leftH, rightH) + 1;
        }
    }

    // Method to solve the problem iteratively
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

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter how many values do you want to insert into a tree: ");
        int t = s.nextInt();
        Node root = null;
        System.out.println();
        System.out.println();
        System.out.println("All right, now please enter the values: ");
        while (t-- > 0) {
            int value = s.nextInt();
            root = insert(root, value);
            System.out.println();
            System.out.println("The value " + value + " was successfully inserted into the tree.");
        }
        s.close();
        System.out.println();
        int h = height(root);
        System.out.println("The height of this binary tree is: " + h + " and it was found it with a simple recursive algorithm");

        int heightIterative = heightIterative(root);
        System.out.println("The height of this binary tree is: " + heightIterative + " And this time it was found with a iterative solution");

    }

}

class Node {
    Node left;
    Node right;
    int value;

    Node(int value) {
        this.value = value;
        left = null;
        right = null;
    }
}

