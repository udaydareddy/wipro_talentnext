package java_fundamentals;
import java.util.*;
public class arrayQ7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[] =new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		LinkedHashSet<Integer> uniqueset=new LinkedHashSet<>();
		for(int i=0;i<n;i++) {
			uniqueset.add(arr[i]);
		}
		Integer[] uniquearr=uniqueset.toArray(new Integer[0]);
		System.out.println(Arrays.toString(uniquearr));
		
	}

}
