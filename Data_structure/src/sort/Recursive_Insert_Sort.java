package sort;
public class Recursive_Insert_Sort {
	public void Recursive(int[] nums, int p, int q){
		if (p < q)
		{
			Recursive(nums, p, q-1);
			Insert(nums, p, q);//�ݹ�Ķ�q����
		}
	}
	public void Insert(int[] nums, int p, int q){//q�Ǵ�����
		if (nums[q] < nums[q-1])
		{
			int temp = nums[q];
			int j = q - 1;
			while (j >= p && nums[j] > temp)
			{
				nums[j+1] = nums[j];
				j --;
			}
			nums[j+1] = temp;
		}
	}
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int[] nums = {3,1,5,7,2,4,9,6};
		Recursive_Insert_Sort s = new Recursive_Insert_Sort();
		s.Recursive(nums,0,nums.length - 1);
		for (int i = 0; i < nums.length; i ++)
			System.out.println(nums[i]+" ");
	}

}
