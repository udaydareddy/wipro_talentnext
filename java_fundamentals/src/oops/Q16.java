package oops;
import java.util.*;
public class Q16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		System.out.println(input);
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)=='*') {
				input=input.substring(0, i);
			}
		}
		System.out.println(input);
		

	}

}
