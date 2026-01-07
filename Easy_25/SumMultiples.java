import java.util.Scanner;

public class SumMultiples {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the End Number: ");
    int endNum = input.nextInt();
    System.out.println(sumMultiples(endNum));
  }
  static int sumMultiples(int n){
    int sum = 0;
    for(int i=1;i<=n;i++){
      if(i%3==0 || i%5==0 || i%7==0){
        sum +=i;
      }
    }
    return sum;
  }
}