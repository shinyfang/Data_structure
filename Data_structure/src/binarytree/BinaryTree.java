package binarytree;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class BinaryTree {
	private static class Node{
		Node leftChild;
		Node rightChild;
		int value;
		Node(int data){
			leftChild = null;
			rightChild = null;
			value = data;
		}
	}
	private static List<Node> nodeList = null;
	public void createTree(int[] array) {
		nodeList = new LinkedList<>();
		for (int i = 0; i < array.length; i ++){//�Ȱ�����ת����Node�ڵ�
			nodeList.add(new Node(array[i]));
		}
		//����������
		for (int i = 0; i <= array.length/2 - 1; i ++){
			int left = i*2 + 1;
			if (left < array.length)
				nodeList.get(i).leftChild = nodeList.get(left);
			int right = i*2 + 2;
			if (right < array.length)
				nodeList.get(i).rightChild = nodeList.get(right);
		}
	}
	public void preOrderTraverse(Node node) {
		if (node == null)
			return;
		System.out.print(node.value + " ");
		preOrderTraverse(node.leftChild);
		preOrderTraverse(node.rightChild);
	}
	public void iterativePreOrder(Node node){//ǰ��ǵݹ���ջ����ѹ����������ѹ��������
		if (node == null)
			return;
		Stack<Node> stk = new Stack<Node>();
		stk.push(node);
		while (!stk.empty()){
			Node temp = stk.pop();
			System.out.print(temp.value + " ");
			if (temp.rightChild != null)
				stk.push(temp.rightChild);
			if (temp.leftChild != null)
				stk.push(temp.leftChild);
		}
	}
	public void inOrderTraverse(Node node) {
		if (node == null)
			return;
		inOrderTraverse(node.leftChild);
		System.out.print(node.value+ " ");
		inOrderTraverse(node.rightChild);
	}
	public void iterativeInOrder(Node node) {
		if (node == null)
			return;
		Stack<Node> stk = new Stack<Node>();
		Node t = node;
		while (t != null || !stk.empty()){
			while (t != null){//����ѹ��������
				stk.push(t);
				t = t.leftChild;
			}
			if (!stk.empty()){
				Node temp = stk.pop();
				System.out.print(temp.value + " ");
				t = temp.rightChild;
			}
		}
	}
	public void postOrderTraverse(Node node) {
		if (node == null)
			return;
		postOrderTraverse(node.leftChild);
		postOrderTraverse(node.rightChild);
		System.out.print(node.value+ " ");
	}
	public void iterativePostOrder(Node node) {
		if (node == null)
			return;
		Node pNode = node;
		Node preNode = null;//�����ϴε����Ľڵ�
		Stack<Node> stk = new Stack<Node>();
		while (pNode != null || !stk.empty()){
			while (pNode != null){
				stk.push(pNode);
				pNode = pNode.leftChild;
			}
			pNode = stk.peek().rightChild;//stk�ﶥ�˵�����������
			if (pNode == null || pNode == preNode){//����������������������������Ѿ����ʹ���
				preNode = stk.pop();//��ô�������������Ұ�preNode���Ϊ�����
				System.out.print(preNode.value+" ");
				//�������������������ôpNode=null���´η���ʱ������Ƚ�stk���˵���
				//������������������������Ѿ����ʹ��ˣ���ôҪ��pNode=null�������´βŻ����stk���˵���
				pNode = null;
			}
			//���������������������û�з��ʹ�����ô�´λὫpNodeѹ��stk��
		}
	}
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int[] array = {1,2,3,4,5,6,7,8};
		BinaryTree tree = new BinaryTree();
		tree.createTree(array);
		Node root = nodeList.get(0);//nodeList��ʱ�Ѿ�����ʼ���ˣ���һ������ľ��Ǹ��ڵ�
		tree.preOrderTraverse(root);
		System.out.println("");
		tree.iterativePreOrder(root);
		System.out.println("");
		tree.inOrderTraverse(root);
		System.out.println("");
		tree.iterativeInOrder(root);
		System.out.println("");
		tree.postOrderTraverse(root);
		System.out.println("");
		tree.iterativePostOrder(root);
	}

}
