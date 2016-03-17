package jianzhioffer;
//菲波那切数列，一种递归，一种记住前两个数
/**
 * 
 * @author speech
 * 青蛙跳：可以把n级台阶时的跳法看成是n的函数，记为f(n)
 * 当n>2时，第一次跳的时候就有两种不同的选择：一是第一次只跳1级
 * 此时跳法数目等于后面剩下的n-1级台阶的跳法数目，即为f(n-1);另一种选择是第一次跳2级
 * 此时跳法数目等于后面剩下n-2级台阶的跳法数目，即为f(n-2)。因此，n级台阶的不同跳法的总数f(n)=f(n-1)+f(n-2)
 *
 */
public class Fibonacci {
	public int fib(int n){
		if (n == 0 || n == 1)
			return 1;
		return (n+fib(n-1));
	}
	public int fib2(int n){
		if (n == 0 || n == 1)
			return 1;
		int pre = 1;
		int cur = 1;
		n = n - 2;
		while (n != 0){
			int temp = pre + cur;
			pre = cur;
			cur = temp;
			n --;
		}
		return cur;
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Fibonacci f = new Fibonacci();
		System.out.println(f.fib2(10));
	}

}
