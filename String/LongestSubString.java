import java.util.Scanner;
import java.util.ArrayList;
public class LongestSubString {
    static int findLongestSubString (String str) {
        int firstEnd = 0, secondEnd = 0, maxLength = 0;
        ArrayList <Character> arc = new ArrayList <> ();
        while (secondEnd < str.length()) {
            if (!arc.contains(str.charAt(secondEnd)))   {
                arc.add(str.charAt(secondEnd));
                secondEnd += 1;
                maxLength = Math.max(maxLength, arc.size());
            }   else {
                arc.remove(Character.valueOf(str.charAt(firstEnd)));
                firstEnd += 1;
            }
        }   return maxLength;
    }

    public static void main (String ... ____) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the string : ");
        String str = input.next();
        System.out.println("The longest substring is : " + findLongestSubString(str));
        input.close();
    }
}
