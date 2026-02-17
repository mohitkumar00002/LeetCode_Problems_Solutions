// Approach - 1

// public class NumberOfGoodPairs_1512 {
//   public static void main(String[] args) {
//     int[] nums = {1,2,3,1,1,3};   // There are 4 good pairs (0,3), (0,4), (3,4), (2,5)
//     System.out.println(numIdenticalPairs(nums));

//   }
//   static int numIdenticalPairs(int[] nums){
//     int pairs = 0;
//     for(int i=0;i<nums.length;i++){
//       for(int j=i+1;j<nums.length;j++){
//         if(nums[i] == nums[j]){
//           pairs++;
//         }
//       }
//     }
//     return pairs;
//   }
// }


// Approach - 2

// import java.util.*;
// class Solution {
//   public int numIdenticalPairs(int[] nums) {
//     HashMap<Integer, Integer> map = new HashMap<>();
//     int pairs = 0;

//     for (int num : nums) {
//       if (map.containsKey(num)) {
//         pairs += map.get(num);
//       }
//       map.put(num, map.getOrDefault(num, 0) + 1);
//     }
//     return pairs;
//   }
// }

// Approach - 3

class Solution {
  public int numIdenticalPairs(int[] nums) {
    int[] freq = new int[101];
    int pairs = 0;

    for (int num : nums) {
      pairs += freq[num];
      freq[num]++;
    }
    return pairs;
  }
}
