package java_fundamentals;
import java.util.*;
public class arrayQ5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-1;j++){
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;	
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("largest two:"+ arr[n-1]+" "+arr[n-2]);
		System.out.println("smallest two:"+ arr[0]+" "+arr[1]);
		

	}

}
