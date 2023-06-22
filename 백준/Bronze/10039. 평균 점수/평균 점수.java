import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            if (arr[i] < 40) {
                sum += 40;
            } else {
                sum += arr[i];
            }
        }
        System.out.println(sum/5);
    }

}