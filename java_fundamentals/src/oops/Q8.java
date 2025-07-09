package oops;

class shape{
	void draw() {
		System.out.println("Drawing shape");
	}
	void erase() {
		System.out.println("Erasing shape");
	}
}
class circle extends shape{
	void draw() {
		System.out.println("Drawing circle");
	}
	void erase() {
		System.out.println("Erasing circle");
	}
}
class triangle extends shape{
	void draw() {
		System.out.println("Drawing triangle");
	}
	void erase() {
		System.out.println("Erasing triangle");
	}
}
public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shape s=new shape();
		circle c=new circle();
		triangle t=new triangle();
		s.draw();
		s.erase();
		c.draw();
		c.erase();
		t.draw();
		t.erase();

	}

}
