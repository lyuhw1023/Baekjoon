import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int D = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String[] day = {"Wednesday", "Thursday", "Friday", "Saturday", "Sunday", "Monday", "Tuesday" };
        int[] daynum = { 0, 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int num = 0;
        for (int i = 0; i <= M; i++) {
            num += daynum[i];
        }
        num += D;
        System.out.println(day[num%7]);
    }

}