public class JavaStringBuffer {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("Hello World!");
        for(int i=0;i<buffer.length();i++) {
            System.out.println(buffer.charAt(i));
        }
        System.out.println(buffer);

        // setcharAt() method sets the character at the specified index.
        buffer.setCharAt(0, 'h');
        System.out.println(buffer);

        // append() method appends the specified string to the end of the string buffer.
        buffer.append(" Welcome to Java.");
        System.out.println(buffer);

        // insert() method inserts the specified string at the specified index.
        buffer.insert(5, ",");
        System.out.println(buffer);

        // setLength() method sets the length of the string buffer.
        buffer.setLength(5);
        System.out.println(buffer);

        // delete() method deletes the characters from the specified start index to the specified end index.
        buffer.delete(0, 2);
        System.out.println(buffer);
    }
}
