import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class KidsWithTheGreatestNumberOfCandies_1431{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] candies = {3,4,5,2,1,2};
    System.out.print("Enter the number of Extra Candies: ");
    int extraCandies = input.nextInt();
    System.out.println(kidsWithCandies(candies, extraCandies));
  }
  static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    // Step 1: find maximum
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < candies.length; i++) {
      if (candies[i] > max) {
        max = candies[i];
      }
    }

    //  Step 2: result list
    List<Boolean> ans = new ArrayList<>();

    for (int i = 0; i < candies.length; i++) {
      if (candies[i] + extraCandies >= max) {
        ans.add(true);
      } 
      else {
        ans.add(false);
      }
    }
    return ans;
  }
}
