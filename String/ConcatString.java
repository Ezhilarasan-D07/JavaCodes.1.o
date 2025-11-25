import java.util.Scanner;

public class ConcatString {
    static String concatStr (String a, String b) {
        
        StringBuilder str = new StringBuilder();
        for (char ch: a.toCharArray()) {
            if (!b.contains(ch + ""))   str.append(ch + "");
        }
        
        for (char ch: b.toCharArray()) {
            if (!a.contains(ch + ""))   str.append(ch + "");
        }
        
        return str.length() > 0 ? str.toString() : "-1";
    }
    
    public static void main (String ... args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first name : ");
        String a = input.next();
        System.out.print("Enter your Second name : ");
        String b = input.next();
        System.out.println("The unique chars among the strings are : " + concatStr(a, b));
        input.close();
    }
}