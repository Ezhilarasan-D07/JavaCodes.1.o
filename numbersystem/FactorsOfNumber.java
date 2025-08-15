import java.util.*;

public class FactorsOfNumber {
   static ArrayList <Integer> factorsOfNumber (int num) {
      ArrayList <Integer> factors = new ArrayList <> ();
      int ind = 1;
      while (ind <= num / 2) {
         if (num % ind == 0)  
            factors.add(ind);
         ind += 1;
      }  return factors;
   }

   public static void main(String ... args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the number : ");
      int number = input.nextInt();
      System.out.println("the factors of " + number + " is " + factorsOfNumber(number));
      input.close();

   }
}
