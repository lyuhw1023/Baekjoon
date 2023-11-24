import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();

        if (str.length() % 3 == 1) {
            sb.append(str.charAt(0));
        }
        if (str.length() % 3 == 2) {
            sb.append((str.charAt(0) - '0') * 2 + (str.charAt(1) - '0'));
        }

        for (int i = str.length() % 3; i < str.length(); i += 3) {
            sb.append((str.charAt(i) - '0') * 4 + (str.charAt(i + 1) - '0') * 2
                    + (str.charAt(i + 2) - '0'));
        }
        System.out.println(sb);
    }
}