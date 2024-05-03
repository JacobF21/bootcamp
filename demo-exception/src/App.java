import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //checked exception(compile time exception)

        //unchecked exception(run-time exception)
        //if salary array contain negative value, you treat total as 0
        int total =0;
        try{
            total = totalSalary(new int[] {100,-10,45}); //java.lang.IllegalArgumentException
        } catch(IllegalArgumentException e){
            total=0;
        }
        //System.out.println("total="+total);

        int x = 0;
        int r = x ==0 ? 0: 8/x; //java.lang.ArithmeticException / by zero
        int r2;

        try{
            r2=8/x;
        } catch(ArithmeticException e){
            r2 =0;
        }
        System.out.println(r2);

       try{
            getString(new char[]{'c','a','t'}, 0, 4);
       }catch(ArrayIndexOutOfBoundsException e){
            //...
       }

       String s ="hello";
       s=null;

       //Solution 1,not suggested
       try{
        System.out.println(s.charAt(0));
       } catch(NullPointerException e){

       }

       if(s != null){
        System.out.println(s.charAt(0));
       }

       //5. StringIndexOutOfBoundsException
       String s2 ="hello";
       try{
        System.out.println(s2.charAt(5));
       } catch(StringIndexOutOfBoundsException e){
        
       }

       int n1 =7;
       int n2 =-8;


       //6. IllegalStateExceptio
       try{
        check(n1, n2);
       }catch(IllegalStateException e){
        System.out.println("Handled illegal argument exception");
       }

       //7. NumberFormatException
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter your name: ");
       String name = scanner.nextLine();
       
       try{
        int num = Integer.parseInt(name);
        System.out.println(num);
       } catch(NumberFormatException e){

       }





    }

    public static String getString(char[] characters, int beginIdx, int endIdx){
        StringBuilder sb = new StringBuilder();
        for(int i= beginIdx;i<=endIdx;i++){
            sb.append(characters[i]);
        }
        return sb.toString();
    }

    public static int totalSalary(int[] arr){
        int sum=0;
        for(int x:arr){
            if(x<0) throw new IllegalArgumentException();
            sum+=x;
        }
        return sum;
    }

    public static void check(int n1, int n2){
        if(n1+n2 > 0){
            System.out.println(n1+n2);
        }
        throw new IllegalArgumentException();

    }
}
