import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int C = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < C; i++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int[] arr = new int[N];
            double sum = 0;
            for (int j = 0; j < N; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
                sum += arr[j];
            }
            double cnt = 0;
            for (int j = 0; j < N; j++) {
                if (arr[j] > (sum / N)) {
                    cnt++;
                }
            }
            System.out.printf("%.3f%%\n", (cnt / N) * 100);
        }
    }
}