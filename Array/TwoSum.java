import java.util.*;
public class TwoSum {
   static boolean findTwoSum (int arr [], int x) {
      int len = arr.length;
      for (int ind = 0; ind < len; ind += 1) {
         for (int i = 0; i < len; i += 1) {
            if (arr[ind] + arr[i] == x)
               return true;
         };
      };    return false;
   }

   static boolean findTwoSumWith2Pointer (int arr [], int x) {
      Arrays.sort(arr);
      int lftEnd = 0, rytEnd = arr.length - 1;
      while (lftEnd < rytEnd) {
         int sum = arr[lftEnd] + arr[rytEnd];
         if (sum > x)
            rytEnd -= 1;
         else if (sum < x)
            lftEnd += 1; 
         else 
            return true; 
      }  return false;
   }

   static boolean findTwoSumWithHashSet (int arr [], int x) {
      HashSet <Integer> set = new HashSet <> ();
      for (int ind = 0; ind < arr.length; ind += 1) {
         int complement = x - arr[ind];
         if (set.contains(complement)) 
            return true;
         set.add(arr[ind]);
      }  return false;
   }

   public static void main(String ... args) {
      int arr [] = {2, -1, 0, 4, -3, 1}; // -3, -1, 0, 1, 2, 4.
      int target = -3;
      System.out.println(findTwoSumWithHashSet(arr, target));
   }
}
