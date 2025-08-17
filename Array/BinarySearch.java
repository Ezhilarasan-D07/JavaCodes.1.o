// Note : Only applied when an array is sorted.......
// ------------------------------------------------------

public class BinarySearch {
   static int findELementByBinarySearch (int arr [], int x) {
      int lftEnd = 0, rytEnd = arr.length - 1;
      while (lftEnd <= rytEnd) {
         int mid = lftEnd + (rytEnd - lftEnd) / 2;
         if (x > arr[mid]) {
            lftEnd += 1;
         }  else if (x < arr[mid]) {
            rytEnd -= 1;
         }  else {
            return mid;
         }  
      }  return -1;
   }

   public static void main(String ... args) {
      int array [] = {5, 7, 11, 17, 19, 22, 26};
      int target = 19;
      int result = findELementByBinarySearch (array, target);
      if (result != -1) {
         System.out.println("the element present in the index of : " + findELementByBinarySearch (array, target));
      }  else {
         System.out.println("the element not presented in an array");
      }
   }
}
