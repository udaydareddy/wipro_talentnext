package oops;
import java.util.*;
public class Q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		StringBuffer sb=new StringBuffer(s);
		sb.deleteCharAt(0);
		sb.deleteCharAt(sb.length()-1);
		System.out.println(sb);

	}

}
