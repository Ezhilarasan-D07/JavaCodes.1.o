import java.util.Scanner;
public class CountOfDigit {
    static int countTheDigitOf (int num) {
        if (num < 10) 
            return 1;
        return 1 + countTheDigitOf(num / 10); 
    }

    public static void main (String args []) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the number : ");
        int number = input.nextInt();
        System.out.println("the count of the digits : " + number + " is " + countTheDigitOf(number));
        input.close();
        System.out.println();
    }
}
