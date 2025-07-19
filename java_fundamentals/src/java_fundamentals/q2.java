package java_fundamentals;
import java.util.*;
public class q2 {
	public static int sum(int num1, int num2, int num3) {
		
		return maxmin(num1)+maxmin(num2)+maxmin(num3);
		
	}
	public static int maxmin(int num) {
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		while(num>0) {
			int digit=num%10;
			min=Math.min(min, digit);
			max=Math.max(max, digit);
			num/=10;
		}
		return max+min;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		System.out.println("KEY  :"+sum(num1, num2, num3));
	}

}
