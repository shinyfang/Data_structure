package binarytree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import binarytree.SameTree.TreeNode;
//中序遍历
//用栈，不断压入左子树，弹出节点时压入右子树；
public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> re = new ArrayList<Integer>();
        if (root == null)
        	return re;
        Stack<TreeNode> stk = new Stack<TreeNode>();
        while (!stk.empty() || root != null){
        	while (root != null){
        		stk.push(root);
        		root = root.left;
        	}
        	TreeNode tempNode = stk.pop();
        	re.add(tempNode.val);
        	if (tempNode.right != null)
        		root = tempNode.right;
        }
        return re;
    }
}
