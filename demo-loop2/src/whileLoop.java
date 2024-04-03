import java.util.Arrays;

public class whileLoop {
    public static void main(String[] args) {
        //1. initial value
        //2. continue condirion
        //3. increment/decrement
        for(int i=0;i<3;i++){
        }

        int[] arr = new int[]{2,10,3,-1};
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        //for-each loop
        //If you want to loop through all element from the beginning, you can use for-each
        for(int i:arr){
            System.out.println(i);//print the value
        }

        String[] strings= new String[]{"abc", "def", "ghi"};
        for(String str:strings){
            System.out.println(str);//print value
        }

        int count=0;
        while(count<strings.length){
            System.out.println(strings[count]);
            count++;
        }
        //If the condition is b<128, the loop will loop forever, coz byte -128-127
        byte b=0;
        while(b<127){
            b++;
            //System.out.println(b);
        }

        int a = 1023;
        int backup = 1023;
        int length =0;
        while(a%10<=10 && a!=0){
            length++;
            a /= 10;
        }
        System.out.println(length);
        //Target: int array[1,0,2,3]
        int[] result = new int[length];
        for(int i=length-1;i>=0;i--){
            result[i] = backup%10;
            backup /= 10;
            System.out.println(i);
        }
        System.out.println(Arrays.toString(result));

        //do-while loop
        int count2 =0;
        do{
            System.out.println("hello");
            count++;
        }   while (count<3);

    }
}
