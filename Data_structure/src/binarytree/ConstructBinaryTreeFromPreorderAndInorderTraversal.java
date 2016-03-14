package binarytree;

import java.util.Arrays;

import binarytree.SameTree.TreeNode;

//前序中序重建二叉树
//前序中第一个元素是根；对应在中序中这个数会把左右子树分开
//递归；每次找到这个元素，递归它的左右子树
public class ConstructBinaryTreeFromPreorderAndInorderTraversal {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	public TreeNode buildT(int[] preorder, int[] inorder, int preStart, int inStart, int inEnd) {
		if (inStart > inEnd)
			return null;
		TreeNode root = new TreeNode(preorder[preStart]);
		int index = inStart;
		while (index <= inEnd && inorder[index] != preorder[preStart])
			index++;
		root.left = buildT(preorder, inorder, preStart+1, inStart, index-1);
		root.right = buildT(preorder, inorder, preStart+(index-inStart)+1, index+1, inEnd);
		return root;
	}
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0 || inorder.length == 0)
        	return null;
        return buildT(preorder,inorder,0,0,inorder.length-1);
    }
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] pre = {1,2,3};
		int[] in = {3,2,1};
		ConstructBinaryTreeFromPreorderAndInorderTraversal s = new ConstructBinaryTreeFromPreorderAndInorderTraversal();
		TreeNode root = s.buildTree(pre, in);
	}
}