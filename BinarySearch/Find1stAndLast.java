public class Find1stAndLast {

    static int[] searchRange(int arr [], int target) {
        int answer [] = {-1, -1};
        int lftEnd = search(arr, target, true);
        int rytEnd = search(arr, target, false);
        answer [0] = lftEnd;
        answer [1] = rytEnd;
        return answer;
    }

    static int search(int arr [], int x, boolean isFirstIndex) {
        int lftEnd = 0, rytEnd = arr.length - 1, answer = -1;
        while (lftEnd <= rytEnd) {
            int middle = lftEnd + (rytEnd - lftEnd) / 2; 
            if (x > arr[middle])
                lftEnd = middle + 1;
            else if (x < arr[middle])
                rytEnd = middle - 1;
            else {
                answer = middle;
                if (isFirstIndex)
                    rytEnd = middle - 1; 
                else
                    lftEnd = middle + 1; 
            }
        }
        return answer;
    }

    public static void main(String... args) {
        int array[] = {1, 2, 2, 2, 2, 2, 2, 4, 6, 8, 9};
        int target = 2;

        int result[] = searchRange(array, target);
        System.out.println("First Index: " + result[0]);
        System.out.println("Last Index: " + result[1]);
    }
}
