
public class MissingNumber {
   static int findMissingNumber (int arr []) {
      int arraySum = 0, totalSum = 0;
      int len = arr.length + 1;
      totalSum = (len * (len + 1) / 2);
      for (int ind : arr) {
         arraySum += ind;
      }  return (int) (totalSum - arraySum);
   }

   public static void main(String ... args) {
      int array [] = {1, 2, 4};
      System.out.println("the missing number in an array is : " + findMissingNumber(array));
   }
}