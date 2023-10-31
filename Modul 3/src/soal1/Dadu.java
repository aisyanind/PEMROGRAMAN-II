package soal1;
import java.util.LinkedList;
import java.util.Random;
public class Dadu {
    private int input;
    private int total;
    public void setInputan(int input) {
        this.input = input;
    }
    public void acakNilai() {
        LinkedList<Integer> daduList = new LinkedList<>();
        for (int i = 0; i < input; i++) {
            int random = new Random().nextInt(6) + 1;
            daduList.add(random);

            System.out.println("Dadu ke-" + (i + 1) + " bernilai " + random);
            total += random;
        }
        System.out.println("Total nilai dadu keseluruhan " + total);
    }
}