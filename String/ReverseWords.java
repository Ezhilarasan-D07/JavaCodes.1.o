import java.util.Scanner;
public class ReverseWords {
    static String reverseWords (String s) {
        String words [] = s.split(" +");
        StringBuilder sb = new StringBuilder ();
        for (int i = words.length - 1; i >=0; i -= 1) {
            sb.append(words[i]);
            sb.append(" ");
        }   return sb.toString().trim();
    }

    public static void main (String ... args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the sentence to reverse : ");
        String str = input.nextLine();
        input.close();
        System.out.println("Sentence after reversed : " + reverseWords(str));
    }
}
