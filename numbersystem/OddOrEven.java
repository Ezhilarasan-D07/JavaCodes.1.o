import java.util.*;

public class OddOrEven {
   static String oddOrEven (int num) {
      return (num % 2 != 0) ? num + " is Odd" : num + " is Even";
   }
   public static void main (String ... args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the number : ");
      int number = input.nextInt();
      input.close();
      System.out.println(oddOrEven(number));
   }
}
