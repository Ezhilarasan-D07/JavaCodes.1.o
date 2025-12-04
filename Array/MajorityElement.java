
/*

    Given an array arr []. Find the majority element in the array. If no majority element exists, return -1.
    Note: A majority element in an array is an element that appears strictly more than arr.size() / 2 times in the array.

    Input: arr[] = [1, 1, 2, 1, 3, 5, 1]    Output: 1
    Explanation: Since, 1 is present more than 7/2 times, so it is the majority element.

    Input: arr[] = [7]                      Output: 7
    Explanation: Since, 7 is single element and present more than 1/2 times, so it is the majority element.

    Input: arr[] = [2, 13]                  Output: -1
    Explanation: Since, no element is present more than 2/2 times, so there is no majority element.

*/
import java.util.HashMap;
public class MajorityElement    {

    static int findMajorityElement (int ... arr) {

        HashMap <Integer, Integer> intMap = new HashMap <> ();
        for (int num: arr) 
            intMap.put(num, intMap.getOrDefault(num, 0) + 1);

        for (HashMap.Entry <Integer, Integer> num: intMap.entrySet()) 
            if (num.getValue() > (arr.length / 2)) 
                return num.getKey();
        
        return -1;
    }

    public static void main (String ... args) {
        // passing through var args can easily called with arguments.
        System.out.println(findMajorityElement( 2, 1, 2, 2, 1, 6, 2));
        // Direct initialization of an array while calling a function.
        System.out.println(findMajorityElement( new int [] { 2, 1, 2, 2, 1, 6, 2 }));
    }
}
