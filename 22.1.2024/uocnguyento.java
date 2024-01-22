import java.util.Scanner;

public class uocnguyento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int p = 2; p * p <= a; ++p) {
            if (a % p == 0) {
                System.out.print(p + " ");
                while (a % p == 0) a /= p;
            }
        }
        if (a != 1) System.out.println(a);
        sc.close();
    }
}
