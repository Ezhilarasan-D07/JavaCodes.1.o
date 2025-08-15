import java.util.Scanner;

public class PalindromeNumber {
   static boolean isNumberPalindrome (int num) {
      int reverse = 0;
      int dum = num;
      while (dum > 0) {
         reverse = dum % 10 + reverse * 10;
         dum /= 10;
      }  return (reverse == num);
   }

   public static void main (String ... args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the number : ");
      int number = input.nextInt();
      boolean palindrome = isNumberPalindrome(number);
      if (palindrome) {
         System.out.println(number + " is a palindrome number");
      }  else {
         System.out.println(number + " is not a palindrome number");
      }
      input.close();
   }
}
