package oops;
import java.util.*;
public class Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String half="";
		String s=sc.nextLine();
		if(s.length()%2!=0) {
			System.out.println("null");
		}else {
			for(int i=0;i<(s.length()/2); i++) {
				half=half+s.charAt(i);
			}
			System.out.println(half);
	  }
		sc.close();
   

	}

}
