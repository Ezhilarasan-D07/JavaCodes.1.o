import java.util.Scanner;

public class ReverseNumber {
   static int reverseDigit (int num) {
      int reverse = 0;
      while (num > 0) {
         reverse = num % 10 + reverse * 10;
         num /= 10;
      }  return reverse;
   }

   public static void main(String ... args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the number : ");
      int number = input.nextInt();
      System.out.print("The reverse digit of " + number + " is " + reverseDigit(number));
      input.close();
   }
}
