package soal1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Inputan = new Scanner(System.in);
        Dadu dadu = new Dadu();
        int inputan = Inputan.nextInt();

        dadu.setInputan(inputan);
        dadu.acakNilai();
    }
}
