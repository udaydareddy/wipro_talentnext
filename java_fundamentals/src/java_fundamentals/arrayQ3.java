package java_fundamentals;
import java.util.*;
public class arrayQ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int element=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		boolean found=false;
		for(int i=0;i<n;i++) {
			if(arr[i]==element) {
				System.out.println(i);
				found=true;
				break;
			}
		}
		if(!found) {
			System.out.println("-1");
		}

	}

}
