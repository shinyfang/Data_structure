package binarytree;


//从中序和后序中重建出二叉树
//后序的最后一个元素就是根节点；
//递归；每次都找后序的最后一个元素，同时对应着找中序中这个元素，在中序中这个元素相当于将左右子树分开了
//所以再对左右子树递归以上找的过程
//注意要用int记住中序的开始结尾和后序的结尾
public class ConstructBinaryTreeFromInorderAndPostorderTraversal {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	public TreeNode buildT(int[] inorder, int[] postorder, int inStart, int inEnd, int postEnd) {
		if (inStart > inEnd)
			return null;
		TreeNode root = new TreeNode (postorder[postEnd]);
		int index = inStart;
		while (index <= inEnd && inorder[index] != postorder[postEnd])
			index ++;
		root.left = buildT(inorder, postorder, inStart, index-1, postEnd-(inEnd-index)-1);
		root.right = buildT(inorder, postorder, index+1, inEnd, postEnd-1);
		return root;
	}
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder.length == 0 || postorder.length == 0)
        	return null;
        return buildT(inorder,postorder,0,inorder.length-1,postorder.length-1);
    }
	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}
