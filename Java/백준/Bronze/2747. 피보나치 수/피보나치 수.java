import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int res1 = 0;
        int res2 = 1;
        int res3 = 0;
        if (n == 0) {
            System.out.println(0);
        } else if (n == 1 || n == 2) {
            System.out.println(1);
        } else {
            for (int i = 2; i <= n; i++) {
                res3 = res1 + res2;
                res1 = res2;
                res2 = res3;
            }
            System.out.println(res3);
        }
    }
}