package BinaryTree;

import java.util.ArrayList;
import java.util.List;


public class BinaryTreePostorderTraversal {
	 public static void postorder(Node root, List<Integer> arr) {
	        if (root == null) {
	            return;
	        }
	        postorder(root.left, arr);
	        postorder(root.right, arr);
	        arr.add(root.data);
	    }

	    public static List<Integer> postorder(Node root) {
	        List<Integer> arr = new ArrayList<>();
	        postorder(root, arr);
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


	        // Getting postorder traversal
	        List<Integer> result = postorder(root);

	        // Displaying the postorder traversal result
	        System.out.print("postorder Traversal: ");
	        // Output each value in the
	        // postorder traversal result
	        for (int val : result) {
	            System.out.print(val + " ");
	        }
	        System.out.println();
	    }
}

