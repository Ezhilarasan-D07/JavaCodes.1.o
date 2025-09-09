import java.util.*;
public class LinearSearch {
    static boolean find (int arr [], int x, int ind) {
        if (ind == arr.length)
            return false;
        return arr[ind] == x || find (arr, x, ind + 1);
    }

    static int findIndex (int arr [], int x, int ind) {
        if (ind == arr.length)
            return -1;
        if (arr[ind] == x)
            return ind;
        else 
            return findIndex (arr, x, ind + 1);    
    }

    static ArrayList <Integer> list = new ArrayList <> ();
    static void findAllIndex (int arr [], int x, int ind) {
        if (ind == arr.length)
            return;
        if (arr[ind] == x)
            list.add(ind);
        findAllIndex (arr, x, ind + 1);  
    }
    public static void main (String ... args) {
        int array [] = {22, 6, 6, 15, 7};
        int target = 6;
        // System.out.println(findIndex(array, target, 0));
        findAllIndex(array, target, 0);
        System.out.println(list);
    }
}