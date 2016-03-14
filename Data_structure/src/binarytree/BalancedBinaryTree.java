package binarytree;

import binarytree.SameTree.TreeNode;
//�ж��Ƿ��Ƕ���ƽ����
//�ݹ�ֱ��null����0��Ȼ��Ƚϵ�ǰ�ڵ���������������
public class BalancedBinaryTree {
	public int isB(TreeNode root) {
		if (root == null)
			return 0;
		int left = isB(root.left);
		int right = isB(root.right);
		if (left >= 0 && right >= 0 && Math.abs(left-right) <= 1)//Ҫ��֤��������ҲҪ��ƽ��
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
