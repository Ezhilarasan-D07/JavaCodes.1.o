public class RotateByK {
   static void reverse(int arr[], int a, int b) {
      while (a < b) {
         arr[a] = arr[b] + arr[a] - (arr[b] = arr[a]);
         a++;
         b--;
      }
   }

   static void rotateArrayByK(int arr[], int k) {
      int len = arr.length;
      k = k % len;  
      reverse(arr, 0, len - k - 1);
      reverse(arr, len - k, len - 1);
      reverse(arr, 0, len - 1);
   }

   public static void main(String... args) {
      int array [] = {1, 2, 3, 4, 5, 6, 7};
      int k = 10;
      rotateArrayByK(array, k);
      for (int num : array) {
         System.out.print(num + " ");
      }
   }
}
