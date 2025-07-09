package oops;
class Animal{
	void eat() {
		System.out.println("The animal is eating");
	}void sleep(){
		System.out.println("The animal is sleeping");
	}
}
class bird extends Animal{
	//@Override
	void eat() {
		System.out.println("The bird is eating");
	}
	void sleep() {
		System.out.println("The bird is sleeping");
	}
	void fly() {
		System.out.println("The bird is flying");
	}
}
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal obj1=new Animal();
		bird obj2=new bird();
		obj1.eat();
		obj1.sleep();
		obj2.eat();
		obj2.sleep();
		obj2.fly();

	}

}
