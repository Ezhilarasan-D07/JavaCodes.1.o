import java.util.Scanner;

public class ArmstrongNumber {
   static String isArmstrongNumber (int num) {
      int originalNumber = num, sum = 0;
      while (num > 0) {
         int digit = num % 10; 
         sum += digit * digit * digit;
         num /= 10;
      }  

      if (originalNumber == sum)
         return "is an armstrong number";
      return "is not an armstrong number";
   }

   public static void main(String ... args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the number : ");
      int number = input.nextInt();
      System.out.print("The given " + number + " is " + isArmstrongNumber(number));
      input.close();
   }
}
