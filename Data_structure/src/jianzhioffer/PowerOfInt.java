package jianzhioffer;
//��ֵ�������η�������base����0��ָ������0���
//��logn����
//��λ����>>�������2
//��&0x1�����ж���ż
public class PowerOfInt {
	public double pow(double base, int pow){
		if (pow == 0)
			return 1;
		if (pow == 1)
			return base;
		double re = pow(base,pow>>1);//�η�����2
		re = re*re;
		if ((pow & 0x1) == 1)//����
			re = base*re;
		return re;
	}
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		PowerOfInt f = new PowerOfInt();
		System.out.println(f.pow(-2.3,2));
	}

}
