import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static boolean[] prime;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        prime = new boolean[N + 1];
        make_prime();

        for (int i = M; i <= N; i++) {
            if (prime[i] == false) {
                sb.append(i).append("\n");
            }
        }
        System.out.println(sb);
    }

    public static void make_prime() {

        prime[0] = prime[1] = true; //0과 1은 소수가 아니므로 true
        
        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            if (prime[i] == true) {
                continue;
            }

            for (int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }

    }
}