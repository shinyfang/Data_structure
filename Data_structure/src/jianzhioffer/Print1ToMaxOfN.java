package jianzhioffer;
//��ӡ��1������nλ��
//�������⣬������ַ�������ʾ
//�����ӷ��Ƚ��鷳������ȫ���еķ���
public class Print1ToMaxOfN {
	public void print1ToMax(int n){
		if (n < 1)
			return;
		for (int i = 1;i <= n; i ++){
			printTo("",i);
		}
	}
	public void printTo(String s, int len){
		//System.out.println(s.length());
		if (s.length() == len){
			print(s);
			return;
		}
		for (int i = 0; i < 10; i ++){
			String temp = s + i + "";
			printTo(temp,len);
		}
	}
	public void print(String s){
		int size = -1;
		for (int i = 0; i < s.length(); i ++){
			if (s.charAt(i) == '0')
				size = i;
			else
				break;
		}
		if (size == s.length()-1)
			return;
		System.out.println(s.substring(size+1));
	}
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Print1ToMaxOfN f = new Print1ToMaxOfN();
		f.print1ToMax(2);
	}

}
