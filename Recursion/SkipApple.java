public class SkipApple {
    static String skipWordApple(String strUnPro) {
        if (strUnPro.isEmpty())
            return "";

        if (strUnPro.startsWith("apple"))
            return skipWordApple(strUnPro.substring(5)); // skip "apple"
        else
            return strUnPro.charAt(0) + skipWordApple(strUnPro.substring(1)); // keep first char
    }

    public static void main (String ... args) {
        System.out.println(skipWordApple("iloveappleandyou"));
    }
}
