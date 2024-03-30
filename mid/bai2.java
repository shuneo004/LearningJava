
// package mid;

// import mid.bai2.MonHoc;
// import mid.bai2.MonKyThucHanhJava;
// import mid.bai2.MonLapTrinhJava;

import java.util.Scanner;

/**
 * Innerbai2
 */

public class bai2 {
    public interface MonHoc {
        public double diem(double bt, double gk, double ck);
    }
    class MonKyThucHanhJava implements MonHoc {
        public double diem(double bt, double gk, double ck) {
            return bt*0.5+ck*0.5;
        }
    }
    class MonLapTrinhJava implements MonHoc {
        public double diem(double bt, double gk, double ck) {
            return bt * 0.2 + gk * 0.2 + ck * 0.6;
        }
    }
    public void run() {
        MonHoc monKyThucHanh = new MonKyThucHanhJava();
        MonHoc monLapTrinh = new MonLapTrinhJava();

        // Example scores
        double bt1 = 8.5;  // Diem bai tap
        double gk1 = 7.0;  // Diem giua ky
        double ck1 = 9.0;  // Diem cuoi ky
        double bt2, gk2, ck2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Mon Ky Thuc Hanh\n");
        bt1 = sc.nextDouble();
        // gk1 = sc.nextDouble();
        gk1 = 0;
        ck1 = sc.nextDouble();
        System.out.println("Nhap mon diem lap trinh");
        bt2 = sc.nextDouble();
        gk2 = sc.nextDouble();
        ck2 = sc.nextDouble();
        // Calculate scores
        double diemKyThucHanh = monKyThucHanh.diem(bt1, gk1, ck1);
        double diemLapTrinh = monLapTrinh.diem(bt2, gk2, ck2);

        // Output results
        System.out.println("Diem mon ky thuc hanh: " + diemKyThucHanh);
        System.out.println("Diem mon lap trinh: " + diemLapTrinh);
    }

    public static void main(String[] args) {
        bai2 program = new bai2();
        program.run();
    }
}


