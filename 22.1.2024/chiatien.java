import java.util.Scanner;

public class chiatien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = (int)(x * (float)(33.0f / 24));
        int b = (int)(x * (float)(21.0f / 24));
        int c = (int) (x * (float)(18.0f / 24));
        if (a + b + c == 3 * x) System.out.println(a + " " + b + " " + c);
        else System.out.println("NO");
        sc.close();
    }  
}
