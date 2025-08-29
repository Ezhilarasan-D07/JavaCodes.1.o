import java.util.Arrays;
import java.util.Scanner;
public class Anagram {
    static boolean checkAnagram (String str1, String str2) {
        char a [] = str1.toCharArray();
        char b [] = str2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        for (int ind = 0; ind < a.length; ind += 1) {
            if (a[ind] != b[ind])
                return false;
        }   return true;
    }

    public static void main (String ... ____) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the string 1 : ");
        String str1 = input.next();
        System.out.print("Enter the string 2 : ");
        String str2 = input.next();
        boolean result = checkAnagram(str1, str2);
        if (result) 
            System.out.println("they are an anagram");
        else 
            System.out.println("they are not an anagram");

        input.close();
    }
}
