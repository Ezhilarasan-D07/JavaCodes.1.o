public class FibonacciSeries {

   // Fibonacci series : 0 1 1 2 3 5 8 13 21.
   static void fiboSeries (int number) {
      int numOne = 0, numTwo = 1;
      System.out.print(numOne + " " + numTwo);
      for (int ind = 2; ind < number; ind += 1) {
         numTwo = numOne + numTwo;
         numOne = numTwo - numOne;
         System.out.print(" " + numTwo);
      }
   }

   static void fibonacciSeries (int num) {
      int a = 0, b = 1;
      System.out.print(a + " " + b);
      for (int ind = 2; ind < num; ind += 1) {
         int sum;
         sum = a + b;
         a = b + a - (b = a);
         System.out.print(" " + sum);
      }      
   }

   public static void main(String ... args) {
      int number = 9;
      System.out.print("Fibonacci series : ");
      fibonacciSeries(number);
   }
}
