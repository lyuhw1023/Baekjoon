import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int max = 0;
        int index = 0;
        int cnt = 1;
        for (int value : arr) {
            if (value > max) {
                max = value;
                index = cnt;
            }
            cnt++;
        }
        System.out.print(max + "\n" + index);
    }
}