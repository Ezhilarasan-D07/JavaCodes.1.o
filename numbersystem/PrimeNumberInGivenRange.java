import java.util.ArrayList;
import java.util.Scanner;
public class PrimeNumberInGivenRange {
   static ArrayList <Integer> findPrimeInRange (int num) {
      ArrayList <Integer> primeNumbers = new ArrayList <> ();     
      for (int ind = 0; ind <= num; ind += 1) {
         if (isPrimeNumber(ind))
            primeNumbers.add(ind);
      }  return primeNumbers;
   } 

   static boolean isPrimeNumber (int num) {
      if (num <= 1)  return false;
      int ind = 2; 
      while (ind * ind <= num) {
         if (num % ind == 0) return false;
         ind += 1;
      }  return true;
   }

   static public void main (String ... args) {
      Scanner input = new Scanner (System.in);
      System.out.print("Enter the number : ");
      int number = input.nextInt();
      System.err.print("The prime numbers in a given range is " + findPrimeInRange(number));
      input.close();
   }
}
