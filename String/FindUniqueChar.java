import java.util.HashSet;
import java.util.TreeSet;
import java.util.Scanner;

public class FindUniqueChar {
    static String findUniqueCharacters (String a, String b) {
        
        HashSet <Character> set1 = new HashSet <> ();
        HashSet <Character> set2 = new HashSet <> ();
        
        for (int i = 0; i < a.length(); i += 1) set1.add(a.charAt(i));
        for (int i = 0; i < b.length(); i += 1) set2.add(b.charAt(i));
        
        TreeSet <Character> answer = new TreeSet <> ();
        
        for (char ch: set1) {
            if (!set2.contains(ch)) answer.add(ch);
        }

        for (char ch: set2) {
            if (!set1.contains(ch)) answer.add(ch);
        }
        
        StringBuilder str= new StringBuilder();
        for (char ch : answer) str.append(ch);
        return str.toString();
    }
    
    public static void main (String ... args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first name : ");
        String a = input.next();
        System.out.print("Enter your Second name : ");
        String b = input.next();
        System.out.println("The unique chars among the strings are : " + 
            findUniqueCharacters(a, b));
            input.close();
    }
}