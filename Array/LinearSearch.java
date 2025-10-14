public class LinearSearch {
   static int findElementInAnArray (int arr [], int x) {
      for (int ind = 0; ind < arr.length; ind += 1) {
         if (arr[ind] == x) 
            return ind;
      }  return -1;
   }  

   public static void main(String ... args) {
      int array [] = {22, 26, 10, -5, 6, 7};
      int target = 6;
      int result = findElementInAnArray(array, target);
      if (result != -1) {
         System.out.println("the element present in the index of : " + findElementInAnArray(array, target));
      }  else {
         System.out.println("the element not presented in an array");
      }
   }
}
