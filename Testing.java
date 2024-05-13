import java.util.Arrays;

public class Testing{
  public static void main(String[] args){
    int a = 12;  // Binary: 1100
    int b = 9;   // Binary: 1001
    
    int bitwiseAnd = a & b;         // Binary: 1000 (8 in decimal)
    int bitwiseOr = a | b;          // Binary: 1101 (13 in decimal)
    int bitwiseXor = a ^ b;         // Binary: 0101 (5 in decimal)
    int bitwiseNotA = ~a;           // Binary: 0011 (-13 in decimal)
    int leftShiftA = a << 2;        // Binary: 110000 (48 in decimal)
    int rightShiftB = b >> 2;       // Binary: 0010 (2 in decimal)
    int unsignedRightShiftB = b >>> 2;

    System.out.println(bitwiseAnd);
    System.out.println(bitwiseOr);
    System.out.println(bitwiseXor);
    System.out.println(bitwiseNotA);
    System.out.println(leftShiftA );
    System.out.println(rightShiftB);
    System.out.println(unsignedRightShiftB);
    String one = "Yellow";    
    String two = "YELLOW";
    System.out.println(one == two);    

  }
}