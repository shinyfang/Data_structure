package jianzhioffer;

import java.util.Stack;

//比较是不是栈的弹出序列
//模拟栈的压入弹出
//栈的pop如果不是当前popA的值，那么不断压入；如果是则弹出
public class IsPopOrder {
    public boolean IsPopOrder1(int [] pushA,int [] popA) {
        if (pushA.length == 0 || popA.length == 0)
        	return false;
        Stack<Integer> stk = new Stack<Integer>();
        int index = 1;//表示push中可以push的元素
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
		// TODO 自动生成的方法存根

	}

}
