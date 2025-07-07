package java_fundamentals;
import java.util.*;
public class arrayQ14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[][] matrix = new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				matrix[i][j]=sc.nextInt();
			}
		}
		int max=Integer.MIN_VALUE;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(matrix[i][j]>max) {
					max=matrix[i][j];
				}
			}
		}
		System.out.println(max);
		

	}

}
