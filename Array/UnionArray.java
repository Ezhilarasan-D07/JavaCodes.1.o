
import java.util.HashSet;
public class UnionArray {
   static HashSet <Integer> findUnionOfArrays (int a [], int b []) {
      HashSet <Integer> set = new HashSet <> ();
      for (int num : a) {
         set.add(num);
      }
      for (int num : b) {
         set.add(num);
      }  return set;
   }
   public static void main (String ... args) {
      int arrayOne [] = {22, 9, 6, 10, 6};
      int arrayTwo [] = {13, 9, 6, 15, 24};
      System.out.println("the union of two arrays is : " + findUnionOfArrays(arrayOne, arrayTwo));
   }
}
  

