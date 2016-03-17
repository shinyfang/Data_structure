package jianzhioffer;
//数值的整数次方，考虑base正负0，指数正负0情况
//用logn方法
//用位运算>>代替除以2
//用&0x1代替判断奇偶
public class PowerOfInt {
	public double pow(double base, int pow){
		if (pow == 0)
			return 1;
		if (pow == 1)
			return base;
		double re = pow(base,pow>>1);//次方除以2
		re = re*re;
		if ((pow & 0x1) == 1)//奇数
			re = base*re;
		return re;
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		PowerOfInt f = new PowerOfInt();
		System.out.println(f.pow(-2.3,2));
	}

}
