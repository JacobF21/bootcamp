package dice;

import java.util.Arrays;
import java.util.Random;

public class Dice1 implements Roll {
  
  private final Color[] colors = {Color.BLACK,Color.BLUE,Color.PINK,Color.RED,Color.WHITE,Color.YELLOW};

  public Color[] getColors(){
    return this.colors;
  }

  public String toString(){
    return "Dice1(" //
          +"colors="+Arrays.toString(this.colors);
  }

  public int roll(){
    int idx = new Random().nextInt(6);
    return colors[idx].getValue();
  }

  public static void main(String[] args) {
    Dice1 d = new Dice1();
    d.getColors()[1] = Color.RED;
    System.out.println(d.toString());
  }
}
