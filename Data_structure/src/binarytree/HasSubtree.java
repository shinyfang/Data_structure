package binarytree;

import binarytree.BinaryTreeLevelOrderTraversal.TreeNode;
//判断树的子结构
//递归
//每次比较tree1的节点是否=tree2的根节点
//如果相等；则进入递归程序里；不断比较两者的左右子树是否相等
public class HasSubtree {
	boolean Tree1HasTree2(TreeNode root1, TreeNode root2){
		if (root2 == null)//说明root2已经比较完毕
			return true;
		if (root1 == null)//root2没完，root1反倒完了
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
