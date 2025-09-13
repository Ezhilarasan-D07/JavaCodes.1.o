public class FindEquilibrium {
    public static void main (String ... args) {
        int arr [] = { 2, 4, 3, 0, 6, 1, 2 };
        System.out.println("The equilbrium exists in : " + findIndex(arr));
    }

    static int findIndex (int arr []) {
        int ryt = 0;
        for (int num: arr) ryt += num;
        int lft = 0;
        for (int ind = 0; ind < arr.length; ind += 1) {
            if (lft == ryt - lft - arr[ind]) 
                return ind;
            lft += arr[ind];
        }   return -1;
    }
}
