package java_fundamentals;
import java.util.*;
public class arrayQ11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int sum=0;
		boolean found=false;
		for(int i=0;i<n;i++) {
			if(arr[i]==6) {
				int j=i+1;
				while(j<n) {
					if(arr[j]==7) {
						found=true;
						break;
					}
					j++;
				}if(found) {
					i=j;
					continue;
				}
			}
			sum+=arr[i];
		}
		System.out.println(sum);

	}

}
