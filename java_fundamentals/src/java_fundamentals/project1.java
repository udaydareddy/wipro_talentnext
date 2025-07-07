package java_fundamentals;
import java.util.*;
public class project1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] emp_num= {1001, 1002, 1003, 1004, 1005, 1006, 1007};
		String[] emp_name= {"Anish", "SUshma", "Rahul", "Chahat", "Rajan", "Suman", "Tanmay"};
		String[] join_date= {"01/04/2009", "23/08/2012","12/11/2008", "29/01/2013", "16/07/2005", "1/1/2000","12/06/2006"};
		char[] code= { 'e', 'c', 'k', 'r', 'm', 'e', 'c'};
		String[] Dept= {"R&D","PM", "Acct", "Front Desk", "Engg", "Manufacturing", "PM"};
		int[] Basic= {20000, 30000, 10000, 12000, 50000,23000,29000};
		int[] hra= {8000, 12000, 8000, 6000, 20000, 9000, 12000};
		int[] it= {3000, 9000, 1000, 2000, 20000, 4400, 10000};
		int[] DA= {20000, 32000, 12000, 15000, 40000};
		int n=emp_num.length;
		int id=sc.nextInt();
		boolean found=false;
		String Designation="";
		for(int i=0;i<n;i++) {
			if(code[i]=='e') {
				Designation="Engineer";
			}else if(code[i]=='c') {
				Designation="Consultant";
			}else if(code[i]=='k') {
				Designation="Clerk";
			}else if(code[i]=='r') {
				Designation="Receptionist";
			}else if(code[i]=='m') {
				Designation="Manager";
			}
			if(emp_num[i]==id) {
				int Salary=Basic[i]+hra[i]+DA[i]-it[i];
				System.out.println("EmpNo " +" Emp name  "+" Department "+"  Designation  "+" Salary");
				System.out.print(emp_num[i]+"    "+emp_name[i]+"     "+Dept[i]+"         "+Designation+"      "+Salary);
				found=true;
				break;
			}
			
		}
		if(!found) {
			System.out.println("There is no employee with empid "+ id);
		}
		
		
	}

}
