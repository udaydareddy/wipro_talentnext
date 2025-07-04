package java_fundamentals;
import java.util.*;
public class question9 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String gender=sc.nextLine();
		int age=sc.nextInt();
		if(gender=="Female") {
			if(age>=1||age<=58) {
				System.out.println("8.2% intreset");
				
			}else if(age>=59||age<=100) {
				System.out.println("9.2% intreset");
			}
			
			
		}
		else if(gender=="Male") {
			if(age>=1||age<=58) {
				System.out.println("8.4% intreset");
			}
			else if (age>=59||age<=100) {
				System.out.println("10.5% intreset");
			}
		}
	}

}
