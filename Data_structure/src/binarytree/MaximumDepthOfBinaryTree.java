package binarytree;

import binarytree.SameTree.TreeNode;
//树的最大深度
//递归
//用全局变量记住最大深度，每次比较到叶子节点的时候判断当前深度是否大于最大深度
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
