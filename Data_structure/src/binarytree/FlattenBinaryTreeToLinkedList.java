package binarytree;

import java.util.Stack;

import binarytree.SameTree.TreeNode;
//把二叉树扁平成一个链表
//二叉树的前序遍历就是链表的顺序，所以可以利用前序遍历来构造链表
public class FlattenBinaryTreeToLinkedList {
    public void flatten(TreeNode root) {
    	if (root == null)
    		return;
        Stack<TreeNode> stk = new Stack<TreeNode>();
        stk.push(root);
        while (!stk.empty()){
        	TreeNode temp = stk.pop();
        	if (temp.right != null)
        		stk.push(temp.right);
        	if (temp.left != null)
        		stk.push(temp.left);
        	temp.left = null;//因为是链表，所以左子树要置为null
        	if (!stk.empty())//链表后面跟着就是它的左子树
        		temp.right = stk.peek();
        }
    }
    public void flatten2(TreeNode root){//这种方法要快一点
    	//第二种方法，递归左右子树，都转换成链表之后，再将它们连起来
    	if (root == null)
    		return;
    	flatten2(root.left);
    	flatten2(root.right);
    	if (root.left != null){
    		TreeNode temp = root.left;//此时左右子树已经转换为了链表，我们只需要找到左边链表中的最后一个指向右边链表的头即可
    		while (temp.right != null)
    			temp = temp.right;//找左边链表的最后一个节点
    		temp.right = root.right;//把左右两个链表连起来
    		root.right = root.left;//此时要把根节点root的左子树移到它的右边来
    		root.left = null;
    	}
    }
}
