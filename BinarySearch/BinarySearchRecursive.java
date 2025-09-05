import java.util.Scanner;
public class BinarySearchRecursive {
    static int binarySearch(int arr [], int x, int rytEnd, int lftEnd) {
        if (rytEnd > lftEnd)  
            return -1;
        int mid = rytEnd + (lftEnd - rytEnd) / 2;
        if (x < arr[mid])
            return binarySearch(arr, x, rytEnd, mid - 1);
        else if (x > arr[mid]) 
            return binarySearch(arr, x, mid + 1, lftEnd);
        else 
            return mid;
    }
    
    public static void main (String args []) {
        int array [] = {2, 3, 6, 9, 15, 22, 26};
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the number : ");
        int target = input.nextInt();
        input.close();
        System.out.print("the element found in : " + binarySearch(array, target, 0, array.length - 1));
    }
}
