public class DefangingAnIPAddress_1108 {
  public static void main(String[] args) {
    String address = "1.1.1.1";
    System.out.println(defangIPaddress(address));
  }

  static String defangIPaddress(String add) {
    String defangAdd = "";

    for (int i = 0; i < add.length(); i++) {
      if (add.charAt(i) == '.') {
        defangAdd += "[.]";
      } 
      else {
        defangAdd += add.charAt(i);
      }
    }
    return defangAdd;
  }
}
