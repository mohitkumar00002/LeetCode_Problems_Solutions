public class ToLowerCase_709 {

  public static void main(String[] args) {
    String s = "Java PrograMMing";

    System.out.println(toLowerCaseBuiltIn(s));
    System.out.println(toLowerCaseASCII(s));
  }

  // using built-in method
  static String toLowerCaseBuiltIn(String s) {
    return s.toLowerCase();
  }

  // using ASCII value approach : 
  // 'A' → 65
  // 'a' → 97
  // Difference = 32
  
  static String toLowerCaseASCII(String s) {
    String result = "";

    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);

      if (ch >= 'A' && ch <= 'Z') {
        ch = (char) (ch + 32);
      }
      result += ch;
    }
    return result;
  }
}
