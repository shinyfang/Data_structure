package binarytree;

import binarytree.SameTree.TreeNode;

public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null || (root.left == null && root.right == null))
        	return root;
        TreeNode tempNode = root.left;
        root.left = root.right;
        root.right = tempNode;
        if (root.left != null)
        	invertTree(root.left);
        if (root.right != null)
        	invertTree(root.right);
        return root;
    }
}
