public class LinearSearch {
    static boolean find (int arr [], int x, int ind) {
        if (ind == arr.length)
            return false;
        return arr[ind] == x || find (arr, x, ind + 1);
    }

    public static void main (String ... args) {
        int array [] = {22, 26, 6, 15, 7};
        int target = 6;
        System.out.println(find(array, target, 0));
    }
}