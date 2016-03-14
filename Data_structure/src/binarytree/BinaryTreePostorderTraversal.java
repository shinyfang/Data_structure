package binarytree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import binarytree.SameTree.TreeNode;
//��һ��ջ�Ϳ��ԣ�����Ҫ������һ�������Ľڵ�
//ÿ�ε�����ʱ��Ҫ�Ƚ��Ƿ����ҽڵ㣻���û�еĻ�ֱ�ӵ���������еĻ�������һ�ε������ǲ����ҽڵ㣻
//����ҽڵ���һ���Ѿ������ˣ�˵����ǰ�ڵ���Ե�����
//����ҽڵ���һ�λ�û������˵��Ӧ������������������Ҳ���ǰ��ҽڵ�ѹ��ջ��
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
