import java.util.Scanner;

public class SubtractTheProductAndSum1281 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int num = input.nextInt();
    System.out.println(subtractProductAndSum(num));
  }

  static int subtractProductAndSum(int n) {
        int sum = 0;
        int product = 1;
        while(n>0){
            int lastDigit = n % 10;
            sum += lastDigit;
            product *= lastDigit;
            n /= 10;
        }

        return product - sum;
    }
}