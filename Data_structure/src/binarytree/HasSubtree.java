package binarytree;

import binarytree.BinaryTreeLevelOrderTraversal.TreeNode;
//�ж������ӽṹ
public class HasSubtree {
	boolean Tree1HasTree2(TreeNode root1, TreeNode root2){
		if (root2 == null)//˵��root2�Ѿ��Ƚ����
			return true;
		if (root1 == null)//root2û�꣬root1��������
			return false;
		if (root1.val == root2.val)
			return (Tree1HasTree2(root1.left, root2.left) && Tree1HasTree2(root1.right, root2.right));
		else
			return false;
	}
	boolean SubTree(TreeNode root1, TreeNode root2){
		if (root1 == null || root2 == null)
			return false;
		boolean result = false;
		if (root1.val == root2.val){
			result = Tree1HasTree2(root1,root2);
		}
		if (result != true)
			result = SubTree(root1.left, root2);
		if (result != true)
			result = SubTree(root1.right, root2);
		return result;
	}
}
