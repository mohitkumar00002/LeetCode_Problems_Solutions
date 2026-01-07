// Input: num = 38
// Output: 2
// Explanation: The process is
// 38 --> 3 + 8 --> 11
// 11 --> 1 + 1 --> 2 
// Since 2 has only one digit, return it.

import java.util.Scanner;

public class AddDigits258 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int num = input.nextInt();
    System.out.println(addDigits(num));
  }
  static int addDigits(int num){
    while (num>=10){
      int sum = 0;
      while(num>0){
        int lastDigit = num%10;
        sum += lastDigit;
        num /= 10;
      }
      num = sum;
    }
    return num;
  }
}