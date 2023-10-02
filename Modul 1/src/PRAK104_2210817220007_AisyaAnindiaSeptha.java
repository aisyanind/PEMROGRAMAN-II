import java.util.Scanner;

public class PRAK104_2210817220007_AisyaAnindiaSeptha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String Abu, Bagas, RondeAbu, RondeBagas, pemenang;
        int poinAbu, poinBagas;

        System.out.print("Tangan Abu: ");
        Abu = scanner.nextLine().trim();

        System.out.print("Tangan Bagas: ");
        Bagas = scanner.nextLine().trim();

        String[] AbuArray = Abu.split(" ");
        String[] BagasArray = Bagas.split(" ");

        poinAbu = 0;
        poinBagas = 0;

        for (int i = 0; i < 3; i++) {
            RondeAbu = AbuArray[i];
            RondeBagas = BagasArray[i];
            if (RondeAbu.equals(RondeBagas)) {}
            else if ((RondeAbu.equals("B") && RondeBagas.equals("G")) ||
                    (RondeAbu.equals("G") && RondeBagas.equals("K")) ||
                    (RondeAbu.equals("K") && RondeBagas.equals("B"))) {
                poinAbu++;}
            else {
                poinBagas++;
            }
        }
        if (poinAbu > poinBagas) {
            pemenang = "Abu";}
        else if (poinAbu < poinBagas) {
            pemenang = "Bagas";}
        else {
            pemenang = "Seri";}
        System.out.println(pemenang);
    }
}