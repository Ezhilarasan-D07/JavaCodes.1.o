import java.util.Scanner;

public class LastWordLength {
   static int findLastLengthOf(String phrase) {
      String sentence = phrase.trim();
      int count = 0;
      for (int let = sentence.length() - 1; let >= 0; let -= 1) {
         if (sentence.charAt(let) != ' ') 
            count += 1;
         else 
            break;
      }  return count;
   }

   public static void main(String ... args) {
      Scanner input = new Scanner (System.in);
      System.out.print("Enter the phrase : ");
      String str = input.next(); 
      input.close();
      System.out.println("the last word length is : " + findLastLengthOf(str));
   }
}
