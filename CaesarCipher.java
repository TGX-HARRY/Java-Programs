public class CaesarCipher {
    public static String CaesarCipherString(String str, int k) {
        StringBuilder ans = new StringBuilder();
         k = k%26; // handle case for k>26
        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                char encoded = (char) (ch + k);
                if (encoded > 'z') encoded -= 26;
                if (encoded < 'a') encoded += 26;
                ans.append(encoded);
            }
            else if (ch >= 'A' && ch <= 'Z') {
                char encoded = (char) (ch + k);
                if (encoded > 'Z')
                    encoded -= 26;
                if (encoded < 'A')
                    encoded += 26;
                ans.append(encoded);
            }
            else ans.append(ch);
        }
        return ans.toString().toUpperCase();
    }
    public static void main(String[] args) {
        String str = "Attack zerg at Dawn";
        System.out.println(CaesarCipherString(str, 3));
    }
}
