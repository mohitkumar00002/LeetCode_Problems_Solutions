import java.util.Scanner;

public class CountTheDigitsThatDivideNumber2520 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int num = input.nextInt();
    System.out.println(CountDigits(num));


  }
  static int CountDigits(int num){
    int count = 0;
    int newNum = num;
    while(num>0){
      int digit = num%10;
      if(newNum % digit == 0){
        count++;
      }
      num /= 10;
    }
    return count;
  }
}