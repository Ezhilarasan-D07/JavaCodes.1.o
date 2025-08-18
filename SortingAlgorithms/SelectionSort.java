import java.util.*;
public class SelectionSort {
   static void swap (int arr [], int a, int b) {
      arr[a] = arr[b] + arr[a] - (arr[b] = arr[a]);
   }

   static int findMax (int arr [], int start, int end) {
      int max = start;
      for (int ind = start; ind <= end; ind += 1) {
            if (arr[ind] > arr[max])
               max = ind;
      }  return max;
   }

   static void selectionSort (int arr []) {
      for (int ind = 0; ind < arr.length; ind += 1) {
         int last = arr.length - ind - 1;
         int max = findMax(arr, 0, last); 
         swap (arr, max, last);
      }
   }

   public static void main(String ... args) {
      int array [] = {22, 6, 7, 26, 10};
      selectionSort(array);
      System.out.println(Arrays.toString(array));
      
   }
}
