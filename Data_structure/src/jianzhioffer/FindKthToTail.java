package jianzhioffer;

//��������k���ڵ��ֵ
//˫ָ�뷨����ʼʱp1λ���׽ڵ㣬p2λ������k-1����Ȼ������ͬʱ����������
//ֱ��p2�����һ���ڵ�ʱ��p1��Ϊ�������k-1���������ǵ�����k���ڵ�
//��Ӧ����Ŀ���У���������м�ڵ㡪��>˫ָ�룬һ��һ��
//�ж�һ�����������Ƿ��γ��˻�����>˫�ڵ㣬һ��һ������������Ƿ�׷��������
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
		// TODO �Զ����ɵķ������
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
