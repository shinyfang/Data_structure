package sort;
public class QuickSort {
	public void Sort(int[] nums) {
		RecursiveSort(nums,0,nums.length-1);
	}
	public void RecursiveSort(int[] nums, int p, int q) {
		if (p < q){
			int m = Partition(nums,p,q);
			RecursiveSort(nums, p, m-1);
			RecursiveSort(nums, m+1, q);
		}
	}
	public int Partition(int[] nums, int p, int q) {
		int flag = nums[p];
		while (p < q){
			while (p < q && nums[q] >= flag)
				q --;
			nums[p] = nums[q];
			while (p < q && nums[p] <= flag)
				p ++;
			nums[q] = nums[p];
		}
		nums[p] = flag;
		return p;
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] nums = {3,1,5,7,2,4,9,6};
		QuickSort s = new QuickSort();
		s.Sort(nums);
		for (int i = 0; i < nums.length; i ++)
			System.out.println(nums[i]+" ");
	}

}
