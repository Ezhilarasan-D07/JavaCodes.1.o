class SkipACharacter {
    static String skipAChar(String unProString) {
        if (unProString.isEmpty()) {
            return "";
        }
        
        char ch = unProString.charAt(0);
        if (ch == 'a')  
            return skipAChar(unProString.substring(1));
        else            
            return ch + skipAChar(unProString.substring(1));
    }   

    public static void main (String ... args) {
        System.out.print(skipAChar("baccad"));
    }
}
