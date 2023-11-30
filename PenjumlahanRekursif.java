import java.util.Scanner;
public class PenjumlahanRekursif {
    static int hitungPenjumlahan(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + hitungPenjumlahan(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();
        int hasilPenjumlahan = hitungPenjumlahan(n);
        for (int i = 1; i <= n; i++) {
            System.out.print(i);
            if (i < n) {
                System.out.print("+");
            }
        }
        System.out.println(" = " + hasilPenjumlahan);
        sc.close();
    }
}
