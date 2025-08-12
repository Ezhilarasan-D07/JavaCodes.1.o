
import java.util.*;

class FindNthNumFibo {

   static List <Integer> fibonacciNumber (int num) {
      List <Integer> ans = new ArrayList <> ();
      int a = 0, b = 1;

      for (int ind = 0; ind < num; ind += 1) {
         b = b + a;
         a = b + a - (b = a);
         ans.add(b);
      }  return ans;
   }

   public static void main(String ... args) {
      int number = 7;
      List <Integer> res = fibonacciNumber(number);
      for (int num : res) {
         System.out.print(num + " ");
      }
   }
}