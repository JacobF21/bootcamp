package dice;

public class Player {
  Roll[] dices = new Roll[]{new Dice1(), new Dice2()};
  int sum = 0;
  for(Roll dice:dices){
    sum+=dice.roll();
  }
  return sum;
}
