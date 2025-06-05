import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = br.readLine();
        int cnt = 0;
        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) == 'a' || st.charAt(i) == 'e' || st.charAt(i) == 'i' || st.charAt(i) == 'o'
                    || st.charAt(i) == 'u') {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}