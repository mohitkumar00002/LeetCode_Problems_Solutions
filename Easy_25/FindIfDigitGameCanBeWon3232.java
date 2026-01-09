public class FindIfDigitGameCanBeWon3232 {
  public static void main(String[] args) {
    int[] nums = {1,2,3,4,5,15};

  }
static boolean canAliceWin(int[] nums) {
    int singleSum = 0;
    int doubleSum = 0;

    for (int num : nums) {
        if (num < 10) {
            singleSum += num;
        } else {
            doubleSum += num;
        }
    }

    // Alice can choose either group
    return singleSum > doubleSum || doubleSum > singleSum;
}

}
