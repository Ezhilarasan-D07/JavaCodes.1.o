public class RepeatingNumber {
   public static void main(String ... args) {
      int arr [] = {1, 2, 2, 3, 3, 3, 3, 4, 5, 5, 5, 6};
      System.out.print("repeating numbers : ");
      for (int ind = 0; ind < arr.length; ind += 1) {
         for (int i = ind + 1; i < arr.length; i += 1) {
            if (arr[ind] == arr[i])
               System.out.print(arr[ind] + " ");
               break;
         }
      } 
   }
}
