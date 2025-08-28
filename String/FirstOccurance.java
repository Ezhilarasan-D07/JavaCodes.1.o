public class FirstOccurance {
    static int findFirstOccurance (String str, String sub) {
        int n = str.length();
        int m = sub.length();
        for (int ind = 0; ind <= n - m; ind += 1) {
            int let;
            for (let = 0; let < m; let += 1) {
                if (str.charAt(ind + let) != sub.charAt(let)) {
                    break;
                }
            }
            if (let == m) 
                return ind;
        }   return -1;
    }

    public static void main(String ... args) {
        String string = "goodbadugly";
        String subString = "ug";
        int index = findFirstOccurance(string, subString);
        System.out.println("First occurrence at index: " + index);
    }
}
