import java.util.Scanner;

public class PRAK102_2210817220007_AisyaAnindiaSeptha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, bilangan, angka;

        System.out.print("Masukkan bilangan : ");
        bilangan = scanner.nextInt();

        a = 0;
        b = bilangan;

        while (a <= 10) {
            if (b % 5 == 0) {
                angka = (b / 5) - 1;}
            else {
                angka = b;}
            System.out.print(angka);

            if (a < 10) {
                System.out.print(", ");}
            else {
                System.out.print("");}

            b++;
            a++;
        }
    }
}