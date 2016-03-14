package binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import binarytree.SameTree.TreeNode;
//二叉树中和为某值的所有路径
//多用一个List去记录
public class PathSumII {
	public void pathDfs(List<List<Integer>> re, TreeNode root, int sum, int count, List<Integer> cur) {
		cur.add(root.val);
		count += root.val;
		if (root.left == null && root.right == null && sum == count){
			re.add(new ArrayList<Integer>(cur));
		}
		else{
			if (root.left != null)
				pathDfs(re, root.left, sum, count, cur);
			if (root.right != null)
				pathDfs(re, root.right, sum, count, cur);
		}
		cur.remove(cur.size()-1);
	}
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
    	List<List<Integer>> re = new LinkedList<List<Integer>>();
    	if (root == null)
    		return re;
        pathDfs(re,root,sum,0,new ArrayList<Integer>());
        return re;
    }
}
