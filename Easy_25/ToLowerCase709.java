import java.util.Scanner;

public class ToLowerCase709 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String s = input.nextLine();
    System.out.println(toLowercase(s));

  }
  static String toLowercase(String s){
    String lc = s.toLowerCase();
    return lc;
  }
}