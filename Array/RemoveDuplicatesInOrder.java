import java.util.ArrayList;
public class RemoveDuplicatesInOrder {
   static ArrayList <Integer> removeDuplicates (int arr []) {
      ArrayList <Integer> og = new ArrayList <> ();
      og.add(arr[0]);
      for (int ind = 1; ind < arr.length; ind += 1) {       
         if (arr[ind] != arr[ind - 1])
            og.add(arr[ind]);
      }  return og;
   }

   static int printUniqueElements (int arr []) {
      int len = arr.length;
      if (len <= 1)
         return len;
      int unique = 1;
      for (int ind = 1; ind < len; ind += 1) {
         if (arr[ind] != arr[ind - 1])
         arr[unique++] = arr[ind];
      }   return unique;
   }
   
   // public static void main(String ... args) {
   //    int array [] = {1, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 4};
   //    System.out.println("array after removing duplicates : " + removeDuplicates(array));
   // }
   public static void main (String ... ____) {
      int array [] = { 1, 2, 2, 2, 2, 3, 3, 3, 4, 4, 5 };
      int newSize = printUniqueElements(array);
      for (int ind = 0; ind < newSize; ind += 1) {
         System.out.print(array[ind] + " ");
      }

   }
}
