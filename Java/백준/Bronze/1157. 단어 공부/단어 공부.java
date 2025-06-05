import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String string = br.readLine();
        int[] index = new int[26];

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) < 91) {
                index[string.charAt(i) - 'A']++;
            } else {
                index[string.charAt(i) - 'a']++;
            }
        }

        int max = -1;
        char ch = '?';
        for (int i = 0; i < 26; i++) {
            if (index[i] > max) {
                max = index[i];
                ch = (char) (i + 65);
            } else if (index[i] == max) {
                ch = '?';
            }
        }
        System.out.println(ch);
    }
}