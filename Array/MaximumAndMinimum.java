
public class MaximumAndMinimum {
   static int [] findMaximumAndMinimum (int arr []) {
      int min = Integer.MAX_VALUE;
      int max = Integer.MIN_VALUE;
      for (int ind = 0; ind < arr.length; ind += 1) {
         if (arr[ind] < min)
            min = arr[ind];
         if (arr[ind] > max)
            max = arr[ind];
      }  return new int [] {min, max};
   }

   static int [] findMaxAndMin (int arr []) {
      int min = arr [0];
      int max = arr [0];
      for (int ind = 1; ind < arr.length; ind += 1) {
         if (min > arr[ind]) {
            min = arr[ind];
         }                
         if (max < arr[ind]) {
            max = arr[ind];
         }
      }  return new int [] {min, max};
   }

   public static void main(String ... args) {
      int array [] = {22, 6, -5, 13, 26, 10};
      int result [] = findMaxAndMin(array);
      System.err.println("minimum : " + result[0]);
      System.err.println("maximum : " + result[1]);
   }
}
