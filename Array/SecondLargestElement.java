public class SecondLargestElement {
   static int find2ndLargestInAnArray(int arr[]) {
      int max = Integer.MIN_VALUE;
      int sec_max = Integer.MIN_VALUE;
      for (int ind = 0; ind < arr.length; ind++) {
         if (arr[ind] > max) {
            sec_max = max;
            max = arr[ind];
         }  else if (arr[ind] > sec_max && arr[ind] != max) {
            sec_max = arr[ind];
         }
      }  return sec_max;
   }

   public static void main(String ... args) {
      int array [] = {22, 26, 10, -5, 6, 7};
      System.out.println("secondx max : " + find2ndLargestInAnArray(array));
   }
}
