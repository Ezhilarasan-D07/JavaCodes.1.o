import java.util.Scanner;

public class FirstUniqueElement {
    static int findFirstUnique(String str) {
        char ch [] = str.toCharArray();
        for (int ind = 0; ind < ch.length; ind += 1) {
            boolean unique = true;
            for (int let = 0; let < ch.length; let += 1) {
                if (ind != let && ch[ind] == ch[let]) {
                    unique = false;
                    break;
                }

            }
            if (unique)
                return ind;
        }   return -1;
    }

    public static void main(String ... args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the string : ");
        String str = input.next();
        System.out.println("The unique element present at first is : " + findFirstUnique(str));
        input.close();        
    }
}
