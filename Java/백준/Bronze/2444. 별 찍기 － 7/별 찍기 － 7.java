import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 1; i < (N + 1); i++) {
            for (int j = 0; j < (N - i); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (i * 2 - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = (N - 1); i > 0; i--) {// 4부터 0까지
            for (int j = (N - i); j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = (i * 2 - 1); j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}