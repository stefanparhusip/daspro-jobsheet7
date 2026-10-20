public class CariAngkaGanjil27 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                int hasil = i + 4;
                System.out.println(i + " adalah bilangan genap, dan ditambahkan 4 sama dengan: " + hasil);
            } else {
                int hasil = i + 3;
                System.out.println(i + " adalah bilangan ganjil, dan ditambahkan 3 sama dengan: " + hasil);
            }
        }
    }
}