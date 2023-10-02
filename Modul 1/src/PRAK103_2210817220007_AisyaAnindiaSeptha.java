import java.util.Scanner;

public class PRAK103_2210817220007_AisyaAnindiaSeptha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c, d;

        System.out.print("Input Angka : ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = 1;
        d = b;

        System.out.print("");
        do {
            if (d % 2 != 0) {
                System.out.print(d);
                if (c < a) {
                    System.out.print(", ");}
                c++;}
            d++;}

        while (c <= a);
        System.out.println();
    }
}