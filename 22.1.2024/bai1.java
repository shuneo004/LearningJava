import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        int x = sc.nextInt();
        s += x;
        m += s / 60; 
        s %= 60;
        h += m / 60;
        m %= 60;
        h = (h + 11) % 12 + 1;
        System.out.println(h + " " + m + " " + s);
        sc.close();
    }
}
