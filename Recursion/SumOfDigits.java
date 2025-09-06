import java.util.Scanner;

public class SumOfDigits {
    static int printSumOfDigits (int num) {
        if (num == 0)
            return 0;
        return (num % 10) + printSumOfDigits(num / 10);
    }

    public static void main(String ... args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the number : ");
        int number = input.nextInt();
        System.out.println("the sum of the digits : " + number + " is " + printSumOfDigits(number));
        input.close();
        System.out.println();
    }
}
