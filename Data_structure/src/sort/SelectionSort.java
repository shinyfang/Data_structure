package sort;
public class SelectionSort {
	public void Sort(int[] nums){
		//每次循环都去找最小的数
		for (int i = 0; i < nums.length - 1; i ++){
			int changeId = i;
			int min = nums[i];
			for (int j = i + 1; j < nums.length; j ++){
				if (nums[j] < min){
					changeId = j;
					min = nums[j];
				}
			}
			swap(nums,i,changeId);//每次把找到的最小的数与i交换
		}
	}
	public void swap(int[] num, int a, int b) {
		int temp = num[a];
		num[a] = num[b];
		num[b] = temp;
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] nums = {3,1,5,7,2,4,9,6};
		SelectionSort s = new SelectionSort();
		s.Sort(nums);
		for (int i = 0; i < nums.length; i ++)
			System.out.println(nums[i]+" ");
	}

}
