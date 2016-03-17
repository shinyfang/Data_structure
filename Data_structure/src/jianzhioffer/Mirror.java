package jianzhioffer;

import jianzhioffer.HasSubtree.TreeNode;

//¶þ²æÊ÷µÄ¾µÏñ
public class Mirror {
    public void Mirror1(TreeNode root) {
        if (root == null || ((root.left == null)&&(root.right == null)))
        	return;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        if (root.left != null)
        	Mirror1(root.left);
        if (root.right != null)
        	Mirror1(root.right);
    }
}
