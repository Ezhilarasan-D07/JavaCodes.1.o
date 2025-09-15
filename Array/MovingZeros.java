import java.util.Arrays;
public class MovingZeros {
    static void moveZerosToEnd (int arr []) {
        int lft = 0, ryt = 0;
        while (ryt < arr.length) {
            if (arr[ryt] != 0)  {
                arr[ryt] = arr[lft] + arr[ryt] - (arr[lft] = arr[ryt]);
                ryt += 1;
            }   lft += 1;
        }
    }

    public static void main (String ... args) {
        int array [] = {22, 10, 7, 0, 26, 0, 0, 26, 0, 0, 11, 9};
        moveZerosToEnd(array);
        System.out.println("The array after shifting zeroes to end : " + Arrays.toString(array));
    }
}
