package oops;
import java.util.*;
public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		
		StringBuffer sb=new StringBuffer(a);
		sb=sb.reverse();
		System.out.println(a);
		System.out.println(sb);
		if(a.equals(sb.toString())) {
			System.out.println("Palindrome");
		}else {
			System.out.println("not a paloindrome");
		}

	}

}
