package jianzhioffer;
//从头到尾打印链表
//递归，相当于先递归下一个，再打印当前节点
class LinkNode{
	LinkNode next;
	int val;
	LinkNode(int x){val = x;}
}
public class PrintLinklist {
	public void printLink(LinkNode root){
		if (root == null)
			return;
		printLink(root.next);
		System.out.println(root.val);
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		PrintLinklist p = new PrintLinklist();
		LinkNode l = new LinkNode(1);
		l.next = new LinkNode(2);
		l.next.next = new LinkNode(3);
		p.printLink(l);
	}

}
