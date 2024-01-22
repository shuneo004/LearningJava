import java.util.Scanner;

public class sothukchiahetchon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 0; i < test; ++i) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            boolean x =  (k % (n-1) == 0);
            int a;
            if (x == true) a = 1;
            else a = 0;
            System.out.println((int) (k / (n-1)) * n + k % (n-1) - a);
        }
        sc.close();
    }
}
