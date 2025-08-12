public class Main {

   static void fibonacciSeries(int num) {
      int numOne = 0, numTwo = 1;
      System.out.print(numOne + " " + numTwo);
      for (int i = 2; i < num; i += 1)  {
         int sum;
         sum = numOne + numTwo;
         System.out.print(" " +sum);
         numOne = numTwo;
         numTwo = sum;
      }
   }

   public static void main(String[] args) {
      int number = 20;
      System.out.println("Fibonacci Series :");
      fibonacciSeries(number);
   }
}
