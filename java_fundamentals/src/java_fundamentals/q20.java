package java_fundamentals;
import java.util.*;
public class q20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		palindrome();

	}

	private static void palindrome() {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rev=0;
		int o=n;
		while(n!=0) {
			int digit=n%10;
			rev=rev*10+digit;
			n=n/10;
		}
		if(rev==o) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
	}

}
