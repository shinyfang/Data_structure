package sort;

public class CountSort {
	public void Sort(int[] num, int max) {
		int[] c = new int[max+1];
		for (int i = 0; i < num.length; i ++){
			c[num[i]] ++;
		}
		for (int i = 1; i < c.length; i ++){
			c[i] = c[i-1] + c[i];
		}
		int[] b = new int[num.length];
		for (int i = num.length - 1; i >= 0; i --){//�Ӻ���ǰ��Ϊ��ʹ�����ȶ�
			b[c[num[i]]-1] = num[i];
			c[num[i]] --;
		}
		for (int i = 0; i < num.length; i ++){
			num[i] = b[i];
		}
	}
	public void test(int[] num, int max) {
		int[] c = new int[max+1];
		for (int i = 0; i < num.length; i ++){
			c[num[i]] ++;
		}
		int index = num.length - 1;
		for (int i = c.length - 1; i >= 0; i --){ //�����Ͳ��ȶ���
			while (c[i] > 0){
				num[index] = i;
				index --;
				c[i] --;
			}
		}
	}
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int[] nums = {3,1,5,7,2,4,9,6};
		CountSort s = new CountSort();
		//s.Sort(nums,9);
		s.test(nums, 9);
		for (int i = 0; i < nums.length; i ++)
			System.out.println(nums[i]+" ");
	}
}
