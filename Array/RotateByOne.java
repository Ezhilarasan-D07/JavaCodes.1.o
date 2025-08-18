public class RotateByOne {
   static void rotateArrayByOne (int arr []) {
      int lastElement = arr[arr.length - 1];
      for (int ind = arr.length - 1; ind >= 1; ind -= 1) {
         arr[ind] = arr[ind - 1];
      }  arr[0] = lastElement;
   }

   public static void main(String ... args) {
      int array [] = {22, 6, 10, 5, 7, 26};
      rotateArrayByOne(array);
      for (int num : array) {
         System.out.println(num);
      }
   }
}
