package sort;
public class HeapSort {
	public void Sort(int[] nums) {
		BuildHeap(nums,nums.length-1);//�������ȹ���һ�������
		for (int i = nums.length - 1; i > 0; i --){
			int temp = nums[i];
			nums[i] = nums[0];
			nums[0] = temp;
			MaxHeap(nums,0,i-1);
		}
	}
	public void BuildHeap(int[] nums, int q) {
		for (int i = q/2; i >= 0; i --)//�������ϵ�һ����Ҷ�ӽڵ㿪ʼ
			MaxHeap(nums,i,q);
	}
	public void MaxHeap(int[] nums, int root, int end) {
		int left = 2*root + 1;
		int right = 2*root + 2;
		int maxId = root;
		if (left <= end){
			if (nums[left] > nums[maxId])
				maxId = left;
		}
		if (right <= end){
			if (nums[right] > nums[maxId])
				maxId = right;
		}
		if (root != maxId){
			int temp = nums[root];
			nums[root] = nums[maxId];
			nums[maxId] = temp;
			MaxHeap(nums, maxId, end);//��������˽�����Ҫ���¶Խ������������������
		}
	}
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int[] nums = {3,1,5,7,2,4,9,6};
		HeapSort s = new HeapSort();
		s.Sort(nums);
		for (int i = 0; i < nums.length; i ++)
			System.out.println(nums[i]+" ");
	}

}
