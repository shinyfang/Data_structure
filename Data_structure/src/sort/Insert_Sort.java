package sort;
//��������
public class Insert_Sort {
	public void Sort(int[] nums) {
		for (int i = 1; i < nums.length; i ++)
		{
			if (nums[i] < nums[i-1]) //������������С��ǰһ������˵��Ҫ���¶�λ�����Ҫ�����λ��
			{
				int temp = nums[i];
				int j = i - 1;
				while (j >= 0 && nums[j] > temp)//��������������ϵ������ţ�ȥ���������λ��
				{//�������ȶ��ģ�����ĳ������ȣ����������������
					nums[j+1] = nums[j];
					j--;
				}
				nums[j+1] = temp;
			}
		}
	}
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int[] nums = {3,1,5,7,2,4,9,6};
		Insert_Sort s = new Insert_Sort();
		s.Sort(nums);
		for (int i = 0; i < nums.length; i ++)
			System.out.println(nums[i]+" ");
	}

}
