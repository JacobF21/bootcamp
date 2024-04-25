import java.util.PriorityQueue;

public class CustomPriorityQueueExample {
  public static void main(String[] args) {
    PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new CustomComparator());
  
    priorityQueue.add(30);
    priorityQueue.add(14);
    priorityQueue.add(50);
    priorityQueue.add(10000);
    priorityQueue.add(17);
    priorityQueue.add(19);
    System.out.println(priorityQueue);


    while (!priorityQueue.isEmpty()) {
      long startTime = System.nanoTime();
      System.out.println(priorityQueue.poll());
      long endTime = System.nanoTime();
      System.out.println("time is: "+(endTime-startTime));
  }
  
  
  }
}
