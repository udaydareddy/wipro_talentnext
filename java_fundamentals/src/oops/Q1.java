package oops;
import java.util.*;
class Box{
	int height;
	int width;
	int depth;
	Box(int h, int w, int d){
		height=h;
		width=w;
		depth=d;
	}
	void volume() {
		System.out.println("The volume is: "+(height*width*depth));
		}
}
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int h=sc.nextInt();
		int w=sc.nextInt();
		int d=sc.nextInt();
		Box obj=new Box(h, w, d);
		obj.volume();
		sc.close();
		
	}

}
