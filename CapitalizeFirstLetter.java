public class CapitalizeFirstLetter {
    public static String capitalizeFirstLetterOfEachWord(String input) {
        String[] words = input.split(" ");
        StringBuilder capitalized = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                capitalized.append(Character.toUpperCase(word.charAt(0)))
                           .append(word.substring(1))
                           .append(" ");
            }
        }

        return capitalized.toString().trim();
    }
}
