import java.util.Scanner;

public class TiketBioskop27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hargaTiket = 50000;
        int tiket;
        double diskon;
        double totalHarga;
        String lagi = "y";
        int totalTiket = 0;
        double totalPenjualan = 0;

        do {
            System.out.print("Jumlah tiket: ");
            tiket = sc.nextInt();
            if (tiket <= 0) {
                System.out.println("Jumlah tidak valid, input lagi!");
                continue;
            }

            if (tiket > 4 && tiket <= 6) {
                diskon = 0.1;
            } else if (tiket > 6) {
                diskon = 0.15;
            } else {
                diskon = 0;
            }

            totalHarga = tiket * hargaTiket * (1 - diskon);
            System.out.println("Total yang harus dibayar: Rp " + totalHarga + " (Diskon: " + (diskon * 100) + "%)");

            totalTiket += tiket;
            totalPenjualan += totalHarga;

            System.out.print("Ada transaksi lagi? (y/n): ");
            lagi = sc.next();
            
        } while (lagi.equalsIgnoreCase("y"));

        System.out.println("Semua transaksi selesai.");
        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total penjualan: Rp " + totalPenjualan);
    }
}