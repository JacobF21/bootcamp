public class Result {
  private State state;
  private int num;

  public Result(State state, int num) {
    this.state = state;
    this.num = num;
  }

  public State getState() {
    return this.state;
  }

  public int getNumber() {
    return this.num;
  }

  public String toString() {
    return "Result(" + this.num + ", " + this.state + ")";
  }
}
