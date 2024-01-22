import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class chiahetcho45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        char[] num1 = num.toCharArray();
        Arrays.sort(num1);
        num = new String(num1);
        int five = 0;
        int zero = 0;
        int sum = 0;
        for (int i = 0; i < num.length(); ++i) {
            int a = (int)(num.charAt(i)) - 48;
            sum += a;
            if (a == 5) five ++;
            if (a == 0) zero ++;
        }
        if (five + zero> 0 && sum % 9 == 0) {
            for (int i = num.length()-1; i != -1; --i) {
                int a = (int)(num.charAt(i));
                if (a != 5 + 48 || five > 1 && zero == 0 || zero > 1) {
                    System.out.print(num.charAt(i));
                    if (zero > 1) {
                        if (a == 5)
                    }
                }
            }
            System.out.println(5);
        } else System.out.println(-1);
        sc.close();
    }
}
