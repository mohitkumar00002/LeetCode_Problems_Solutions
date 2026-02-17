public class SortArrayByParity_905 {
  public static void main(String[] args) {
    int[] nums = {3,1,2,4,6,5};
    int[] result = sortArrayByParity(nums);
    for(int num : result){
      System.out.print(num + " ");
    }
  }
  static int[] sortArrayByParity(int[] nums){
    int left = 0;
    int right = nums.length -1;
    while(left < right){
      // agar left odd aur right even hai → swap
      if(nums[left] % 2 > nums[right] % 2){
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
      }
      // even hai to left aage badhao
      if(nums[left] % 2 == 0) left++;

      // odd hai to right peeche lao
      if(nums[right] % 2 == 1) right--;
    }
    return nums;

  }
}
