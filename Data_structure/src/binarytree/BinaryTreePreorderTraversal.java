package binarytree;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import binarytree.SameTree.TreeNode;
//Ç°Ðò±éÀú
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
