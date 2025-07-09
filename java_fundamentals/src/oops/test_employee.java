package oops;
import java.util.*;
public class test_employee {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		double salary=sc.nextDouble();
		sc.nextLine();
		String date=sc.nextLine();
		String Ins_number=sc.nextLine();
		System.out.println("The person details:");
		person p=new person(name);
		System.out.println(p.display());
		System.out.println("The employee detals:");
		Employee e=new Employee(name, salary, date, Ins_number);
		System.out.println(e.display());
		sc.close();
		
		
	}

}
