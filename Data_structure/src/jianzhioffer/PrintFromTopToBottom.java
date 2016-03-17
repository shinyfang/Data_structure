package jianzhioffer;

import java.util.ArrayList;
import java.util.LinkedList;

public class PrintFromTopToBottom {
	public class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;
	    }
	}
    public ArrayList<Integer> PrintFromTopToBottom1(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (root == null)
        	return list;
        LinkedList<TreeNode> q = new LinkedList<TreeNode>();
        q.addLast(root);
        while (!q.isEmpty()){
        	TreeNode temp = q.pollFirst();
        	list.add(temp.val);
        	if (temp.left != null)
        		q.addLast(temp.left);
        	if (temp.right != null)
        		q.addLast(temp.right);
        }
        return list;
    }
}
