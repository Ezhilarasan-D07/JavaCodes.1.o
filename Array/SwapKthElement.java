import java.util.*;

public class SwapKthElement {
    static void swapKthIndex (List <Integer> arr, int x) {
        int lftEnd = x - 1;
        int rytEnd = arr.size() - x;
        int a = arr.get(lftEnd);
        int b = arr.get(rytEnd);
        a = b + a - (b = a);
        arr.set(lftEnd, a);
        arr.set(rytEnd, b);
    }

    public static void main (String ... args) {
        List <Integer> myList = new ArrayList <> ();
        myList.add(1);
        myList.add(2);
        myList.add(4);
        myList.add(6);
        myList.add(7);
        myList.add(8);
        myList.add(9);
        myList.add(5);
        int x = 3;
        swapKthIndex(myList, x);
        System.out.println(myList);
    }
}
