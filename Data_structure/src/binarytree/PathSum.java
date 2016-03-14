package binarytree;

import binarytree.SameTree.TreeNode;
//���������Ƿ���ں�Ϊĳֵ��·��
//�ݹ�
//��¼��ǰ�ĺͣ����������Ҷ�ڵ��ж��Ƿ���sum���
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
