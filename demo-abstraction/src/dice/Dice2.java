package dice;

import java.util.Arrays;
import java.util.Random;

public class Dice2 implements roll{
  
  private FCP fcp;
  private FCP[] fcps = {FCP.FISH, FCP.CRAB, FCP.PRAWN};

  public FCP[] geFcps(){
    return this.fcps;
  }

  @Override
  public int roll{
    int idx = new Random().nextInt(3);
    return fcps[idx].getValue();
  }

  @Override
  public String toString(){
    return "Dice2(" //
          +"fcps=" +Arrays.toString(this.fcps)+")";
  }
}
