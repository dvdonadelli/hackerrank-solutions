package br.com.hackerrank.solutions.trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import static br.com.hackerrank.solutions.trees.Node.insert;

public class TreeHeightSolution {

    // Method to find the height of the tree using recursion
    private static int height(Node root) {
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
        System.out.println("Here we have two solutions to find the height of this tree that you just have inserted");

        int h = height(root);
        System.out.println("The height of this binary tree is: " + h + " and it was found it with a simple recursive algorithm");

        int heightIterative = heightIterative(root);
        System.out.println("The height of this binary tree is: " + heightIterative + " And this time it was found with a iterative solution");

        System.out.println("Here is the level order tree: ");
        levelOrder(root);
    }

}

