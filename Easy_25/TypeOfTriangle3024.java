import java.util.Scanner;

public class TypeOfTriangle3024 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] nums = new int[3];
    for(int i=0;i<nums.length;i++){
      System.out.print("Enter element " + (i+1) + ": ");
      nums[i] = input.nextInt();
    }
    System.out.println(triangleType(nums));
  }
  static String triangleType(int[] nums) {
        int a = nums[0];
        int b = nums[1];
        int c = nums[2];

        if(a+b <= c || b+c <= a || a+c <= b){
            return "none";
        }
        if(a == b && b == c){
            return "equilateral";
        }
        if(a == b || b == c || c == a){
            return "isosceles";
        }
        return "scalene";
    }
  }

