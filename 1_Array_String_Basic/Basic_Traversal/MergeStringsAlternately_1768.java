public class MergeStringsAlternately_1768 {
  public static void main(String[] args) {
    String word1 = "abc";
    String word2 = "pqr";
    System.out.println(mergeAlternately(word1, word2));
  }

  static String mergeAlternately(String word1, String word2) {
    StringBuilder sb = new StringBuilder();

    int i = 0;
    int j = 0;
    while (i < word1.length() && j < word2.length()) {
      sb.append(word1.charAt(i));
      sb.append(word2.charAt(j));
      i++;
      j++;
    }

    // Remaining characters
    while (i < word1.length()) {
      sb.append(word1.charAt(i));
      i++;
    }

    while (j < word2.length()) {
      sb.append(word2.charAt(j));
      j++;
    }

    return sb.toString();
  }

}

// without string builder

// public class MergeStringsAlternately_1768 {
// public static void main(String[] args) {
// String str1 = "abc";
// String str2 = "pqr";

// System.out.println(mergeString(str1, str2));
// }

// static String mergeString(String s1, String s2){
// String result = "";
// int i = 0;
// int j = 0;

// while(i < s1.length() && j < s2.length()){
// result += s1.charAt(i);
// result += s2.charAt(j);
// i++;
// j++;
// }

// while(i < s1.length()){
// result += s1.charAt(i);
// i++;
// }

// while(j < s2.length()){
// result += s2.charAt(j);
// j++;
// }

// return result;
// }
// }
