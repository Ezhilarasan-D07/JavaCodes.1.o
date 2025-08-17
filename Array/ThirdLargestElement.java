public class ThirdLargestElement {
   static int find2ndLargestInAnArray(int arr[]) {
      int fst_max = Integer.MIN_VALUE;
      int sec_max = Integer.MIN_VALUE;
      int trd_max = Integer.MIN_VALUE;
      for (int ind = 0; ind < arr.length; ind += 1) {
         if (arr[ind] > fst_max) {
            trd_max = sec_max;
            sec_max = fst_max;
            fst_max = arr[ind];
         }  else if (arr[ind] > trd_max && arr[ind] != trd_max) {
            trd_max = sec_max;
            sec_max = arr[ind];
         }  else if (arr[ind] > sec_max && arr[ind] != sec_max) {
            trd_max = arr[ind];
         }
      }  return sec_max;
   }

   public static void main(String ... args) {
      int array [] = {22, 26, 10, -5, 6, 7};
      System.out.println("third max in an array : " + find2ndLargestInAnArray(array));
   }
}
