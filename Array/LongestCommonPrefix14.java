public class LongestCommonPrefix14 {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs));
    }

    static String longestCommonPrefix(String[] strs) {
      String prefix = "";
        // Edge case
        if (strs == null || strs.length == 0) {
            return prefix;
        }

        

        // Outer loop → character index of first string
        for (int i = 0; i < strs[0].length(); i++) {
            char ch = strs[0].charAt(i);

            // Inner loop → remaining strings
            for (int j = 1; j < strs.length; j++) {

                // Length check OR mismatch check
                if (i >= strs[j].length() || strs[j].charAt(i) != ch) {
                    return prefix;
                }
            }

            // Agar sab strings me match ho gaya
            prefix += ch;
        }

        return prefix;
    }
}

