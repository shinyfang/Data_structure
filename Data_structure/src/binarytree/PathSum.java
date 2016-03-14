package binarytree;

import binarytree.SameTree.TreeNode;
//二叉树中是否存在和为某值的路径
//递归
//记录当前的和；如果遍历到叶节点判断是否与sum相等
public class PathSum {
	public boolean pathdfs(TreeNode root, int res, int sum) {
		res += root.val;
		if (root.left == null && root.right == null && sum == res)
			return true;
		if (root.left != null){
			if (pathdfs(root.left, res, sum))
				return true;
		}
		if (root.right != null){
			if (pathdfs(root.right, res, sum))
				return true;
		}
		return false;
	}
    public boolean hasPathSum(TreeNode root, int sum) {
    	if (root == null)
    		return false;
        return pathdfs(root,0,sum);
    }
}
