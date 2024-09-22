package BinaryTree;

import java.util.ArrayList;
import java.util.List;


public class BinaryTreePreorderTraversal {
	 public static void preorder(Node root, List<Integer> arr) {
	        if (root == null) {
	            return;
	        }
	        arr.add(root.data);
	        preorder(root.left, arr);
	        preorder(root.right, arr);
	    }

	    public static List<Integer> preorder(Node root) {
	        List<Integer> arr = new ArrayList<>();
	        preorder(root, arr);
	        return arr;
	    }
	    
	    public static void main(String[] args) {
	        // Creating a sample binary tree
	        Node root = new Node(4);
	        root.left = new Node(2);
	        root.right = new Node(5);
	        root.left.left = new Node(3);
	        root.left.left.right = new Node(9);
	        root.left.left.right.left = new Node(1);
	        root.right.left = new Node(7);
	        root.right.right = new Node(6);
	        root.right.right.left = new Node(8);


	        // Getting preorder traversal
	        List<Integer> result = preorder(root);

	        // Displaying the preorder traversal result
	        System.out.print("preorder Traversal: ");
	        // Output each value in the
	        // preorder traversal result
	        for (int val : result) {
	            System.out.print(val + " ");
	        }
	        System.out.println();
	    }
}

