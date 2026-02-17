public class FindNumbersWithEvenNumbersOfDigits_1295 {
  public static void main(String[] args) {
    int[] nums = {12, 345, 2, 6, 7896};
    System.out.println(findNumbers(nums));
  }

  static int findNumbers(int[] nums) {
    int numsCount = 0;

    for (int i = 0; i < nums.length; i++) {
      int digitsCount = 0;
      int temp = nums[i];

      if (temp == 0) {
        digitsCount = 1;
      }

      while (temp > 0) {
        digitsCount++;
        temp /= 10;
      }

      if (digitsCount % 2 == 0) {
        numsCount++;
      }
    }
    return numsCount;
  }
}
