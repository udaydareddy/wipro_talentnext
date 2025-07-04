package java_fundamentals;
import java.util.*;
public class question4b {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		if(n%10==m%10) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}

}
