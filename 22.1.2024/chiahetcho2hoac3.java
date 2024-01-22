import java.util.Scanner;

public class chiahetcho2hoac3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n*n / 2 + n*n / 3 - n*n / 6);
        sc.close();
    }
}
