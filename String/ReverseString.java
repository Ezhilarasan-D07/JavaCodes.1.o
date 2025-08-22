import java.util.Scanner;
public class ReverseString {
   static String reverseString (String str) {
      String reversed = "";
      for (int ind = str.length() - 1; ind >= 0; ind -= 1) {
         reversed += str.charAt(ind);
      }  return reversed;
   }

   static String reverseStringByTwoPointer (String str) {
      char charArr [] = str.toCharArray();
      int lftEnd = 0, rytEnd = charArr.length - 1;
      while (lftEnd <= rytEnd) {
         charArr[lftEnd] = (char)(charArr[rytEnd] + charArr[lftEnd] - (charArr[rytEnd] = charArr[lftEnd]));
         lftEnd += 1;
         rytEnd -= 1;
      }  return new String(charArr);
   }

   public static void main(String ... args) {
      Scanner input = new Scanner (System.in);
      System.out.print("Enter the string : ");
      String str = input.next(); 
      input.close();
      System.out.println("Reversed String : " + reverseStringByTwoPointer(str));
   }
}
