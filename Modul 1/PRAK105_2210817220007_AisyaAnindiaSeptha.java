import java.util.Scanner;
public class PRAK105_2210817220007_AisyaAnindiaSeptha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Masukkan Makanan Favorit: ");
        String Makanan = scanner.nextLine();
        System.out.printf("Masukkan Hobi: ");
        String Hobi = scanner.nextLine();
        System.out.println("Aku Suka Makan " +Makanan+ ", dan Hobiku " +Hobi);
        scanner.close();
    }
}
