package jianzhioffer;
//��ͷ��β��ӡ����
//�ݹ飬�൱���ȵݹ���һ�����ٴ�ӡ��ǰ�ڵ�
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
		// TODO �Զ����ɵķ������
		PrintLinklist p = new PrintLinklist();
		LinkNode l = new LinkNode(1);
		l.next = new LinkNode(2);
		l.next.next = new LinkNode(3);
		p.printLink(l);
	}

}
