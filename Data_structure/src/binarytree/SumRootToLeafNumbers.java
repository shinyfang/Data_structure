package binarytree;

import binarytree.SameTree.TreeNode;

public class SumRootToLeafNumbers {
	public int re = 0;
	public void dfs(TreeNode root, int add) {
		if (root == null)
			return;
		add = 10*add + root.val;
		if (root.left == null && root.right == null)
			re += add;
		else if (root.left == null && root.right != null)
			dfs(root.right, add);
		else if (root.left != null && root.right == null)
			dfs(root.left, add);
		else {
			dfs(root.left, add);
			dfs(root.right, add);
		}
	}
	public int sumNumbers(TreeNode root) {
		dfs(root,0);
		return re;
	}
}
