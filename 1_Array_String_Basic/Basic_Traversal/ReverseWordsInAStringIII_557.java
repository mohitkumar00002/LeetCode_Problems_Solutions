public class ReverseWordsInAStringIII_557 {
  public static void main(String[] args) {
    String s = "Let's take LeetCode contest";
    System.out.println(reverseWords(s));
  }
  
  static String reverseWords(String s){
    String[] words = s.split(" ");
    String result = "";

    for(int i=0;i<words.length;i++){
      String word = words[i];
      String rev = "";
      
      for(int j=word.length()-1;j>=0;j--){
        rev += word.charAt(j);
      }
      result = result + rev;

      if(i < words.length -1){
        result = result + " "; 
      }
    }
    return result;
  }
}


// Optimed solution
// public class ReverseWordsInAStringIII_557 {

//   static String reverseWords(String s) {
//     char[] arr = s.toCharArray();
//     int start = 0;

//     for (int i = 0; i <= arr.length; i++) {
//       if (i == arr.length || arr[i] == ' ') {
//         reverse(arr, start, i - 1);
//         start = i + 1;
//       }
//     }
//     return new String(arr);
//   }

//   static void reverse(char[] arr, int left, int right) {
//     while (left < right) {
//       char temp = arr[left];
//       arr[left] = arr[right];
//       arr[right] = temp;
//       left++;
//       right--;
//     }
//   }

//   public static void main(String[] args) {
//     String s = "Let's take LeetCode contest";
//     System.out.println(reverseWords(s));
//   }
// }
