package jianzhioffer;

import java.util.ArrayList;
//顺时针打印矩阵，左-右-下-左-上
//主要考边界条件！！！！！
//左-右无条件；上-下要求横坐标；右到左要求横纵；下到上要求横纵！！！！
public class PrintMatrix {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> re = new ArrayList<Integer>();
        if (matrix.length == 0 || matrix[0].length == 0)
        	return re;
        int x1 = 0;
        int x2 = matrix.length-1;
        int y1 = 0;
        int y2 = matrix[0].length-1;
        while (x1 <= x2 && y1 <= y2){
		    for (int i = y1; i <= y2; i ++)
		        re.add(matrix[x1][i]);
        	if (x1 < x2){
	        	for (int i = x1+1; i <= x2; i ++)
	        		re.add(matrix[i][y2]);
        	}
        	if ((y1 < y2) && (x1 < x2)){
	        	for (int i = y2-1; i >= y1; i --)
	        		re.add(matrix[x2][i]);
        	}
        	if ((x1 < x2) && (y1 < y2)){
	        	for (int i = x2-1; i >= x1+1; i --)
	        		re.add(matrix[i][y1]);
        	}
        	x1++;x2--;y1++;y2--;
        }
        return re;
    }
	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}
