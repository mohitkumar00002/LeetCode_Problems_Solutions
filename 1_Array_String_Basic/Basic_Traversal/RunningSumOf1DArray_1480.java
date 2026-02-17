public class RunningSumOf1DArray_1480 {
  public static void main(String[] args) {
    int[] nums = {1,2,3,4,5};
    int[] result = runningSum(nums);
    for(int num : result){
      System.out.println(num + " ");
    }
  }
  
  static int[] runningSum(int[] nums){
    int[] ans = new int[nums.length];
    int sum = 0;
    for(int i=0;i<nums.length;i++){
      sum += nums[i];
      ans[i] =  sum;
    }
    return ans;
  }
}