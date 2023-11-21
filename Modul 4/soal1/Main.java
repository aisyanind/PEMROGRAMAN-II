package soal1;

public class Main {
    public static void main(String[] args) {
        String nama, ras;
        nama ="";
        ras = "";

        HewanPeliharaan hewan = new HewanPeliharaan(nama, ras);
        hewan.display();
    }
}