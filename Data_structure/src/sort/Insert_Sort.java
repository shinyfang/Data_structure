package sort;
//插入排序
public class Insert_Sort {
	public void Sort(int[] nums) {
		for (int i = 1; i < nums.length; i ++)
		{
			if (nums[i] < nums[i-1]) //如果待插入的数小于前一个数，说明要重新定位这个数要插入的位置
			{
				int temp = nums[i];
				int j = i - 1;
				while (j >= 0 && nums[j] > temp)//将比它大的数不断的往后排，去找这个数的位置
				{//排序是稳定的，若与某个数相等，仍排在这个数后面
					nums[j+1] = nums[j];
					j--;
				}
				nums[j+1] = temp;
			}
		}
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] nums = {3,1,5,7,2,4,9,6};
		Insert_Sort s = new Insert_Sort();
		s.Sort(nums);
		for (int i = 0; i < nums.length; i ++)
			System.out.println(nums[i]+" ");
	}

}
