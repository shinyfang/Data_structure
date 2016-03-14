package binarytree;

import binarytree.SameTree.TreeNode;
//判断是否是二叉平衡树
//递归直到null返回0，然后比较当前节点的左右深度相差多少
public class BalancedBinaryTree {
	public int isB(TreeNode root) {
		if (root == null)
			return 0;
		int left = isB(root.left);
		int right = isB(root.right);
		if (left >= 0 && right >= 0 && Math.abs(left-right) <= 1)//要保证左右子树也要是平衡
			return Math.max(left, right)+1;
		return -1;
	}
    public boolean isBalanced(TreeNode root) {
        int depth = isB(root);
        if (depth == -1)
        	return false;
        return true;
    }
}
