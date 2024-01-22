import java.util.Scanner;

public class biendoixaudoixung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t; ++i) {
            String s = sc.nextLine();
            int cnt = 0;
            for (int a = 0, b = s.length() - 1; a < b && cnt < 3; ++a, --b) {
                if (Character.compare(s.charAt(a), s.charAt(b)) != 0) cnt ++;
            }
            if (cnt < 3) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
    }
}
