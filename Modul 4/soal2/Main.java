package soal2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih jenis hewan yang ingin diinputkan:");
        System.out.println("1 = Kucing");
        System.out.println("2 = Anjing");
        System.out.print("Masukkan pilihan: ");

        int pilih = scanner.nextInt();
        scanner.nextLine();

        if (pilih == 1) {
            System.out.print("Nama hewan peliharaan: ");
            String namaHewan = scanner.nextLine();

            System.out.print("Ras: ");
            String rasHewan = scanner.nextLine();

            System.out.print("Warna Bulu: ");
            String warnaBulu = scanner.nextLine();

            Kucing kucing = new Kucing(rasHewan, namaHewan, warnaBulu);

            kucing.displayDetailKucing();}

        else if (pilih == 2) {
            System.out.print("Nama hewan peliharaan: ");
            String namaHewan = scanner.nextLine();

            System.out.print("Ras: ");
            String rasHewan = scanner.nextLine();

            System.out.print("Warna Bulu: ");
            String warnaBulu = scanner.nextLine();

            System.out.print("Kemampuan : ");
            String kemampuan = scanner.nextLine();

            Anjing anjing = new Anjing(namaHewan, rasHewan, warnaBulu, new String[] {kemampuan});
            anjing.displayDetailAnjing();}

        scanner.close();
    }
}