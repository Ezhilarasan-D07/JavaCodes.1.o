
import java.util.Scanner;

public class FindPrimeInFibonacci {
   static int fibonacci (int num) {
      if (num <= 1)
         return num;
      return fibonacci (num - 1) + fibonacci (num - 2);
   }

   static boolean isPrime (int num) {
      if (num <= 1) 
         return false;
      int ind = 2;
      while (ind * ind <= num) {
         if (num % ind == 0)
            return false;
         ind += 1;
      }  return true;
   }

   static public void main (String ... args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the number : ");
      int number = input.nextInt(); // limit.
      int ind = 0;
      while (true) {
         int fib = fibonacci(ind);
         if (fib > number)
            break;
         if (isPrime(fib))
            System.out.print(fib + " ");
         ind += 1;
      }  input.close();
   }
}