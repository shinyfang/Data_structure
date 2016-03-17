package binarytree;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import binarytree.SameTree.TreeNode;
//层序遍历的变种
//也是用队列存储
public class BinaryTreeLevelOrderTraversalII {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> re = new LinkedList<List<Integer>>();
        if (root == null)
        	return re;
        LinkedList<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        while (!q.isEmpty()){
        	List<Integer> cur = new LinkedList<Integer>();
        	int size = q.size();
        	while (size != 0){
        		TreeNode temp = q.pollFirst();
        		if (temp.left != null)
        			q.add(temp.left);
        		if (temp.right != null)
        			q.add(temp.right);
        		cur.add(temp.val);
        		size --;
        	}
        	re.add(0,cur);
        }
        return re;
    }
}
