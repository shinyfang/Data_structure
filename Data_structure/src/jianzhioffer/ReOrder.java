package jianzhioffer;

//������ǰ��ż���ں�
//�����ż֮������˳���ܱ�
public class ReOrder {
    public void reOrderArray(int[] array) {
        if (array.length <= 1)
        	return;
        int p1 = 0;
        int p2 = array.length - 1;
        while (p1 < p2){
        	while ((p1 < p2) && (array[p1] & 0x1) == 1){
        		//����
        		p1 ++;
        	}
        	while ((p1 < p2) && (array[p2] & 0x1) == 0){
        		p2 --;
        	}
        	if ((p1 < p2)){
        		int temp = array[p2];
        		array[p2] = array[p1];
        		array[p1] = temp;
        		p1 ++;
        		p2 --;
        	}
        }
    }
    public void reOrderArray2(int[] array) {
    	//���Ҫ�����λ�ò��䣬ÿ�μ�⵽����ʱ����ֱ�ӽ���������˳��Ľ����򲿷������ƶ�
        if (array.length <= 1)
        	return;
        int p1 = -1;//�ź�˳����±�
        int p2 = 0;
        while (p2 < array.length){
        	if ((array[p2] & 0x1) == 1){
        		p1 ++;
        		int temp = array[p2];
        		for (int i = p2; i > p1; i --){
        			array[i] = array[i-1];
        		}
        		array[p1] = temp;
        	}
        	p2 ++;
        }
    }
    public static void main(String[] args){
    	ReOrder r = new ReOrder();
    	int[] array = {1,2,3,4,5,6,7};
    	r.reOrderArray2(array);
    	for (int i = 0; i < array.length; i ++)
    		System.out.println(array[i]);
    }
}
