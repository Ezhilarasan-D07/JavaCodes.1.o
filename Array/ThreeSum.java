import java.util.HashSet;
public class ThreeSum {
   static boolean findThreeSum (int arr [], int x) {
      for (int i = 0; i < arr.length - 2; i += 1) {
         HashSet <Integer> set = new HashSet <> ();
         int curTarget = x - arr[i];
         for (int j = i + 1; j < arr.length; j += 1) {
            int sum = curTarget - arr[j];
            if (set.contains(sum)) {
               System.out.println("Triplet found : " + " " + arr[i] + " " + arr[j] + " " +  sum);
               return true;
            }  set.add(arr[j]);   
         }
      }  return false;
   }

   public static void main(String ... args) {
      int arr [] = { 2, -1, 0, 3, -2, 4, 1 };
      int target = 0;
      System.out.println(findThreeSum(arr, target));
   }
}
