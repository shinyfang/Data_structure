package jianzhioffer;

import java.util.Stack;
//实现包含min函数的栈
//stack用的时候一定要记得new出来！！！
public class MinStack {
	public Stack<Integer> stk1 = new Stack<Integer>();
	public Stack<Integer> stk2 = new Stack<Integer>();
    public void push(int node) {
        if (stk1.empty()){
        	stk1.push(node);
        	stk2.push(node);
        }
        else{
        	stk1.push(node);
        	stk2.push(stk2.peek()<node?stk2.peek():node);
        }
    } 
    public void pop() {
    	if (!stk1.empty()){
	    	stk1.pop();
	    	stk2.pop();
    	}
    }  
    public int top() {
        return stk1.peek();
    }  
    public int min() {
    	return stk2.peek();
    }
}
