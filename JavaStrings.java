public class JavaStrings {
    public static void main(String[] args) {
        String str = "Hello, World!";
        String str2 = "  Hello, Java!  ";

        // string are sequence of characters.In java, string is a class.
        // to use string class, we have to import java.lang package.
        // but java.lang package is imported by default, so we can use string class without importing anything.

        System.out.println("Original String: " + str);

        // length() method returns the length of the string.
        System.out.println("Length of String: " + str.length());

        // charAt() method returns the character at the specified index.
        System.out.println("Character at index 7: " + str.charAt(7));

        // substring() method returns the substring from the specified index.
        System.out.println("Substring from index 7 to 12: " + str.substring(7, 12));

        // indexOf() method returns the index of the specified substring.
        System.out.println("Index of 'World': " + str.indexOf("World"));
        
        // replace() method replaces the specified substring with the new substring.    
        // in case of multiple occurrences, it replaces all occurrences.
        // in case of no occurrences, it returns the original string.
        System.out.println("Replace 'World' with 'Java': " + str.replace("World", "Java"));

        // toUpperCase() method converts the string to uppercase.
        System.out.println("Uppercase: " + str.toUpperCase());
        

        // toLowerCase() method converts the string to lowercase.
        System.out.println("Lowercase: " + str.toLowerCase());
        
        // trim() method removes the leading and trailing spaces.
        System.out.println("Trimmed String: " + str2.trim());
        
        // concat() method concatenates the specified string to the end of the string.
        System.out.println("Concatenated String: " + str.concat(" Welcome!"));

        // lastIndexOf() method returns the last index of the specified substring.
        // in case of multiple occurrences, it returns the last occurrence.
        // in case of no occurrences, it returns -1.
        System.out.println("Last Index of 'o': " + str.lastIndexOf('o'));

        // isempty() method checks if the string is empty or not.
        String emptyStr = "";
        System.out.println("Is the string empty? " + emptyStr.isEmpty());

        // contains() method checks if the string contains the specified substring.
        System.out.println("Does the string contain 'Hello'? " + str.contains("Hello"));

        // split() method splits the string into an array of substrings based on the specified delimiter.
        String[] words = str.split(", ");
        System.out.println("Split String: ");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
