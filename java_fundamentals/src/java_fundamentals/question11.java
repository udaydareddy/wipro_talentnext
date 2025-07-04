package java_fundamentals;
import java.util.*;

public class question11 {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		char ch=sc.nextLine().charAt(0);
		switch(ch) {
		case 'R':
			System.out.println("Red");
			break;
		case 'Y':
			System.out.println("Yellow");
			break;
		case 'B':
			System.out.println("Blue");
			break;
		case 'G':
			System.out.println("Green");
		case 'W':
			System.out.println("White");
		default:
			System.out.println("Invalid");
			
		}
			
		
	}

}
