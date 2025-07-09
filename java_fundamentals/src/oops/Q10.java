package oops;
import java.util.*;
public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		StringBuffer sb1=new StringBuffer(s1);
		StringBuffer sb2=new StringBuffer(s2);
		if(sb1.charAt(sb1.length()-1)==sb2.charAt(0)) {
			sb2.deleteCharAt(0);
		}
		System.out.println(sb1.toString()+sb2.toString());
	}

}
