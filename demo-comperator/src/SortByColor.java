import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
public class SortByColor implements Comparator<Ball>{
  
  @Override
  public int compare(Ball b1, Ball b2){
    return b1.getColor().name().charAt(0) > b2.getColor().name().charAt(0)? -1:1;
  }

  public static void main(String[] args) {
    List<Ball> balls = new LinkedList<>();
    balls.add(new Ball(Color.BLACK, 10));
    balls.add(new Ball(Color.RED, 20));
    balls.add(new Ball(Color.YELLOW, 13));
    balls.add(new Ball(Color.YELLOW, 3.4));
    //sort() is calling a comparaeTo method, the writer of the Class has the right to determine the rule of the sorting
    //Collections.sort(balls, new SortByColor());//Compile-time check if the list of the objects implements a contracr
    //System.out.println(balls);

    int random = new Random().nextInt(2);
    Comparator<Ball> formula = null;
    if(random==1){
      formula = new SortByColor();
    }else if(random ==2){
      //formula = new SortBySize();
    }
    Collections.sort(balls, formula);
    System.out.println(balls);
  }
}
