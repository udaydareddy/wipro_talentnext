package java_fundamentals;
import java.util.*;
public class question6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		if(s.length()==0) {
			System.out.println("No Values");
			
		}else {
			String[] words=s.trim().split("\\s+");
			String output="";
			for(int i=0;i<words.length;i++) {
				output +=words[i];
				if(i<words.length-1) {
					output+=",";
				}
				
			}
			System.out.println(output);
		}
	}

}
