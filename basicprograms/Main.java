public class Main {
    
   static void printFibonacci(int n) {
      int a = 0, b = 1;
      System.out.print(a + " " + b);

      for (int i = 2; i < n; i += 1) {
         int next = a + b;
         System.out.print(" " + next);
         a = b;
         b = next;
      }
   }

    public static void main(String[] args) {
        int n = 10; 
        System.out.print("Fibonacci Series: ");
        printFibonacci(n);
    }
}
