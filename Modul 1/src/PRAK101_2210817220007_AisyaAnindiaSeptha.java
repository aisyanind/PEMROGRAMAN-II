import java.util.Scanner;
public class PRAK101_2210817220007_AisyaAnindiaSeptha {
    public static void main(String[] args) {
        String namalengkap, tempatlahir;
        int tanggallahir, bulanlahir, tahunlahir, tinggibadan;
        float beratbadan;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nama Lengkap: ");
        namalengkap = scanner.nextLine();

        System.out.print("Masukkan Tempat Lahir: ");
        tempatlahir = scanner.nextLine();

        System.out.print("Masukkan Tanggal Lahir: ");
        tanggallahir = scanner.nextInt();

        System.out.print("Masukkan Bulan Lahir: ");
        bulanlahir = scanner.nextInt();

        System.out.print("Masukkan Tahun Lahir: ");
        tahunlahir = scanner.nextInt();

        System.out.print("Masukkan Tinggi Badan: ");
        tinggibadan = scanner.nextInt();

        System.out.print("Masukkan Berat Badan: ");
        beratbadan = scanner.nextFloat();

        System.out.println("Nama Lengkap " + namalengkap + ", Lahir di " + tempatlahir + " pada Tanggal " + tanggallahir + " " + getBulan(bulanlahir) + " " + tahunlahir);
        System.out.println("Tinggi Badan " + tinggibadan + " cm dan Berat Badan " + beratbadan + " kilogram");}
    private static String getBulan(int bulan) {
        String[] namaBulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
        if (bulan >= 1 && bulan <= 12) {
            return namaBulan[bulan - 1];}
        return "";}
}