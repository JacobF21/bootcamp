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

        String[] stringArr = new String[2];
        stringArr[0]="Demo";
        stringArr[1]="Demo2";
        System.out.println(stringArr[0]);
        System.out.println(stringArr[1]);

        double[] doubleArr = new double[3];
        doubleArr[0]=1.5;
        doubleArr[1]=2.5;
        doubleArr[2]=3.5;
        System.out.println(doubleArr[0]);
        System.out.println(doubleArr[1]);
        System.out.println(doubleArr[2]);





    }
}
