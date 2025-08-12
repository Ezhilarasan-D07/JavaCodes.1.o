public class FiboWithRecursive {

   static int fib (int num) {
      if (num <= 1) 
         return num;
      return fib (num - 1) + fib (num - 2);
   }
   public static void main(String ... args) {
      int number = 9;
      for (int ind = 0; ind < number; ind += 1) {
         System.out.print(fib(ind) + " ");
      }
   }
}
