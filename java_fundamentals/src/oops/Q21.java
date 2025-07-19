package oops;
import java.util.*;
public class Q21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names=new ArrayList<>();
		names.add("alice");
		names.add("uday");
		names.add("kiran");
		names.add("reddy");
		StringJoiner joiner=new StringJoiner(", ", "{", "}");
		for(String name:names) {
			joiner.add(name);
		}
		System.out.println(joiner.toString());

	}

}
