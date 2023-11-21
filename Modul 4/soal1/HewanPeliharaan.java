package soal1;
import java.util.Scanner;

public class HewanPeliharaan {
    private String nama;
    private String ras;

    public HewanPeliharaan(String r, String n) {
        ras = r;
        nama = n;

        Scanner masukkan = new Scanner(System.in);

        System.out.print("Nama hewan peliharaanku adalah : ");
        nama = masukkan.nextLine();

        System.out.print("Dengan ras : ");
        ras = masukkan.nextLine();
    }

    public void display() {
        System.out.println("\nDetail Hewan Peliharaan:");
        System.out.println("Nama hewan peliharaanku adalah : " +nama);
        System.out.println("Dengan ras : " +ras);
    }
}