package jianzhioffer;

//合并两个排序的链表
//申请一个head指向第一个指针
//注意考虑null的情况
public class MergeLinkList {
    public ListNode Merge(ListNode list1,ListNode list2) {
        if (list1 == null)
        	return list2;
        if (list2 == null)
        	return list1;
        ListNode head = new ListNode(-1);
        ListNode p = head;
        while (list1 != null || list2 != null){
        	if (list1 == null){
        		p.next = list2;
        		return head.next;
        	}
        	if (list2 == null){//如果其中一个链表已经比较完了，那直接连上另一个链表返回即可
        		p.next = list1;
        		return head.next;
        	}
        	while ((list1 != null) && (list2 != null) && (list1.val <= list2.val)){
        		p.next = list1;
        		list1 = (list1.next==null?null:list1.next);
        		p = p.next;
        	}
        	while ((list1 != null) && (list2 != null) && (list1.val > list2.val)){
        		p.next = list2;
        		list2 = (list2.next==null?null:list2.next);
        		p = p.next;
        	}
        }
        return head.next;
    }
	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}
