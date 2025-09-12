import java.util.Arrays;
public class QuickSort {
    public static void main(String ... args) {
        int array [] = { 22, 10, 6, 13, 5, 11, 26, 17, 15 };
        sort(array, 0, array.length - 1);
        System.out.println("The array after sorted : " + Arrays.toString(array));
    }

    static void sort (int arr [], int lftEnd, int rytEnd) {
        if (lftEnd >= rytEnd)
            return;
        int s = lftEnd;
        int e = rytEnd;
        int m = lftEnd + (rytEnd - lftEnd) / 2;
        int pivot = arr[m];
        while (s <= e) {
            while (arr[s] < pivot) {
                s += 1;
            }
            while (arr[e] > pivot) {
                e -= 1;
            }
            if (s <= e) {
                arr[s] = arr[e] + arr[s] - (arr[e] = arr[s]);
                s += 1;
                e -= 1;
            }
        } 
        
        sort (arr, lftEnd, e);
        sort (arr, s, rytEnd);
    }
}
