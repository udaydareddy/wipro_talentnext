package oops;
import java.util.*;
public class Q19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int n=sc.nextInt();
		String s="";
		for(int i=str.length()-3;i<str.length();i++) {
			s+=str.charAt(i);
		}
		for(int i=0;i<n;i++) {
			System.out.print(s);
		}

	}

}
