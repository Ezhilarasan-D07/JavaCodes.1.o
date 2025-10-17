public class CountOddAndEven {

    static int[] countOddEven(int arr[]) {
        int oddAndEven[] = {0, 0};  
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)  
                oddAndEven[1]++;
            else 
                oddAndEven[0]++;
        }   return oddAndEven;
    }

    public static void main(String[] args) {
        int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        int [] result = countOddEven(numbers);
        System.out.println("Odd Count: " + result[0]);
        System.out.println("Even Count: " + result[1]);
    }
}
