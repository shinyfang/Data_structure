package binarytree;

import binarytree.SameTree.TreeNode;

//�ж϶������Ƿ��Ǿ���ԳƵ�
//ע�⿼��null���
//���ϵĶԱ�����������ڵ������������ҽڵ㣻���������ҽڵ�������������ڵ�
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
