public class PalindromeArray {
   static boolean isPalindrome (int num) {
      int rev = 0, dum = num;
      while (dum > 0) {
         rev = dum % 10 + rev * 10;
         dum /= 10;
      }  return (num == rev);
   }

   static boolean isPalindromeArray (int arr []) {
      for (int num : arr) {
         if (!isPalindrome(num))
            return false;
      }  return true;
   }

   public static void main(String ... args) {
      int array [] = {222, 777, 515, 1111};
      System.out.println(isPalindromeArray(array));
   }
}
