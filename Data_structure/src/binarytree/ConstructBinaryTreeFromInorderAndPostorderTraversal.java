package binarytree;



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
