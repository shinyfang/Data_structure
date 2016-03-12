package binarytree;

import binarytree.BinaryTreeLevelOrderTraversal.TreeNode;

public class ConvertNode {
	public static class TreeNode{
		TreeNode left;
		TreeNode right;
		int value;
		TreeNode(int data){
			left = null;
			right = null;
			value = data;
		}
	}
	public void coverNode(TreeNode root, TreeNode lastNode) {
		TreeNode pNode = root;
		if (pNode.left != null)
			coverNode(pNode.left, lastNode);
		pNode.left = lastNode;//��ǰ�ڵ��������Ϊ�����е����һ��Ԫ��
		if (lastNode != null)
			lastNode.right = pNode;//��������һ��Ԫ�ص�������ָ��ǰ�ڵ�
		lastNode = pNode;
		if (pNode.right != null)
			coverNode(pNode.right, lastNode);
	}
	public TreeNode conver(TreeNode root) {
		if (root == null)
			return null;
		TreeNode lastNode = null;
		coverNode(root,lastNode);//lastNodeָ��������������һ��Ԫ��
		while (lastNode != null && lastNode.left != null)
			lastNode = lastNode.left;
		return lastNode;
	}
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(6);
		root.right = new TreeNode(14);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(8);
		root.right.left = new TreeNode(12);
		root.right.right = new TreeNode(16);
		ConvertNode s = new ConvertNode();
		TreeNode reNode = s.conver(root);
		while (reNode != null){
			System.out.print(reNode.value+" ");
			reNode = reNode.right;
		}
	}
}
