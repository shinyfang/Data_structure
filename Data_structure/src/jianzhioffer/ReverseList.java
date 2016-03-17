package jianzhioffer;

//反转链表
//三个指针

public class ReverseList {
    public ListNode ReverseList1(ListNode head) {
    	if (head == null || head.next == null)
    		return head;
    	ListNode p1 = head;
    	ListNode p2 = head.next;
    	while (p1 != null && p2 != null){
    		ListNode temp = (p2.next == null?null:p2.next);
    		p2.next = p1;
    		if (p1 == head)
    			p1.next = null;
    		if (temp == null)
    			return p2;
    		p1 = p2;
    		p2 = (temp == null?null:temp);
    	}
    	return p1;
    }
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ReverseList r = new ReverseList();
		ListNode root = new ListNode(1);
		root.next = new ListNode(2);
		root.next.next = new ListNode(3);
		ListNode re = r.ReverseList1(root);
		while (re != null){
			System.out.println(re.val);
			re = (re.next != null?re.next:null);
		}
	}
}
