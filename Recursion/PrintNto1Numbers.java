public class PrintNto1Numbers {
    static void printNto1 (int num) {
        if (num == 0)
            return;
        System.out.print(num + " ");
        printNto1(num - 1); 
    }

    public static void main(String ... args) {
        printNto1(10);
    }
}
