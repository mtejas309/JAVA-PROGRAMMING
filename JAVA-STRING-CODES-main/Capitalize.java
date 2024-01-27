/*CAPITALIZE EACH WORD IN STRING */
public class Capitalize{
    public static void main(String[] args) {
        String input = "capitalize each word in this string";
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                char firstChar = Character.toUpperCase(word.charAt(0));
                String restOfWord = word.substring(1).toLowerCase();
                result.append(firstChar).append(restOfWord).append(" ");
            }
        }

        String capitalizedString = result.toString().trim();
        System.out.println(capitalizedString);
    }
}
