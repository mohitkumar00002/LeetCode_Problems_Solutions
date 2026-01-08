import java.util.Scanner;

public class NumberOfEmployeesWhoMeetTheTarget2978 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] hours = {0,1,2,3,4,5,6,7,8,9,10};
    System.out.print("Enter the target : ");
    int target = input.nextInt();
    System.out.println(numberOfEmployeesWhoMetTarget(hours, target));
  }
  static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;
        for(int i= 0; i<hours.length; i++){
            if(hours[i] >=target){
                count++;
            }
        }
        return count;
    }
}
