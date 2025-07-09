package oops;
class Fruit{
	String name;
	String taste;
	double size;
	Fruit(String name, String taste, double size){
		this.name=name;
		this.taste=taste;
		this.size=size;
	}
	public void eat() {
		System.out.println("The name of the fruit "+name);
		System.out.println("The taste of the fruit "+taste);
	}
}
class Apple extends Fruit{

	Apple(double size) {
		super("Apple", "sweet", size);
		// TODO Auto-generated constructor stub
	}
	public void eat() {
		System.out.println("This is an apple, it tastes sweet "+size);
	}
	
	
}
class orange extends Fruit{

	orange(double size) {
		super("Orange", "sour", size);
		// TODO Auto-generated constructor stub
	}
	public void eat() {
		System.out.println("This is an orange, it tastes sour " +size);
	}
	
}
public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple a=new Apple(100);
		orange o=new orange(95);
		a.eat();
		o.eat();

	}

}
