package binarytree;

//�������������������ת��Ϊ˫������
//Ҫע�����java�е��βΣ��൱�ڸ�����һ�ݸ������ں������޸�����ָ���ܻش�
//�ݹ飻��һ��ȫ�ֱ���ȥ��¼�Ѿ������˫�������β�ڵ㣬Ȼ��ǰ�ڵ�Ҫ��β�ڵ�����������
//��ʱ����β�ڵ�=��ǰ�ڵ㣻�ݹ�������
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
		// TODO �Զ����ɵķ������
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
