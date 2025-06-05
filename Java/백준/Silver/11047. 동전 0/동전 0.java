import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        for (int i = N-1; i > -1; i--) {
            if (K >= arr[i]) {
                cnt += K / arr[i]; //4  6
                K %= arr[i]; //200  0
                if (K == 0) {
                    break;
                }
            }
        }
        System.out.println(cnt);
    }
}