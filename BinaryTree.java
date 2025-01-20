//Creating a binary tree based on user input


//binary tree are the tree data structures which has atmost two childrens 
//left and right
/*Binary search tree apllication are
arihtmetic express. evaluation
Binary search tree will be used in file system
heap 
huff man encoding

Summary of Time Complexities in Binary Tree Operations:
Operation	Full Binary Tree	Binary Search Tree	Balanced Binary Tree	Degenerate Tree
Search	O(n)	O(h)	O(log n)	O(n)
Insert	O(n)	O(h)	O(log n)	O(n)
Delete	O(n)	O(h)	O(log n)	O(n)
Traversal	O(n)	O(n)	O(n)	O(n)
Height Calculation	O(n)	O(n)	O(n)	O(n)
Find Min/Max	O(n)	O(h)	O(log n)	O(n)
*/

import java.util.Scanner;

class TreeNode {
    int data;
    TreeNode left, right;

    
    public TreeNode(int item) {
        data = item;
        left = right = null;
    }
}

class BinaryTree {
    
    public TreeNode buildTree(Scanner sc) {
        System.out.print("Enter node value (-1 for null): ");
        int value = sc.nextInt();
        if (value == -1) {
            return null; 
        }
        TreeNode node = new TreeNode(value);
        System.out.println("Enter left child of " + value);
        node.left = buildTree(sc);
        System.out.println("Enter right child of " + value);
        node.right = buildTree(sc);
        return node;
    }

    // Inorder 
    public void inorderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        inorderTraversal(root.left);
        System.out.print(root.data + " ");
        inorderTraversal(root.right);
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        TreeNode root = tree.buildTree(sc);

        System.out.println("Inorder traversal of the constructed tree:");
        tree.inorderTraversal(root);
        sc.close();
    }
}
