import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N + 1];
        for (int a = 1; a < N + 1; a++) {
            arr[a] = a;
        }
        for (int a = 0; a < M; a++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int tmp;
            for (int b = i; b <= j; b++) {
                tmp = arr[b];
                arr[b] = arr[j];
                arr[j] = tmp;
                j--;
            }
        }
        for (int c = 1; c < N + 1; c++) {
            System.out.print(arr[c] + " ");
        }
    }
}