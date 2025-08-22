import java.util.Scanner;
public class CheckPalindrome {
   static boolean checkIsPalindrome (String str) {
      int lftEnd = 0, rytEnd = str.length() - 1;
      while (lftEnd <= rytEnd) {
         if (str.charAt(lftEnd) != str.charAt(rytEnd))
            return false;
         lftEnd += 1;
         rytEnd -= 1;
      }  return true;
   }
   public static void main(String ... args) {
      Scanner input = new Scanner (System.in);
      System.out.print("Enter the string : ");
      String str = input.next(); 
      input.close();
      System.out.println("Is palindrome String : " + checkIsPalindrome(str));
   }
}