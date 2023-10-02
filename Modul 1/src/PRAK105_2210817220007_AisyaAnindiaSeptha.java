import java.util.Scanner;
import java.text.DecimalFormat;

public class PRAK105_2210817220007_AisyaAnindiaSeptha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double phi, r, tinggi, volume;

        phi = 3.14;

        System.out.print("Masukkan jari-jari: ");
        r = scanner.nextDouble();

        System.out.print("Masukkan tinggi: ");
        tinggi = scanner.nextDouble();

        volume = phi * r * r * tinggi;
        DecimalFormat df = new DecimalFormat("#.###");

        System.out.println("Volume tabung dengan jari-jari " + r + " cm dan tinggi " + tinggi + " cm adalah " + df.format(volume) + " m3");
    }
}