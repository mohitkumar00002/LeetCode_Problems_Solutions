import java.util.Scanner;

public class MaximumAchievableNumber2769 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = input.nextInt();
        System.out.print("Enter the value of t: ");
        int t = input.nextInt();
        System.out.println(theMaximumAchievableX(num, t));
    }
    static int theMaximumAchievableX(int num, int t) {
        int max = num + t * 2;
        return max;

    }
}