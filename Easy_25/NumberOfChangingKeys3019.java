import java.util.Scanner;

public class NumberOfChangingKeys3019 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the string: ");
    String str = input.nextLine();
    System.out.println(countKeyChanges(str));
  }
  static int countKeyChanges(String str){
    int count = 0;
    String upperStr = str.toUpperCase();
    for(int i=1;i<str.length();i++){
      if(upperStr.charAt(i) != upperStr.charAt(i-1)){
        count++;
      }
    }
    return count;
  }
}
