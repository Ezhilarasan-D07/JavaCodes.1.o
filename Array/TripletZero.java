
public class TripletZero {

   static boolean findTripletZero (int arr [], int x) {
      for (int i = 0; i < arr.length; i += 1) {
         for (int j = 0; j < arr.length; j += 1) {
            for (int k = 0; k < arr.length; k += 1) {
               if (arr[i] + arr[j] + arr[k] == 0) 
                  return true;
            }
         }
      }  return false;
   }
   public static void main(String[] args) {
      int arr [] = { 2, -1, 0, 3, -2, 4, 1 };
      int target = 0;
      System.out.println(findTripletZero(arr, target));
   }
}
