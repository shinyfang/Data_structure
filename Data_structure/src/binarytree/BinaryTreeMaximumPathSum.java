package binarytree;

import binarytree.SameTree.TreeNode;

//找以任意两个节点连成的路径中最大路径和
//只能用后序遍历的思想，选择是和左子树连着还是和右子树连着，还是都不连
public class BinaryTreeMaximumPathSum {
	public int max;
	public int maxPath(TreeNode root){//返回的是每个节点与它左或者右子树能组成的最大值
		if (root == null)
			return 0;
		int left = maxPath(root.left);
		int right = maxPath(root.right);
		//返回值考虑的是root和左或者右能组成的路径，这样的话可以去找root还能否与其他节点连接
		//全局max考虑的是root和左和右组成的路径
		//因为一旦root和左右连在一起，就不能再从root处往其他地方延伸了
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
