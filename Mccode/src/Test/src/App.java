import java.util.Iterator;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
           LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(2);
        linkedList.add(5);
        linkedList.add(2);
        //System.out.println("Original LinkedList: " + linkedList);
        Iterator<Integer> iterator = linkedList.iterator();
        if (!iterator.hasNext()) {
            System.out.println("Iterator is in the before-first position");
        }
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            if (iterator.next() == 2) {
                 iterator.remove();
            }
        }
        if (!iterator.hasNext()) {
            System.out.println("Iterator is in the off-the-end position");
        }
        //System.out.println("Original LinkedList: " + linkedList);


    }
}
