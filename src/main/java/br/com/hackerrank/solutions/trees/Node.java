package br.com.hackerrank.solutions.trees;

class Node {

    Node left;
    Node right;
    int value;

    Node(int value) {
        this.value = value;
        left = null;
        right = null;
    }

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

}
