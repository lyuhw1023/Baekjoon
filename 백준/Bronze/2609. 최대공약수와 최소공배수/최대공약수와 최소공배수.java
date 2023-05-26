import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int res = gcd(a, b);
        int res2 = a * b / res;
        System.out.println(res+"\n"+res2);
    }

    public static int gcd(int a, int b){
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}