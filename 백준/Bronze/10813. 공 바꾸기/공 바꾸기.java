import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N + 1];
        int tmp;
        for (int a = 1; a < N + 1; a++) {
            arr[a] = a;
        }
        for (int a = 0; a < M; a++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
        for (int a = 1; a < N + 1; a++) {
            System.out.print(arr[a] + " ");
        }
    }
}