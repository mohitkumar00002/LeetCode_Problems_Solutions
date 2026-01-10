import java.util.Scanner;

public class DivisinbleAndNonDivisibleSumDifference2894 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the value of n: ");
    int n = input.nextInt();
    System.out.print("Enter the value of m: ");
    int m = input.nextInt();

  }
  static int differenceOfSums(int n, int m){
    int sum1 = 0;
    int sum2 = 0;

    for(int i=1;i<=n;i++){
      if(i%m != 0){
        sum1 += i;
      }
      else{
        sum2 += i;
      }
    }
    return sum1 - sum2;
  }
}