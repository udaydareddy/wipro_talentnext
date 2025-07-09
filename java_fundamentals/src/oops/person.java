package oops;

public class person {
	private String name;
	person(String name){
		this.name=name;
	}
	public void setname(String name) {
		this.name=name;
	}
	public String getname() {
		return name;
	}
	public String display() {
		return "name:"+name;
	}

}
