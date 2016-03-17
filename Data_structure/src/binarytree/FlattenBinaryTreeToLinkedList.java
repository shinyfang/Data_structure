package binarytree;

import java.util.Stack;

import binarytree.SameTree.TreeNode;
//�Ѷ�������ƽ��һ������
//��������ǰ��������������˳�����Կ�������ǰ���������������
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
        	temp.left = null;//��Ϊ����������������Ҫ��Ϊnull
        	if (!stk.empty())//���������ž�������������
        		temp.right = stk.peek();
        }
    }
    public void flatten2(TreeNode root){//���ַ���Ҫ��һ��
    	//�ڶ��ַ������ݹ�������������ת��������֮���ٽ�����������
    	if (root == null)
    		return;
    	flatten2(root.left);
    	flatten2(root.right);
    	if (root.left != null){
    		TreeNode temp = root.left;//��ʱ���������Ѿ�ת��Ϊ����������ֻ��Ҫ�ҵ���������е����һ��ָ���ұ������ͷ����
    		while (temp.right != null)
    			temp = temp.right;//�������������һ���ڵ�
    		temp.right = root.right;//��������������������
    		root.right = root.left;//��ʱҪ�Ѹ��ڵ�root���������Ƶ������ұ���
    		root.left = null;
    	}
    }
}
