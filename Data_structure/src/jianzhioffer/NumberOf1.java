package jianzhioffer;

//��������1�ĸ���
//��ԭ����-1������ԭ���������㣬�Ὣ�����Ʊ�ʾ�����ұߵ�1��Ϊ0�����Բ��ϵĽ������ϲ���ֱ��0�ܵõ���������1�ĸ���
//ͬ���ж��Ƿ���2�������η���2�������η��Ķ����Ʊ�ʾһ��ֻ��һ��1��ֱ�������ϲ����ж��Ƿ�Ϊ0
//������������mn��������Ҫ�ı�m�Ķ����Ʊ�ʾ�еĶ���λ���ܵõ�n���Ƚ�mXORn�������߶�����λ��ͬ�ĵط���1��Ȼ�������ϲ����õ�1�ĸ���
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
		// TODO �Զ����ɵķ������
		NumberOf1 f = new NumberOf1();
		System.out.println(f.numberOf1(1));
	}

}
