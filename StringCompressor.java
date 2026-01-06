public class StringCompressor {
    public static String compressedString(String str) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            int j = i;
            int count = 0;
            sb.append(ch);
            while(j<str.length() && str.charAt(j)==ch) {
                count++;
                j++;
            }
            if(count > 1) sb.append(count);
            i=j-1;
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String test = "aaabbbcccda";
        System.out.println(compressedString(test));
        return;
    }
}