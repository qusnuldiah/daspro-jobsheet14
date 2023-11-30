import java.util.Scanner;

public class Fibonacci {
    static int hitungMarmut(int bulan) {
        if (bulan == 1 || bulan == 2) {
            return 1;
        } else {
            return hitungMarmut(bulan - 1) + hitungMarmut(bulan - 2);
        }
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan bulan ke: ");
    int bulan = sc.nextInt();
    int jumlahMarmut = hitungMarmut(bulan);
    System.out.println("Jumlah pasangan marmut pada bulan ke-" + bulan + " adalah: " + jumlahMarmut);
    sc.close();
    }
}
