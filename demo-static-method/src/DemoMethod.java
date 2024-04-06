public class DemoMethod {

    // static method
    // void is a return type, representing it should not return anything
    public static void main(String[] args) {

        int result = 1 + 3;
        int result2 = 1 + 3;

        result = sum(1, 3);
        result2 = sum(2, 5);

        int result3 = substract(6, 1);

        Integer m = 3;
        Integer n = 4;
        // if(m=n) avoid to use to compare the addreess instead of value
        if (m.compareTo(n) > 0) {

        }

        //System.out.println(area(3.2d));
        //System.out.println(area("Circle", 3.2d));
        //System.out.println(area("Square", 3.2d));
        System.out.println(calcualte("Circle", "area", 3.2d));
        System.out.println(calcualte("Circle", "perimeter", 3.2d));
        System.out.println(calcualte("Square", "area", 3.2d));
        System.out.println(calcualte("Square", "perimeter", 3.2d));
        System.out.println(isAdult(18));

        System.out.println(10%10);


    }

    // static method
    // sum is a method name
    // "int x","int y" is declaration of input parameter for method
    // "int" is also a return type
    // keyword "return" : for all non-void scenario
    public static int sum(int x, int y) {
        // int z = x + y;
        return x + y;
    }

    public static int substract(int x, int y) {
        // int z = x - y;
        return x - y;
    }

    // Method DefinitionL Method name + input Parameter(type & no. of parameter)
    public static double sum(double x, double y) {
        return x + y;
    }

    public static double sum(int x, double y) {
        return x + y;
    }

    public static int sum(String x, String y) {
        // Integer z = Integer.valueOf(x) + Integer.valueOf(y);// Convert string to integer
        return Integer.valueOf(x) + Integer.valueOf(y); // Integer + Integer -> int + int -> int
    }

    public static double area(double r) {
        return r * r * Math.PI;// bug
    }

    public static double area(String type, double length) {
        if ("Square".equals(type)) {
            return length * length;
        } else if ("Circle".equals(type)) {
            return length * length * Math.PI;
        }
        return -1.0;
    }

    public static double calcualte(String shape, String target, double x) {
        /* 
        if ("Square".equals(type) && "area".equals(target)) {
            return length * length;
        } else if ("Circle".equals(type) && "area".equals(target)) {
            return Math.sqrt(length)*Math.PI;
        } else if ("Square".equals(type) && "perimeter".equals(target)) {
            return 4*length;
        } else if ("Circle".equals(type) && "perimeter".equals(target)) {
            return 2 * length * Math.PI;
        }
        */
        if("area".equals(target)){
            if("Circle".equals(shape)){
                return Math.pow(x,2)*Math.PI;
            } else if("Square".equals(shape)){
                return Math.pow(x,2);
            }
        } else if("perimeter".equals(target)){
            if("Circle".equals(shape)){
                return 2*Math.PI*x;
            } else if("Square".equals(shape)){
                return 4*x;
            }
        }


        return -1.0;
    
    }

    public static boolean isAdult(int age){
        //Approach 1
        /*
         if(age >= 18){
            return true;
         }
         return false;
         */

        //Approach 2
        //return age >=18? true: false;

        //Approach 3
        return age>=18;
    }

}
