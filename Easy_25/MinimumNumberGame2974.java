// import java.util.Arrays;

// public class MinimumNumberGame2974 {
//   public static void main(String[] args) {
//     int[] nums = {5,4,2,3};

//     int[] result = numberGame(nums);
//     System.out.println(Arrays.toString(result));
//   }

//   static int[] numberGame(int[] nums){
//     Arrays.sort(nums);
//     int[] arr = new int[nums.length];
//     int index = 0;

//     for (int i = 0; i < nums.length; i += 2) {
//       arr[index++] = nums[i + 1];
//       arr[index++] = nums[i];
//     }
//     return arr;
//   }
// }

import java.util.Arrays;
public class MinimumNumberGame2974 {
  public static void main(String[] args) {
    int[] nums = {5,4,2,3,9,6};
  }
  static int[] minimumNumber(int[] nums){
    Arrays.sort(nums);
    int[] arr = new int[nums.length];
    int index = 0;
    for(int i=0;i<arr.length;i+=2){
      arr[index++] = nums[i+1];
      arr[index++] = nums[i];
    }
    return arr;
  }
}