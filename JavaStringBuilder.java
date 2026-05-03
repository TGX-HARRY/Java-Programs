public class JavaStringBuilder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Hello World!");
        for(int i=0;i<builder.length();i++) {
            System.out.println(builder.charAt(i));
        }
        System.out.println(builder);

        // setcharAt() method sets the character at the specified index.
        builder.setCharAt(0, 'h');
        System.out.println(builder);

        // append() method appends the specified string to the end of the string builder.
        builder.append(" Welcome to Java.");
        System.out.println(builder);

        // insert() method inserts the specified string at the specified index.
        builder.insert(5, ",");
        System.out.println(builder);

        // setLength() method sets the length of the string builder.
        builder.setLength(5);
        System.out.println(builder);

        // delete() method deletes the characters from the specified start index to the specified end index.
        builder.delete(0, 2);
        System.out.println(builder);
    }
}
