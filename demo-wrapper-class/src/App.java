public class App {
    public static void main(String[] args) {
        int x = 1; // +,-,*,/,%
        Integer x2 = 1;// Integer wrapper class -> object (i.e. String.class -> String Object)
        Integer x3 = new Integer(1);
        // System.out.println(x3);
        // System.out.println(x2);

        long example = 10L;
        Long example2 = new Long(10L);

        short example3 = 5;
        Short example4 = new Short("5");

        char example5 = 'a';
        Character example6 = 'a';

        byte example7 = 1;
        Byte example8 = 1;

        float example9 = 1.2f;
        Float example10 = 1.2f;

        double example11 = 1.44;
        Double example12 = 1.33;

        boolean example13 = true;
        Boolean example14 = true;

        if (x2.equals(1)) {
            // System.out.println("x2=1"); compare opertior in object is diff with primitive value
        }

        if (x2 == 1) {
            // System.out.println("x2=1");
        }

        x2 = 128;
        if (x2 == 128) {
            // System.out.println("x2=128");
        }

        // Key!!!!!!
        // In the world of Java, -128 - 127 are pre-created if we do not use new to create a new object
        Integer num1 = Integer.valueOf(127);// valueOf() -> "new" a Integer object
        Integer num2 = Integer.valueOf(127);
        // "==" is checking if they are same object
        // System.out.println(num1 == num2);//true
        // equals() is checking if they are with same value
        // System.out.println(num2.equals(num2)); //true

        Integer num5 = new Integer("127");
        // System.out.println(num1 == num5); //false

        Integer num3 = Integer.valueOf(128);
        Integer num4 = Integer.valueOf(128);
        // System.out.println(num3 == num4);//false
        // System.out.println(num3.equals(num4)); //true

        String str = "hello";
        String str2 = "hello";
        String str3 = new String("hello");
        String str4 = String.valueOf("hello");
        // System.out.println(str == str2);//true
        // System.out.println(str == str3);//false
        // System.out.println(str == str4);//true
        // System.out.println(str.equals(str2));//true
        // System.out.println(str.equals(str3));//true

        String testing1 = "hello";
        String testing2 = "hello";
        System.out.println(testing1 == testing2);
        testing2 = testing2.replace("h", "i");
        System.out.println(testing1 == testing2);
        testing2 = testing2.replace("i", "h");
        System.out.println(testing1 == testing2);

        Double d2 = 1.0;
        Double d3 = 1.0;
        Double d4 = Double.valueOf(1.0);
        // System.out.println(d2 == d3); //false
        // System.out.println(d2 == d4); //false
        // System.out.println(d2.equals(d3)); //true
        // System.out.println(d2.equals(d4)); //true
        System.out.println(d2.compareTo(d3));

        //17 Types(8 primitives + 8 wrapper class) + array
        Integer i1=3;//assign int value 3 to Integer variable
        //3(int) -> integer object with value 3 -> autobox
        int i2 = i1;//i1 (integer object) -> unbox

        Character c2 = 'c';//autobox
        char c3 = c2; //unbox

        Integer i3 = 10;//autobox
        long l4 =i3; //integer -> int(unbox) -> long(upcast)
        //short s4 = i3; //intege -> int(unbox) ->xxx short

        int i5 =12;
        Long l5 = (long)i5;

        //Float.valueOf()
        Float f2 = Float.valueOf("1.0");
        //f2.compareTo -> 0,-1,1
        //f2.equals(.....) -> true, false




    }
}
