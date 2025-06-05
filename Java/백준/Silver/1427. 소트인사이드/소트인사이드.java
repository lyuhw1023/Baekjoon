import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = br.readLine().toCharArray();
        Arrays.sort(arr);
        for (int i = arr.length-1; i > -1; i--) {
            System.out.print(arr[i]);
        }
    }
}