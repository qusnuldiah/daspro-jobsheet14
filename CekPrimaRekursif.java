import java.util.Scanner;
public class CekPrimaRekursif {
    static boolean cekPrima(int n, int pembagi) {
        if (n <= 1) {
            return false;
        } else if (pembagi == 1) {
            return true;
        } else {
            if (n % pembagi == 0) {
                return false;
            } else {
                return cekPrima(n, pembagi - 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();
        boolean hasilCekPrima = cekPrima(n, n / 2);
        if (hasilCekPrima) {
            System.out.println(n + " adalah bilangan prima.");
        } else {
            System.out.println(n + " bukan bilangan prima.");
        }
        sc.close();
    }
}
