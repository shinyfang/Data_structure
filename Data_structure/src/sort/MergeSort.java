package sort;
public class MergeSort {
	public void Sort(int[] nums){
		RecursiveSort(nums,0,nums.length-1);
	}
	public void RecursiveSort(int[] nums, int p, int q) {
		if (p < q){
			int m = p + (q - p)/2;
			RecursiveSort(nums, p, m);
			RecursiveSort(nums, m+1, q);
			Merge(nums,p,m,q);
		}
	}
	public void Merge(int[] nums, int p, int m, int q) {
		int[] temp = new int[q-p+1];//要用新数组去存归并后的数
		int i = p;
		int j = m+1;
		int index = 0;
		while (i <= m && j <= q){
			if (nums[i] <= nums[j]){
				temp[index] = nums[i];
				i ++;
				index ++;
			}
			else{
				temp[index] = nums[j];
				j ++;
				index ++;
			}
		}
		while (i <= m){
			temp[index++] = nums[i++];
		}
		while (j <= q){
			temp[index++] = nums[j++];
		}
		for (int k = p, l = 0; k <= q; k ++, l ++)
			nums[k] = temp[l];
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] nums = {3,1,5,7,2,4,9,6};
		MergeSort s = new MergeSort();
		s.Sort(nums);
		for (int i = 0; i < nums.length; i ++)
			System.out.println(nums[i]+" ");
	}

}
