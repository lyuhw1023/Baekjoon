import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        int cnt = 0;
        int sum = 0;
        String[] str = new String[T];
        for (int i = 0; i < T; i++) {
            str[i] = br.readLine();
        }
        for (int i = 0; i < T; i++) {
            for (int j = 0; j < str[i].length(); j++) {
                if (str[i].charAt(j) == 'O') {
                    cnt++;
                    sum += cnt;
                } else {
                    cnt = 0;
                }
            }
            sb.append(sum + "\n");
            cnt = 0;
            sum = 0;
        }
        System.out.println(sb);
    }
}