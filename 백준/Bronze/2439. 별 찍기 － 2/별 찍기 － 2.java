import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            for (int j = 1; j < (T - i); j++) {
                bw.write(" ");
            }
            for (int k = 1; k <= (i + 1); k++) {
                bw.write("*");
            }
            bw.write("\n");
        }
        bw.flush();
    }
}