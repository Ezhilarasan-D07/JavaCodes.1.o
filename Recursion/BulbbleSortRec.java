
import java.util.Arrays;
public class BulbbleSortRec {
    static void bubbleSort (int arr [], int row, int col) {
        if (row == 0)
            return;
        if (col < row) {
            if (arr[col] > arr[col + 1]) {
                arr[col] = arr[col + 1] + arr[col] - (arr[col + 1] = arr[col]);
            }   bubbleSort(arr, row, col + 1);
        }   else {
            bubbleSort(arr, row - 1 , 0);
        }
    }

    public static void main(String ... args) {
        int array [] = {22, 16, 6, 7, 26, 10, 15};
        bubbleSort(array, array.length - 1, 0);
        System.out.println(Arrays.toString(array));
    }
}
