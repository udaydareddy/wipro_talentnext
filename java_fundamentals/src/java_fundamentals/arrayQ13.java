package java_fundamentals;
import java.util.*;
public class arrayQ13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[][] matx=new int[2][2];
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				matx[i][j]=sc.nextInt();
				//System.out.print(matx[i][j]+" ");
				
			}
			
		}
		for(int i=1;i>=0;i--) {
			for(int j=1;j>=0;j--) {
				System.out.print(matx[i][j]+" ");
			}System.out.println();
		}
		//System.out.print(Arrays.deepToString(matx));
		
	}

}
