import java.util.Scanner;

public class SumOfNumbers {
    static int printSumOfNumbers (int num) {
        if (num == 1)
            return 1;
        return num + printSumOfNumbers(num - 1);
    }

    public static void main(String ... args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the number : ");
        int number = input.nextInt();
        System.out.println("The sum of the numbers are : " + number + " is " + printSumOfNumbers(number));
        input.close();
        System.out.println();
    }
}
