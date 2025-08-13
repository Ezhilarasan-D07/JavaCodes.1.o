
import java.util.Scanner;
public class LastDigit {
   static int getLastDigit (int num) {
      return num % 10;
   }

   public static void main(String ... args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the number : ");
      int number = input.nextInt();
      System.out.print("The last digit of " + number + " is " + getLastDigit(number));
      input.close();
   }
}
