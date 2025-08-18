import java.util.*;

public class BubbleSort {
   static void swap(int arr[], int a, int b) {
      arr[a] = arr[b] + arr[a] - (arr[b] = arr[a]); 
   }

   static void bubbleSortAlgo(int arr[]) {
      for (int out = 0; out < arr.length; out += 1) {
         for (int inn = 0; inn < arr.length - out - 1; inn += 1) {
            if (arr[inn] > arr[inn + 1])  
               swap(arr, inn, inn + 1);   
         }
      }
   }

   public static void main(String[] args) {
      int array[] = {22, 6, 26, 10, 17, 11, 24, 29, 5};
      bubbleSortAlgo(array);
      System.out.println(Arrays.toString(array));
   }
}