import java.util.Scanner;
public class CountCharacters {
   static int findLength (String str) {
      int count = 0;
      for (char c: str.toCharArray()) {
         count += 1;
      }  return count;
   }
   
   public static void main(String ... args) {
      Scanner input = new Scanner (System.in);
      System.out.print("Enter the string : ");
      String str = input.next(); 
      input.close();
      System.out.println("Length: " + findLength(str));
   }
}
