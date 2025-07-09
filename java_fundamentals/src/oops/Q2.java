package oops;
import java.util.*;
class Calculator{
	static void PowerInt(int num1, int num2) {
		int output=(int) Math.pow(num1, num2);
		System.out.println(output);
	}
	static void PowerDouble(double num1, int num2) {
		double output=Math.pow(num1, num2);
		System.out.println(output);
	}
}
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double num1=sc.nextDouble();
		int num2=sc.nextInt();
		Calculator.PowerInt((int) num1, num2);
		Calculator.PowerDouble(num1, num2);
		
		

	}

}
