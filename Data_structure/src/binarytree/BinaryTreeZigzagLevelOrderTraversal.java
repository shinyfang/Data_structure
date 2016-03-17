package binarytree;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import binarytree.SameTree.TreeNode;
/***��������ı��֣�zigzag
 * 
 * @author speech
 *    
 *  3
   / \
  9  20
    /  \
   15   7
return its zigzag level order traversal as:
[
  [3],
  [20,9],
  [15,7]
]
 */
public class BinaryTreeZigzagLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    	List<List<Integer>> re = new LinkedList<List<Integer>>();
    	if (root == null)
    		return re;
    	boolean direction = true;//����Ǵ������һ��Ǵ�������
    	LinkedList<TreeNode> q = new LinkedList<TreeNode>();
    	q.add(root);
        while (!q.isEmpty()){
        	List<Integer> cur =  new LinkedList<Integer>();
        	if (direction){//�������Ҷ�����������ģ���ǰ��ѹ��
        		int size = q.size();
        		while (size != 0){
        			TreeNode temp = q.pollLast();
        			cur.add(temp.val);
        			if (temp.left != null)
        				q.add(0, temp.left);
        			if (temp.right != null)
        				q.add(0,temp.right);
        			size --;
        		}
        		re.add(cur);
        		direction = false;
        	}
        	else{//���������������ǰ��ģ�������ѹ��
        		int size = q.size();
        		while (size != 0){
        			TreeNode temp = q.pollFirst();
        			cur.add(temp.val);
        			if (temp.right !=  null)
        				q.add(temp.right);
        			if (temp.left != null)
        				q.add(temp.left);
        			size --;
        		}
        		re.add(cur);
        		direction = true;
        	}
        }
        return re;
    }
}
