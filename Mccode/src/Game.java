import java.util.Arrays;

public class Game {
    public static void main(String[] args){
        Dice dice1 = new Dice();
        while (dice1.getState() != State.END) {
            dice1.roll();
            System.out.println(dice1.roll().toString());
        }
    }
}
