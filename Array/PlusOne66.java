import java.lang.reflect.Array;
import java.util.Arrays;

public class PlusOne66 {
  public static void main(String[] args){
    int[] digits = {4,5,6,3};
    System.out.println(Arrays.toString(PlusOne(digits)));
  }
  static int[] PlusOne(int[] digits){
    int[] newDigits = new int[digits.length + 1];
    int end = digits.length - 1;
    for(int i=end;i>=0;i--){
      if(digits[i] < 9){
        digits[i]++;
        return digits;
      }
      digits[i] = 0;
      
    }
    newDigits[0] = 1;
    return newDigits;
  }
}