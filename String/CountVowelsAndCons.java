import java.util.Scanner;

public class CountVowelsAndCons {
   static int [] countVowelsAndConsonants (String str) {
      int vowels = 0, consonants = 0;
      for (int let = 0; let < str.length(); let += 1) {
         char ch = str.charAt(let);
         if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'e' || ch == 'u')
            vowels += 1;
         else 
            consonants += 1;
      }  return new int [] {vowels, consonants};
   }

   public static void main(String ... args) {
      Scanner input = new Scanner (System.in);
      System.out.print("Enter the string : ");
      String str = input.next(); 
      int counts [] = countVowelsAndConsonants(str);
      input.close();
      System.out.println("The count of vowels : " + counts[0] + " and consonants : " + counts[1]);
   }
}
