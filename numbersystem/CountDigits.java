import java.util.Scanner;

public class CountDigits {
   static int countTheDigit (int num) {
      int count = 0;
      while (num > 0) {
         num = num / 10;
         count += 1;
      }  return count;   
   }

   public static void main(String ... args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the number : ");
      int number = input.nextInt();
      System.out.print("The total digit present in " + number + " is " + countTheDigit(number));
      input.close();
   }
}
