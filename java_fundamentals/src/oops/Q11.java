package oops;
import java.util.*;
public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();;
		int n=s.length();
		//String sub=s.substring(0, 2);
		String sub="";
		//sub=s.charAt(0)+"";
		sub=s.charAt(0)+""+s.charAt(1);
		System.out.println(sub);
		
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<n;i++) {
			sb.append(sub);
		}
		
		System.out.println(sb.toString());

	}

}
