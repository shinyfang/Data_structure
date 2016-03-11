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
		for (int i = 0; i < array.length; i ++){//先把数组转换成Node节点
			nodeList.add(new Node(array[i]));
		}
		//建立二叉树
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
	public void iterativePreOrder(Node node){//前序非递归用栈，先压入右子树再压入左子树
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
			while (t != null){//不断压入左子树
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
		Node preNode = null;//保存上次弹出的节点
		Stack<Node> stk = new Stack<Node>();
		while (pNode != null || !stk.empty()){
			while (pNode != null){
				stk.push(pNode);
				pNode = pNode.leftChild;
			}
			pNode = stk.peek().rightChild;//stk里顶端的数的右子树
			if (pNode == null || pNode == preNode){//如果不存在右子树，或者右子树已经访问过了
				preNode = stk.pop();//那么输出这个数，并且把preNode标记为这个数
				System.out.print(preNode.value+" ");
				//如果不存在右子树，那么pNode=null，下次访问时会继续比较stk顶端的数
				//如果存在右子树并且右子树已经访问过了，那么要讲pNode=null，这样下次才会访问stk顶端的数
				pNode = null;
			}
			//如果存在右子树且右子树没有访问过，那么下次会将pNode压入stk中
		}
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] array = {1,2,3,4,5,6,7,8};
		BinaryTree tree = new BinaryTree();
		tree.createTree(array);
		Node root = nodeList.get(0);//nodeList此时已经被初始化了，第一个数存的就是根节点
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
