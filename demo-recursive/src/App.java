public class App {
    public static void main(String[] args){
        
        int result =1;
        for(int i =1 ;i<=5;i++){
             result*=i;
        }
        System.out.println(result);
        System.out.println(multiply(5));
        System.out.println(fibonacci(10));
        System.out.println(sumOfFibonacci(10));
    }
    public static int multiply(int n){
        //base case
        if(n<=1){
            return 1;
        }

        return n*multiply(n-1);
        // 5*(5-1) -> waiting 1 release 4
        // 4*(4-1) -> waiting 2 release 3
        // 3*(3-1) -> waiting 3 release 2
        // 2*(2-1) -> waiting 4 release 1
        // 1 -> return 1
    }

    public static int fibonacci(int n){
        //base case
        if(n <=0){
            System.out.println("Invalid input");
            return -1;
        } else if(n==1){
            return 0;
        } else if (n==2){
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }

    public static int sumOfFibonacci(int n){
        if(n <=0){
            System.out.println("Invalid input");
            return -1;
        } else if(n==1){
            return 0;
        } else if(n==2){
            return 1;
        }

        return sumOfFibonacci(n-1)+fibonacci(n);
    }

}
