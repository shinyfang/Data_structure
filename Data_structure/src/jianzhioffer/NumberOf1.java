package jianzhioffer;

//二进制中1的个数
//把原整数-1，再与原数做与运算，会将二进制表示中最右边的1置为0，所以不断的进行以上步骤直到0能得到二进制中1的个数
//同理，判断是否是2的整数次方：2的整数次方的二进制表示一定只有一个1，直接做以上操作判断是否为0
//输入两个整数mn，计算需要改变m的二进制表示中的多少位才能得到n：先将mXORn会在两者二进制位不同的地方置1，然后用以上操作得到1的个数
public class NumberOf1 {
	public int numberOf1(int n){
		int count = 0;
		while (n != 0){
			n = (n-1)&n;
			count ++;
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		NumberOf1 f = new NumberOf1();
		System.out.println(f.numberOf1(1));
	}

}
