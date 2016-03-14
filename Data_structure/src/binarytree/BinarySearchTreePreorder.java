package binarytree;

import binarytree.BinaryTreeLevelOrderTraversal.TreeNode;
//�ж�һ�������ǲ��Ƕ����������ĺ������
//�����������ĺ�����������һ���ڵ��Ǹ��ڵ㣬������ȫ����С�ڸ��ڵ㣬������ȫ�������ڸ��ڵ�
//���ҳ��������ķ�Χ����ȷ���������Ƿ���ϴ��ڸ��ڵ��ֵ������
public class BinarySearchTreePreorder {
	public boolean isPre(int[] nums, int begin, int end) {
		if (begin == end)
			return true;
		int root = nums[end];
		int index = begin;
		while (index < end && nums[index] < root){
			index ++;
		}//�ҵ��������Ŀ�ʼ��
		for (int i = index; i < end; i ++){
			if (nums[i] <= root)//���������С��root��˵��������
				return false;
		}
		boolean left = true;
		if (index > begin)//���������Ϊ�գ���ô�������ж�������
			left = isPre(nums, begin, index-1);
		boolean right = true;
		if (index < end)//���������Ϊ�գ����ж�
			right = isPre(nums, index, end-1);
		return (left && right);
	}
	public boolean isPreorder(int[] nums) {
		if (nums.length == 0)
			return false;
		if (nums.length == 1)
			return true;
		return isPre(nums,0,nums.length-1);//Ҫ�涨�Ƚϵ�����
	}
}
