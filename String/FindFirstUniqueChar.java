public class FindFirstUniqueChar {
    static String findUnique(String str) {
        for (int let = 1; let < str.length() - 1; let += 1) {
            if (str.charAt(let) != str.charAt(let + 1) && str.charAt(let) != str.charAt(let - 1))
                return String.valueOf(str.charAt(let));
        }   return "not there";
    }
    
    public static void main (String ... args) {
        String str = "aabbbbcde";
        System.out.println(findUnique(str));
    }
}
