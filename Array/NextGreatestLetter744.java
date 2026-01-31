import java.util.Scanner;

public class NextGreatestLetter744 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    char[] letters = {'x','x','y','y'};
    System.out.print("Enter the targeted character : ");
    char target = input.next().charAt(0);
    System.out.println(nextGreatestLetter(letters, target));
  }
  static char nextGreatestLetter(char[] letters, char target){
    for (int i = 0; i < letters.length; i++) {
            if (letters[i] > target) {
                return letters[i];
            }
        }
        // wrap-around case
        return letters[0];
  }
}