// import java.util.Scanner;

// public class FirstUniqueChar387 {
//   public static void main(String[] args) {
//     Scanner input = new Scanner(System.in);
//     System.out.print("Enter the string: ");
//     String str = input.nextLine();
    
//   }
//   static int FirstUniqChar(String s){
//     int count = 0;
//     for(int i=0;i<s.length();i++){
//       for(int j=1;i<s.length();j++){
//         if(s.charAt(i) == s.charAt(j)){
//           count++;
//         }
//       }
//       if(count == 1){
//         return i;
//       }
//     }
//     return -1;
//   }
// }


// second approach with O(n)

import java.util.Scanner;

public class FirstUniqueChar387 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the string: ");
    String str = input.nextLine();
    System.out.println(firstUniqChar(str));
    
  }
    static int firstUniqChar1(String s) {

        int[] freq = new int[26]; // a-z ke liye

        // Step 1: frequency count
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        // Step 2: first unique find karo
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }

    static int firstUniqChar(String s) {

        int[] freq = new int[26];

        // frequency count
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);        // character nikala
            int index = ch - 'a';         // index nikala
            freq[index] = freq[index] + 1;
        }

        // first unique character
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int index = ch - 'a';

            if (freq[index] == 1) {
                return i;
            }
        }

        return -1;
    }
}


