public class BuildArrayFromPermutation_1920 {
  public static void main(String[] args) {
    int[] nums = {0,2,1,5,3,4};
    int[] result = buildArray(nums);
    for(int num : result){
      System.out.println(num + " ");
    }
  }
  static int[] buildArray(int[] nums){
    int n = nums.length;
    int[] ans = new int[n];
    for(int i=0; i<n; i++){
      ans[i] = nums[nums[i]];
    }
    return ans;
  }
}