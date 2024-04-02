public class App {
    public static void main(String[] args) {
        int x = 2;
        //System.out.println(x);
        x = x * 2;
        //System.out.println(x);
        x *= 2;
        //System.out.println(x);

        // for initialization; continue condition; incremental rule
        for (int i = 0; i < 3; i++) {
            // Step 1: int i = 0
            // Step 2: i<3? yes
            // Step 3: Print hello world
            // Step 4: i++ -> i become 1
            // Step 5: i<3? yes
            // Step 6: Print hello world
            // Step 7: i++ -> i become 2
            // Step 8: i<3? yes
            // Step 9: Print hello world
            // Step 10: i++-> i become 3
            // Step 11: i<3? no -> exit loop
            // System.out.println("hello world round");
        }

        // 5,4,3,2,1,0
        for (int i = 5; i >= 0; i++) {

        }

        // Ex: print out: 1,3,5,7,9
        for (int i = 1; i <= 9; i += 2) {
            // System.out.println(i);
        }

        for (int i = 1; i <= 9; i++) {
            if (i % 2 == 1) {
                // System.out.println(i);
            }
        }

        String s = "abcdefg";
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                result += s.charAt(i);
                // System.out.println(result);
            }
        }

        //
        String Pattern = "cd";
        // Print true
        
        for (int i = 0; i <s.length()-Pattern.length() ; i++) {
            String temp="";
            for(int j=0; j<Pattern.length();j++){
                temp += s.charAt(i+j);
            }
            if(temp.equals(Pattern)){
                System.out.println("True");
            }
        }
        


            // System.out.println(temp)

        // 55 = 1+2....+10
        int max = 10;
        int min = 1;
        int sum = 0;
        for (int i = min; i <= max; i++) {
            sum += i;
            if (i == max) {
                //System.out.println("Sum is: "+sum);
            }
        }

        int sumOfEven = 0;
        int sumOfOdd = 0;
        for (int i = min; i <= max; i++) {
            if (i % 2 == 0) {
                sumOfEven += i;
            } else if (i % 2 != 0) {
                sumOfOdd += i;
            }
        }
        //System.out.println("Sum of Even number is: "+sumOfEven);
        //System.out.println("Sum of Odd number is: "+sumOfOdd);


        String str = "hello world";
        int count = 0;
        for(int i =0;i<str.length();i++){
            if(str.charAt(i)== 'l'){
                count += 1;
                //System.out.println(str.length()-1);
            }
            if(i==str.length()-1){
                //System.out.println("l appears " + count + " times");
            }
        }
    //sum up all odd number, and subtract all even numbers
    //1-2+3-4+5-6...
    int result2 = 0;
    for(int i = min;i<=max;i++){
        if(i%2 !=0){
            result2 += i;
        } else if(i%2 == 0){
            result2 -= i;
        }

        if(i == max){
            //System.out.println(result2);
        }
    }
}
}


    

