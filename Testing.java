import java.util.Arrays;

public class Testing{
  public static void main(String[] args){
        int n =2;
        int copyOfN = n;
        int noOfBit = 0;
        while(copyOfN>1){
            copyOfN = copyOfN%2 + copyOfN/2;
            noOfBit++;
        }
        if(copyOfN ==1){
          noOfBit++;
        }
        System.out.println(noOfBit);
        System.out.println(n);
    
    int[] result = new int[noOfBit];
    for(int i=noOfBit -1;i>-1;i--){
        result[i] = n%2;
        n = n/2;
        //System.out.println(n);
    }
    System.out.println(Arrays.toString(result));
  }
}