import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        LinkedList<String> strings = new LinkedList<>();
        strings.add("hello");
        strings.add("world");
        //System.out.println(strings.size());

        //strings.remove(1);//[hello]
        //System.out.println(strings);
        //System.out.println(strings.contains("hello"));//true

        //ArrayList methods != LinkedList methods
        //ArrayList and LinkedList has it own methods
        //LinkedList is not build on array -> LinkedList is an matrix

        List<String> ls = new LinkedList<>();
        ls.add("abc");
        ls.add("def");
        ls.add("haha");
        for(int i =0;i< ls.size();i++){
            System.out.println(ls.get(i));
        }

        for(String s : ls){
            if("def".equals(s)){
                System.out.println("this is def");
                break;
            }
        }



    }
}
