package binarytree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
//层序遍历
//用队列存储每一层的节点；每一层节点弹出的时候把它的左右子树也加到队列中
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
