package binarytree;

import binarytree.BinaryTreeLevelOrderTraversal.TreeNode;
//判断一个数组是不是二叉搜索树的后序遍历
//二叉搜索树的后序遍历，最后一个节点是根节点，左子树全部都小于根节点，右子树全部都大于根节点
//先找出左子树的范围，再确认右子树是否符合大于根节点的值的条件
public class BinarySearchTreePreorder {
	public boolean isPre(int[] nums, int begin, int end) {
		if (begin == end)
			return true;
		int root = nums[end];
		int index = begin;
		while (index < end && nums[index] < root){
			index ++;
		}//找到右子树的开始点
		for (int i = index; i < end; i ++){
			if (nums[i] <= root)//如果右子树小于root，说明不满足
				return false;
		}
		boolean left = true;
		if (index > begin)//如果左子树为空，那么不用再判断左子树
			left = isPre(nums, begin, index-1);
		boolean right = true;
		if (index < end)//如果右子树为空，不判断
			right = isPre(nums, index, end-1);
		return (left && right);
	}
	public boolean isPreorder(int[] nums) {
		if (nums.length == 0)
			return false;
		if (nums.length == 1)
			return true;
		return isPre(nums,0,nums.length-1);//要规定比较的区间
	}
}
