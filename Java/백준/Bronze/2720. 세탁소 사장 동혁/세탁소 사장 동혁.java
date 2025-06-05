import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        int[][] arr = new int[T][4];
        int q = 25;
        int d = 10;
        int n = 5;
        int p = 1;
        for (int i = 0; i < T; i++) {
            int C = Integer.parseInt(br.readLine());
            arr[i][0] = C / q;
            C %= q;
            arr[i][1] = C / d;
            C %= d;
            arr[i][2] = C / n;
            C %= n;
            arr[i][3] = C / p;
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
    }
}