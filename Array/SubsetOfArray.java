import java.util.*;
public class SubsetOfArray {
   static boolean isSubset(int[] a,int[] b) {
      Set<Integer> hashSet = new HashSet<>();
      for (int num : a) {
         hashSet.add(num);
         }
         for (int num : b) {
            if (!hashSet.contains(num)) {
               return false;
            }
      }  return true;
   }

   public static void main(String[] args){
      int[] a = { 11, 1, 13, 21, 3, 7 };
      int[] b = { 11, 3, 7, 1 };

      if (isSubset(a, b)) {
         System.out.println("true");
      }  else {
         System.out.println("false");
      }
   }
}