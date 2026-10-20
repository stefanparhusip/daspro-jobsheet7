import java.util.Scanner;

public class SiakadFor27modifikasi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilai, tertinggi = 0, terendah = 100;
        int jumlahLulus = 0, jumlahTidakLulus = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();

            // cek rekor tertinggi dan terendah
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }

            // cek lulus / tidak, untuk SETIAP mahasiswa
            if (nilai >= 60 && nilai <= 100) {
                System.out.println("Nilai mahasiswa ke-" + i + " adalah: " + nilai + " dan termasuk lulus");
                jumlahLulus++;
            } else if (nilai >= 0 && nilai < 60) {
                System.out.println("Nilai mahasiswa ke-" + i + " adalah: " + nilai + " dan termasuk tidak lulus");
                jumlahTidakLulus++;
            } else {
                System.out.println("Nilai yang diinput salah");
            }
        }

        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Jumlah mahasiswa lulus: " + jumlahLulus);
        System.out.println("Jumlah mahasiswa tidak lulus: " + jumlahTidakLulus);
    }
}