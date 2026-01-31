public class SingleNumber136 {
  public static void main(String[] args) {
    int[] nums = {1,2,3,4,5,4,3,2,1};
  }
  static int singleNumber(int[] nums){
    int result = 0;
    for(int i=0;i<nums.length;i++){
      result ^= nums[i];
    }
    return result;
  }
}
