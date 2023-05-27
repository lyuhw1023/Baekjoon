import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];
        int sum = 0;
        int num = 0;
        for (int i = 0; i < 5; i++) {
            num = Integer.parseInt(br.readLine());
            sum += num;
            arr[i] = num;
        }

        Arrays.sort(arr);

        int avg = sum / 5;

        System.out.print(avg + "\n" + arr[2]);
    }
}