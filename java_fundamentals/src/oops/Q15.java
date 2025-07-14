package oops;
import java.util.*;
class removeX{
	public static String remove(String s) {
		int n=s.length();
		if(n==0) {
			return s;
		}for(int i=0;i<n;i++) {
			if(s.charAt(0)=='x'|| s.charAt(0)=='X') {
				s=s.substring(1);
				n=s.length();
			}
			if(s.charAt(n-1)=='x'|| s.charAt(n-1)=='X') {
				s=s.substring(0, n-1);
				n=s.length();
			}
		}
		
		
		return s;
		
	}
}
public class Q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String str=removeX.remove(s);
		System.out.println("String output: "+str);
		
		
	}

}
