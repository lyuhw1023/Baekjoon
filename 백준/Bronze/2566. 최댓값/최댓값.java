import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[][] arr = new int[9][9];
        int max = 0;
        int a = 0;
        int b = 0;
        for (int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    a = i;
                    b = j;
                }
            }
        }
        System.out.println(max);
        System.out.println((a+1) + " " + (b+1));
    }
}