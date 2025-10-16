public class PrintFirstLetters {
    static String firstAlphabet (String str) {
        StringBuilder sb = new StringBuilder();
        String words [] = str.split(" ");
        for (int word = 0; word < words.length; word += 1) {
            sb.append(words[word].charAt(0));
        }   return sb.toString();
    }
    
    public static void main (String ... args) {
        String str = "i'm the danger";
        System.out.println(firstAlphabet(str));
    }
}
