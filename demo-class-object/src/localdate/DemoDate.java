package localdate;
import java.time.LocalDate;
import java.time.Month;
import java.util.Random;

//java Project/File: Auto-imported -> java.lang (Math)

public class DemoDate {
  public static void main(String[] args) {
    LocalDate day = LocalDate.of(2023, 12, 1);
    System.out.println(day.toString());
    LocalDate day2 = LocalDate.parse("2023-12-01");
    System.out.println(day2.toString());

    System.out.println(day == day2);//false
    System.out.println(day.isEqual(day2));//true

    LocalDate now = LocalDate.now();
    LocalDate future= now.plusDays(5);
    System.out.println(now.isAfter(future));//false
    System.out.println(now.isBefore(future));//ture
    System.out.println(now.isEqual(future));//false

    int year = now.getYear();
    Month month = now.getMonth();
    System.out.println(month.length(false));//30
    System.out.println(Month.of(2).length(true));//28

    int random =new Random().nextInt(3);
    System.out.println(random);
    int count0 = 0;
    int count1 = 0;
    int count2 = 0;

    int random2 = 0;
    for(int i=0;i<100;i++){
      random2 =new Random().nextInt(3);
      if(random2 ==0){
        count0++;
      } else if(random2 ==1){
        count1++;
      }else if(random2==2){
        count2++;
      }

    }
    System.out.println(count0);
    System.out.println(count1);
    System.out.println(count2);
  }
}
