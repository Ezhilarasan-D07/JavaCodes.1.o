import java.util.Scanner;
public class FactorialRecursive {
    static int printFactorialNumOf (int num) {
        if (num == 1)
            return 1;
        return num * printFactorialNumOf (num - 1);
    }

    public static void main(String ... args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the number : ");
        int number = input.nextInt();
        System.out.println("The factorial for the number : " + number + " is " + printFactorialNumOf(number));
        input.close();
        System.out.println();
    }
}
