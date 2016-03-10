package sort;
public class BubbleSort {
	public void Sort(int[] nums){
		for (int i = 0; i < nums.length - 1; i ++){
			for (int j = 0; j < nums.length - i - 1; j ++){//��ʾ��αȽ�Ҫ�Ƚϵ���λ��
				if (nums[j] > nums[j+1])//�Ѵ���������ţ�����ÿ��������length-iλ���ϵ���֮��Ͳ����ٱȽ�
				{
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
			}
		}
	}
	public void RecursiveSort(int[] nums, int p, int q){
		if (p < q)
		{
			ReSort(nums,p,q);
			RecursiveSort(nums, p, q-1);
		}
	}
	public void ReSort(int[] nums, int p, int q){
		for (int i = 0; i < q; i ++){
			if (nums[i] > nums[i+1])
			{
				int temp = nums[i];
				nums[i] = nums[i+1];
				nums[i+1] = temp;
			}
		}
	}
	public void UpdateSort(int[] nums){
		int flag = nums.length - 1;//�´�����Ƚϵ���λ��
		while (flag > 0){
			int temp = 0;//��¼ÿ�����������������һ����
			for (int i = 0; i < flag; i ++){
				if (nums[i] > nums[i+1])
				{
					temp = i;
					int temp2 = nums[i];
					nums[i] = nums[i+1];
					nums[i+1] = temp2;				
				}
			}
			flag = temp;//�´α����ʹ��⿪ʼ
		}
	}
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int[] nums = {3,1,5,7,2,4,9,6};
		BubbleSort s = new BubbleSort();
		//s.Sort(nums);
		//s.RecursiveSort(nums, 0, nums.length-1);
		s.UpdateSort(nums);
		for (int i = 0; i < nums.length; i ++)
			System.out.println(nums[i]+" ");
	}

}
