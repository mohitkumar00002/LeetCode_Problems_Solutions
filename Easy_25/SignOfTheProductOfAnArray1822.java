public class SignOfTheProductOfAnArray1822 {
  public static void main(String[] args) {
    int[] nums = {-1,-2,-3,-4,3,2,1};
  }
  static int arraySign(int[] nums){
    int negCount = 0;
    for(int num : nums){
      if(num == 0){
        return 0;
      }
      if(num < 0){
        negCount++;
      }
    }
    if(negCount % 2 == 0) return 1;
    return -1;
  }
}