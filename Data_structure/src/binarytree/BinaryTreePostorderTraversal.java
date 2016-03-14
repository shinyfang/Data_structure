package binarytree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import binarytree.SameTree.TreeNode;
//用一个栈就可以；但是要保存上一步弹出的节点
//每次弹出的时候要比较是否有右节点；如果没有的话直接弹出，如果有的话看看上一次弹出的是不是右节点；
//如果右节点上一次已经弹出了，说明当前节点可以弹出了
//如果右节点上一次还没弹出，说明应该先让右子树弹出，也就是把右节点压入栈里
public class BinaryTreePostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> re = new ArrayList<Integer>();
        if (root == null)
        	return re;
        Stack<TreeNode> stk = new Stack<TreeNode>();
        TreeNode preNode = null;
        while (!stk.empty() || root != null){
        	while (root != null){
        		stk.push(root);
        		root = root.left;
        	}
        	TreeNode tempNode = stk.peek().right;
        	if (tempNode == null || tempNode == preNode){
        		preNode = stk.pop();
        		re.add(preNode.val);
        		root = null;
        	}
        	else {
				root = tempNode;
			}
        }
        return re;
    }
}
