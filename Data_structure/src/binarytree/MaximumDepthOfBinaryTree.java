package binarytree;

import binarytree.SameTree.TreeNode;

public class MaximumDepthOfBinaryTree {
	public int max = 0;
	public void dfsDepth(TreeNode root, int len) {
		len ++;
		max = len>max?len:max;
		if (root.left != null)
			dfsDepth(root.left, len);
		if (root.right != null)
			dfsDepth(root.right, len);
	}
    public int maxDepth(TreeNode root) {
        if (root == null)
        	return max;
        dfsDepth(root,0);
        return max;
    }
}
