package abstraction;

public class Question2 {
	private String name;
	private int[] marks;
	private String grade;
	public Question2() {
		
	}
	public Question2(String grade,int[] marks) {
		this.grade=grade;
		this.marks=marks;
		this.name=name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setMarks(int[] marks) {
		this.marks=marks;
	}
	public void setGrade(String grade) {
		this.grade=grade;
	}
	public String getName() {
		return name;
	}
	public int[] getMarks() {
		return marks;
	}
	public String getGrade() {
		return grade;
	}
}