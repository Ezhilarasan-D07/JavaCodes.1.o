import java.util.HashSet;
import java.util.ArrayList;
public class IntersectionOfArray {
   static ArrayList <Integer> findCommonElementsOfArrays (int a [], int b []) {
      HashSet <Integer> set = new HashSet <> ();
      ArrayList <Integer> res = new ArrayList <> ();
      for (int num : a) {
         set.add(num);
      }
      for (int ind = 0; ind < b.length; ind += 1) {   
         if (set.contains(b[ind]))
            res.add(b[ind]);
      }  return res;
   }
   public static void main (String ... args) {
      int arrayOne [] = {22, 9, 6, 10, 6};
      int arrayTwo [] = {13, 9, 6, 15, 24};
      System.out.println("the Intersection of two arrays is : " + findCommonElementsOfArrays(arrayOne, arrayTwo));
   }
}
