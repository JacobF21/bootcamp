import java.util.Random;

public class Dice {
  private Number[] numbers = new Number[] {Number.ONE, Number.TWO, Number.THREE,
      Number.FOUR, Number.FIVE, Number.SIX};
  private State state = State.START;
  private Result result;

  public Result roll() {
    int idx = new Random().nextInt(6);
    result = new Result(this.changeState(numbers[idx].getValue()),numbers[idx].getValue());
    return result;
  }

  private State changeState(int num) {
    if (num == 6) {
      this.state = State.END;
      return State.END;
    }
    this.state = State.CONTINUE;
    return State.CONTINUE;
  }

  public State getState() {
    return this.state;
  }

}
