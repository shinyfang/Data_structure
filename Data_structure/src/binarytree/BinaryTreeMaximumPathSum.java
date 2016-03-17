package binarytree;

import binarytree.SameTree.TreeNode;

//�������������ڵ����ɵ�·�������·����
//ֻ���ú��������˼�룬ѡ���Ǻ����������Ż��Ǻ����������ţ����Ƕ�����
public class BinaryTreeMaximumPathSum {
	public int max;
	public int maxPath(TreeNode root){//���ص���ÿ���ڵ��������������������ɵ����ֵ
		if (root == null)
			return 0;
		int left = maxPath(root.left);
		int right = maxPath(root.right);
		//����ֵ���ǵ���root�������������ɵ�·���������Ļ�����ȥ��root���ܷ��������ڵ�����
		//ȫ��max���ǵ���root���������ɵ�·��
		//��Ϊһ��root����������һ�𣬾Ͳ����ٴ�root���������ط�������
		int m = root.val;
		if (left > 0)
			m += left;
		if (right > 0)
			m += right;
		max = (m>max?m:max);
		return (root.val+(Math.max(left,right)>0?Math.max(left,right):0));
	}
    public int maxPathSum(TreeNode root) {
        if (root == null)
        	return 0;
        max = root.val;
        maxPath(root);
        return max;
    }
}
