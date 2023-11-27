package soal1;
import java.text.DecimalFormat;

public class PaintThings {
    public static void main (String[] args){
        final double coverage = 350;
        Paint Paint = new Paint (coverage);
        Rectangle deck;
        Sphere bigBall;
        Cylinder tank;

        double deckAmt, ballAmt, tankAmt;

        deck = new Rectangle(20,30);
        bigBall = new Sphere(15);
        tank = new Cylinder(10,30);

        deckAmt = Paint.amount(deck);
        ballAmt = Paint.amount(bigBall);
        tankAmt = Paint.amount(tank);

        DecimalFormat fmt = new DecimalFormat("0.#");

        System.out.println("\nNumber of gallons of paint needed...");
        System.out.println("Deck " + fmt.format(deckAmt));
        System.out.println("Big Ball " + fmt.format(ballAmt));
        System.out.println("Tank " + fmt.format(tankAmt));
    }
}