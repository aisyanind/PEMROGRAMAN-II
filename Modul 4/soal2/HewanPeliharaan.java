package soal2;

public abstract class HewanPeliharaan {
    private String nama;
    private String ras;

    public HewanPeliharaan(String r, String n) {
        ras = r;
        nama = n;}

    public void display() {
        System.out.println("\nDetail Hewan Peliharaan:");
        System.out.println("Nama hewan peliharaanku adalah : " +nama);
        System.out.println("Dengan ras : " +ras);
    }
}