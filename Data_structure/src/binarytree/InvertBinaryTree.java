package binarytree;

import binarytree.SameTree.TreeNode;
//二叉树的镜像
//递归
//不断的交换左右节点
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
