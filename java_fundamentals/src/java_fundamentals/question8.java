package java_fundamentals;
import java.util.*;
public class question8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch=sc.nextLine().charAt(0);
		if(ch>=48 && ch<=57) {
			System.out.println("Number");
		}else if(ch>=65&&ch<=90||ch>=97&&ch<=122) {
			System.out.println("Alphabet");
		}else {
			System.out.println("Special character");
		}
	}

}
