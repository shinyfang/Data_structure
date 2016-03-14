package binarytree;

import binarytree.SameTree.TreeNode;
/***
 * 
 * @author speech
 * Given a binary tree containing digits from 0-9 only, each root-to-leaf path could represent a number.
 * 
An example is the root-to-leaf path 1->2->3 which represents the number 123.

Find the total sum of all root-to-leaf numbers.

For example,

    1
   / \
  2   3
The root-to-leaf path 1->2 represents the number 12.
The root-to-leaf path 1->3 represents the number 13.

Return the sum = 12 + 13 = 25.
 *
 */
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
