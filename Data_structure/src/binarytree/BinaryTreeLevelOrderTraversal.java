package binarytree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
//≤„–Ú±È¿˙

public class BinaryTreeLevelOrderTraversal {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> re = new LinkedList<List<Integer>>();
        if (root == null)
        	return re;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        int len = 1;
        while (!q.isEmpty()){
        	List<Integer> temp = new LinkedList<Integer>();
        	for (int i = 0; i < len; i ++){
        		TreeNode tNode = q.poll();
        		temp.add(tNode.val);
        		if (tNode.left != null)
        			q.add(tNode.left);
        		if (tNode.right != null)
        			q.add(tNode.right);
        	}
        	re.add(temp);
        	len = q.size();
        }
        return re;
    }
}
