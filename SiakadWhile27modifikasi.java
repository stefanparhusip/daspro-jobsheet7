import java.util.Scanner;

public class SiakadWhile27modifikasi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        String namaPelanggan;
        int hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000;
        int kopi,teh,roti, totalHarga   ;

        do{
        System.out.println("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
        namaPelanggan = sc.nextLine();
        if (namaPelanggan.equalsIgnoreCase("batal")) {
            System.out.println("Transaksi dibatalkan.");
            break;
        }
        System.out.print("Jumlah kopi: ");
        kopi =sc.nextInt();
        System.out.print("Jumlah teh: ");
        teh = sc.nextInt(); 
        System.out.print("Jumlah Roti:");
        roti = sc.nextInt();
        totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
        System.out.println("Total yang harus dibayar: Rp " + totalHarga);
        sc.nextLine();
        }while(true);   
        System.out.println("Semua transaksi selesai.");
    }
}
    