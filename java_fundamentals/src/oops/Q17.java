package oops;
import java.util.*;
public class Q17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		String b=sc.nextLine();
		StringBuffer combined=new StringBuffer();
		int n=Math.max(a.length(), b.length());
		for(int i=0;i<n;i++) {
			if(i<a.length()) {
				combined.append(a.charAt(i));
			}
		    if(i<b.length()) {
				combined.append(b.charAt(i));
			}
		}
		
		//System.out.println(n);
		System.out.println(combined.toString());
	}

}
