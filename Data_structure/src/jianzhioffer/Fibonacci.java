package jianzhioffer;
//�Ʋ��������У�һ�ֵݹ飬һ�ּ�סǰ������
/**
 * 
 * @author speech
 * �����������԰�n��̨��ʱ������������n�ĺ�������Ϊf(n)
 * ��n>2ʱ����һ������ʱ��������ֲ�ͬ��ѡ��һ�ǵ�һ��ֻ��1��
 * ��ʱ������Ŀ���ں���ʣ�µ�n-1��̨�׵�������Ŀ����Ϊf(n-1);��һ��ѡ���ǵ�һ����2��
 * ��ʱ������Ŀ���ں���ʣ��n-2��̨�׵�������Ŀ����Ϊf(n-2)����ˣ�n��̨�׵Ĳ�ͬ����������f(n)=f(n-1)+f(n-2)
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
		// TODO �Զ����ɵķ������
		Fibonacci f = new Fibonacci();
		System.out.println(f.fib2(10));
	}

}
