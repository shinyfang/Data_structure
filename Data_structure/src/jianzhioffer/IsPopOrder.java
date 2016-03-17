package jianzhioffer;

import java.util.Stack;

//�Ƚ��ǲ���ջ�ĵ�������
//ģ��ջ��ѹ�뵯��
//ջ��pop������ǵ�ǰpopA��ֵ����ô����ѹ�룻������򵯳�
public class IsPopOrder {
    public boolean IsPopOrder1(int [] pushA,int [] popA) {
        if (pushA.length == 0 || popA.length == 0)
        	return false;
        Stack<Integer> stk = new Stack<Integer>();
        int index = 1;//��ʾpush�п���push��Ԫ��
        stk.push(pushA[0]);
        for (int i = 0; i < popA.length; i ++){
        	if (stk.peek() == popA[i])
        		stk.pop();
        	else{
        		while ((index < pushA.length) && (pushA[index] != popA[i])){
        			stk.push(pushA[index]);
        			index ++;
        		}
        		if (index == pushA.length)
        			return false;
        		index ++;
        	}
        }
        return true;
    }
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

	}

}
