import java.util.Scanner;

public class LeapYear {
   static boolean isLeap (int year) {
      return (year % 400 == 0 || year % 100 != 0 && year % 4 == 0) ? true : false;
   }

   public static void main(String ... args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the year : ");
      int year = input.nextInt();
      input.close();
      if (isLeap(year)) 
         System.out.print(year + " is a leap year.");
      else 
         System.out.print(year + "is not a leap year.");  
   }
}
