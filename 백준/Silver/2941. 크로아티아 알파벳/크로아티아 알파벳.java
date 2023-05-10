import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String string = br.readLine();
        int cnt = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'c' && i < string.length() - 1) {
                if (string.charAt(i + 1) == '=' || string.charAt(i + 1) == '-') {
                    i++;
                }
            } else if (string.charAt(i) == 'd' && i < string.length() - 1) {
                if (string.charAt(i + 1) == 'z' && i < string.length() - 2) {
                    if (string.charAt(i + 2) == '=') {
                        i += 2;
                    }
                } else if (string.charAt(i + 1) == '-') {
                    i++;
                }
            } else if ((string.charAt(i) == 'l' || string.charAt(i) == 'n') && i < string.length() - 1) {
                if (string.charAt(i + 1) == 'j') {
                    i++;
                }
            } else if ((string.charAt(i) == 's' || string.charAt(i) == 'z') && i < string.length() - 1) {
                if (string.charAt(i + 1) == '=') {
                    i++;
                }
            }
            cnt++;
        }
        System.out.println(cnt);
    }
}