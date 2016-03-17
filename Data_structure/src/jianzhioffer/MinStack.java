package jianzhioffer;

import java.util.Stack;
//ʵ�ְ���min������ջ
//stack�õ�ʱ��һ��Ҫ�ǵ�new����������
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
