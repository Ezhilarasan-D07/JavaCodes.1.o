import java.util.*;

public class PrimeNumber {
   static boolean isPrimeNumber (int num) {
      if (num <= 1)
         return false;
      
      int ind = 2;
      while (ind * ind <= num) {
         if (num % ind == 0)  return false;
         ind += 1;
      }  return true;
   }
   public static void main (String ... args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter your number : ");
      int number = input.nextInt();
      input.close();
      if (isPrimeNumber(number)) {
         System.out.println(number + " is a prime number");
      }  else {
         System.out.println(number + " is not a prime number");
      }
   }
}
