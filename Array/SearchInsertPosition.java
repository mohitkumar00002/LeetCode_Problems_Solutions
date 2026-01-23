import java.util.Scanner;

public class SearchInsertPosition {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the target : ");
    int target = input.nextInt();

    int[] nums = {1,3,5,6,7};
    System.out.println(searchInsert(target, nums));
  }
  static int searchInsert(int target, int[] nums){
    int start =0;
    int end = nums.length - 1;
    while(start <= end){
      int mid = start + (end - start)/2;
      if(target == nums[mid]){
        return mid;
      }
      if(target < nums[mid]){
        end = mid - 1;
      }
      else{
        start = mid + 1;
      }
    }
    return start;
  }
}
