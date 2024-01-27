/*MAX WORD IN STRING */
public  class MaxWord {
    public static void main(String[] args) {
        String input = "This is a sample string with some long words";
        String[] words = input.split("\\s+");
        
        String maxWord = "";
        
        for (String word : words) {
            if (word.length() > maxWord.length()) {
                maxWord = word;
            }
        }
        
        System.out.println("Longest word: " + maxWord);
    }
}
