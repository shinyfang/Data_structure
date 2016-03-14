package binarytree;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import binarytree.SameTree.TreeNode;
//前序遍历
//用一个栈；记住每次压入节点的时候，先压入右节点，再压入左节点
//因为下次从栈里弹出时，才会从左节点开始弹出
public class BinaryTreePreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> re = new ArrayList<>();
        if (root == null)
        	return re;
        Stack<TreeNode> stk = new Stack<TreeNode>();
        stk.push(root);
        while (!stk.empty()){
        	TreeNode tempNode = stk.pop();
        	re.add(tempNode.val);
        	if (tempNode.right != null)
        		stk.push(tempNode.right);
        	if (tempNode.left != null)
        		stk.push(tempNode.left);
        }
        return re;
    }
}
