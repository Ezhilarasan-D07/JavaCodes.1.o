import java.util.Arrays;
public class MergeSort {
    static void mergeSortPointer (int arr [], int lftEnd, int rytEnd) {
        if (rytEnd - lftEnd == 1)
            return; 
        int mid = (lftEnd + rytEnd) / 2;
        mergeSortPointer(arr, lftEnd, mid);
        mergeSortPointer(arr, mid, rytEnd);
        merge(arr, lftEnd, mid, rytEnd);
    }

    static void merge(int arr [], int lft, int mid, int ryt) {
        int mix [] = new int [ryt - lft];
        int i = lft;
        int j = mid;
        int k = 0;
        while (i < mid && j < ryt) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i += 1;
            }   else {
                mix[k] = arr[j];
                j += 1;
            }   k += 1;
        }
        while (i < mid) {
            mix[k] = arr[i];
            i += 1;
            k += 1;
        }
        while (j < ryt) {
            mix[k] = arr[j];
            j += 1;
            k += 1;
        }
        for (int l = 0; l < mix.length; l += 1) {
            arr[lft + l] = mix[l];
        }
    }

    public static void main(String ... args) {
        int array [] = {22, 6, 15, 26, 10, 5, 7, 13};
        mergeSortPointer(array, 0, array.length);
        System.out.println("The array after sorted : " + Arrays.toString(array));
    }
}
