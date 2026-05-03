public class CheckRotatedStrings {
    // question: given two strings s1 and s2, you need to check if s2 is rotation of s1
    // example: s1 = abcd, s2 = cdab
    // output: True
    // because cdab can be formed by rotating cd and ab
    // thinking: if it is rotated, combining s2 with s2 again would result in a string which would
    // contain s1, for this case, cdab + cdab = cdabcdab, which contains abcd 
    public static boolean checkRotation(String s1, String s2) {
        s2 = s2+s2;
        return s2.contains(s1);
    }
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "cdab";
        if (checkRotation(s1, s2)) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
        return;
    }
}
