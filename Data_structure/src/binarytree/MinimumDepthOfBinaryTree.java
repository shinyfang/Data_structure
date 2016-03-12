package binarytree;

import binarytree.SameTree.TreeNode;

public class MinimumDepthOfBinaryTree {
	public int min = 0;
	public void dfsDepth(TreeNode root, int len) {
		len ++;
		if (root.left == null && root.right == null)
			min = min==0?len:(len<min?len:min);
		else {
			if (root.left != null)
				dfsDepth(root.left, len);
			if (root.right != null)
				dfsDepth(root.right, len);
		}
	}
    public int minDepth(TreeNode root) {
    	if (root == null)
    		return min;
        dfsDepth(root,0);
        return min;
    }
}
