import java.util.Arrays;
public class InsertionSort {
   static void swap (int arr [], int a, int b) {
      arr[a] = arr[b] + arr[a] - (arr[b] = arr[a]);
   }

   static void insertionSort (int arr []) {
      for (int ind = 0; ind < arr.length - 1; ind += 1) {
         for (int val = ind + 1; val > 0; val -= 1) {
            if (arr[val - 1] > arr[val])
               swap (arr, val - 1, val);
            else 
               break;
         }
      }
   }

   public static void main(String ... args) {
      int array [] = {22, 5, 6, 26, 10, 7};
      insertionSort(array);
      System.out.println(Arrays.toString(array));
   }
}
