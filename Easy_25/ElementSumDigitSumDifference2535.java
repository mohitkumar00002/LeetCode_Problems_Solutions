public class ElementSumDigitSumDifference2535 {
  public static void main(String[] args) {
    int[] nums = {1,15,6,3};
    System.out.println(AbsoluteDifference(nums));

  }
  static int AbsoluteDifference(int[] nums){
    int ElementSum = 0;
    int DigitSum = 0;

    for(int num : nums){
      ElementSum += num;
      int n = num;
      while(n>0){
        DigitSum += n%10;
        n /=10;
      }

    }
    return Math.abs(ElementSum - DigitSum);
  }
}
