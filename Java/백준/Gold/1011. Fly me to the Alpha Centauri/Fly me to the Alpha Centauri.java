import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int distance = y - x;
            int max = (int) Math.sqrt(distance);
            if (max == Math.sqrt(distance)) {
                sb.append(max * 2 - 1).append("\n");
            } else if (max * max < distance && distance <= max * max + max) {
                sb.append(max * 2).append("\n");
            } else {
                sb.append(max * 2 + 1).append("\n");
            }
        }
        System.out.println(sb);
    }
}