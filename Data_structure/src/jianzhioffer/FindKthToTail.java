package jianzhioffer;

//链表倒数第k个节点的值
//双指针法，初始时p1位于首节点，p2位于先走k-1步，然后两者同时不断往后走
//直到p2是最后一个节点时，p1因为与它相差k-1步，所以是倒数第k个节点
//对应的题目还有：求链表的中间节点——>双指针，一快一慢
//判断一个单向链表是否形成了环——>双节点，一快一慢，看看快的是否追上了慢的
class ListNode {
    int val;
    ListNode next = null;
    ListNode(int val) {
        this.val = val;
    }
}
public class FindKthToTail {
    public ListNode FindKthToTail1(ListNode head,int k) {
    	if (head == null || k == 0)
    		return null;
    	ListNode p1 = head;
    	ListNode p2 = head;
    	k --;
    	while (k != 0){
    		if (p2.next != null)
    			p2 = p2.next;
    		else
    			return null;
    		k --;
    	}
    	while (p2.next != null){
    		p1 = p1.next;
    		p2 = p2.next;
    	}
    	return p1;
    }
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		FindKthToTail f = new FindKthToTail();
		ListNode root = new ListNode(1);
		root.next = new ListNode(2);
		root.next.next = new ListNode(3);
		root.next.next.next = new ListNode(4);
		root.next.next.next.next = new ListNode(5);
		root.next.next.next.next.next = new ListNode(6);
		System.out.println(f.FindKthToTail1(root,7).val);
	}

}
