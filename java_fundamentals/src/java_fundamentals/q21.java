package java_fundamentals;
import java.util.*;
public class q21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		int sum=0;
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
		int avg=sum/n;
		System.out.println("Sum"+sum);
		System.out.println("AVerage"+avg);
		
		

	}

}
