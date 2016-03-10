package sort;
public class BubbleSort {
	public void Sort(int[] nums){
		for (int i = 0; i < nums.length - 1; i ++){
			for (int j = 0; j < nums.length - i - 1; j ++){//表示这次比较要比较到哪位置
				if (nums[j] > nums[j+1])//把大的数往后排，这样每次排完后第length-i位置上的数之后就不用再比较
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
		int flag = nums.length - 1;//下次排序比较到的位置
		while (flag > 0){
			int temp = 0;//记录每次排序发生交换的最后一个点
			for (int i = 0; i < flag; i ++){
				if (nums[i] > nums[i+1])
				{
					temp = i;
					int temp2 = nums[i];
					nums[i] = nums[i+1];
					nums[i+1] = temp2;				
				}
			}
			flag = temp;//下次遍历就从这开始
		}
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] nums = {3,1,5,7,2,4,9,6};
		BubbleSort s = new BubbleSort();
		//s.Sort(nums);
		//s.RecursiveSort(nums, 0, nums.length-1);
		s.UpdateSort(nums);
		for (int i = 0; i < nums.length; i ++)
			System.out.println(nums[i]+" ");
	}

}
