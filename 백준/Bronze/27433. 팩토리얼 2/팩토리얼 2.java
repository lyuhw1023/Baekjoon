import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long res = 1;
        for(int i = 2; i < N + 1 ; i++){
            res *= i;
        }
        System.out.println(res);
    }
}
