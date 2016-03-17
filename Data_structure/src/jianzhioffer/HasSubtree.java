package jianzhioffer;

//树的子结构
//递归
//注意两个数不管哪个输入null都返回false
public class HasSubtree {
	public class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;
	   }
	}
	public boolean HasSub(TreeNode root1, TreeNode root2){
		if (root1 == null || root2 == null)
			return false;
		if (root1.val == root2.val){
			return (HasSub(root1.left,root2.left)&&HasSub(root1.right,root2.right));
		}
		else
			return false;
	}
    public boolean HasSubtree1(TreeNode root1,TreeNode root2) {
        if (root2 == null)
        	return true;
        if (root1 == null)
        	return false;
        if (root1.val == root2.val){
        	if (HasSub(root1,root2))
        		return true;
        }
        boolean re = false;
        re = HasSubtree1(root1.left,root2);
        if (re == true)
        	return re;
        re = HasSubtree1(root1.right,root2);
        if (re == true)
        	return re;
        return false;
    }
}
