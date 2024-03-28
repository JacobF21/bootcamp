public class App {
    public static void main(String[] args){
        //9 types = Primitives + String
        //int x=2;
        //Sting s = "abc";

        //Array (Store a set of same type of value)
        int[] arr=new int[3];
        //Assign value to the int array
        arr[0] = 100;
        arr[1] = 2;
        arr[2] = -100;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        //arr[0] = 3;
        //System.out.println(arr[0]);
        //System.out.println(arr[1]);
        //System.out.println(arr[2]);

        //Create another int array to the original array, the original array is deleted in ram
        arr =new int[4];
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);


    }
}
