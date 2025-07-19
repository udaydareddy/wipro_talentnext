package oops;
import java.util.*;
public class Q22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringJoiner s1=new StringJoiner("/");
		StringJoiner s2=new StringJoiner("/");
		s1.add("chennai");
		s1.add("banglore");
		s1.add("mumbai");
		s2.add("delhi");
		s2.add("lucknow");
		System.out.println(s1.merge(s2).toString());
		System.out.println(s2.merge(s1).toString());

	}

}
