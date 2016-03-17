package binarytree;

import binarytree.SameTree.TreeNode;

//判断二叉树是否是镜面对称的
//注意考虑null情况
//不断的对比左子树的左节点与右子树的右节点；左子树的右节点与右子树的左节点
public class SymmetricTree {
	public boolean isS(TreeNode tree1, TreeNode tree2){
		if (tree1 == null && tree2 == null)
			return true;
		if (tree1 == null || tree2 == null)
			return false;
		if (tree1.val == tree2.val){
			return (isS(tree1.left,tree2.right)&&isS(tree1.right,tree2.left));
		}
		return false;
	}
    public boolean isSymmetric(TreeNode root) {
    	if (root == null)
    		return true;
    	return isS(root.left,root.right);
    }
}
