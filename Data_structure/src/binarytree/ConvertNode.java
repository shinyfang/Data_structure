package binarytree;

//二叉搜索树按后序遍历转换为双向链表
//要注意的是java中的形参，相当于复制了一份副本，在函数里修改他的指向不能回传
//递归；用一个全局变量去记录已经构造的双向链表的尾节点，然后当前节点要和尾节点连接起来；
//此时更新尾节点=当前节点；递归右子树
public class ConvertNode {
	public static class TreeNode{
		TreeNode left;
		TreeNode right;
		int value;
		TreeNode(int data){
			left = null;
			right = null;
			value = data;
		}
	}
	public TreeNode lastNode;
	public void conver(TreeNode root) {
		if (root == null)
			return;
		if (root.left != null)
			conver(root.left);
		root.left = lastNode;
		if (lastNode != null)
			lastNode.right = root;
		lastNode = root;
		if (root.right != null)
			conver(root.right);
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(6);
		root.right = new TreeNode(14);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(8);
		root.right.left = new TreeNode(12);
		root.right.right = new TreeNode(16);
		ConvertNode s = new ConvertNode();
		s.conver(root);
		TreeNode pNode = s.lastNode;
		while (pNode != null && pNode.left != null){
			System.out.println(pNode.value);
			pNode = pNode.left;
		}
		
	}
}
