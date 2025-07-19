package java_fundamentals;
import java.util.Scanner;

class q1{

    public static int getAsciiSum(String s1, String s2) {
        int[] count = new int[256];

        
        for (char c : s1.toCharArray()) {
            count[c]++;
        }

        
        for (char c : s2.toCharArray()) {
            count[c] += 2;  
        }

        
        int sum = 0;
        for (int i = 0; i < 256; i++) {
            if (count[i] == 1 || count[i] == 2) {
                sum += i;
            }
        }

        
        while (sum >= 10) {
            int temp = 0;
            while (sum > 0) {
                temp += sum % 10;
                sum /= 10;
            }
            sum = temp;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        String input2 = sc.nextLine();

        int result = getAsciiSum(input1, input2);
        System.out.println(result);
        sc.close();
    }
}


