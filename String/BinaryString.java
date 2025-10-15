public class BinaryString {
    static int countSubString(String str) {
        int count = 0;
        for (int let = 0; let < str.length(); let += 1) {
            if (str.charAt(let) == '1') {
                count += 1;
            }
        }   return count * (count - 1) / 2;
    }

    public static void main (String ... args) {
        String str = "0010011";
        System.out.println(countSubString(str));
    }
}
