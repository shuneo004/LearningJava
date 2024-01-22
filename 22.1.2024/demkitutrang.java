import java.util.Scanner;

public class demkitutrang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int cnt = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (Character.compare(s.charAt(i), ' ') == 0) cnt = cnt + 1;
        }
        System.out.println(cnt);
        sc.close();
    }
}
