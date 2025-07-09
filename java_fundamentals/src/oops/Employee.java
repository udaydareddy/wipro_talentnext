package oops;

public class Employee extends person {
	private double salary;
	private String date;
	private String Ins_number;
	Employee(String name, double salary, String date, String Ins_number ){
		super(name);
		this.salary=salary;
		this.date=date;
		this.Ins_number=Ins_number;
	}
	public void setsalary(double salary) {
		this.salary=salary;
	}
	public void setdate(String date) {
		this.date=date;
	}
	public void setIns_number(String Ins_number) {
		this.Ins_number=Ins_number;
	}
	public double getSalary() {
		return salary;
	}
	public String getdate() {
		return date;
	}
	public String getIns_number() {
		return Ins_number;
	}
	public String display() {
		return super.display() +"The salary is "+salary+" the date of joining is: "+date+" insurance number is "+Ins_number;
	}

}
