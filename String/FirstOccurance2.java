public class FirstOccurance2 {
    static int findSubString (String str, String subStr) {       
        for (int ind = 0; ind < str.length(); ind += 1) {
            if (str.charAt(ind) == subStr.charAt(0)) {
                int charSub = 0;
                int charStr = ind;
                while (charSub < subStr.length() && charStr < str.length() && 
                        subStr.charAt(charSub) == str.charAt(charStr)) {
                    charSub += 1;
                    charStr += 1;
                    if (charSub == subStr.length()) 
                        return ind;
                }
            }
        }           return -1;
    }

    public static void main (String args []) {
        String string = "goodbadugly";
        String subString = "bad";
        int index = findSubString(string, subString);
        System.out.println("First occurrence at index: " + index);
    }
}
