import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) { //갖고있는 수 배열
            arr[i] = Integer.parseInt   (st.nextToken());
        }
        Arrays.sort(arr);
        int M = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(st.nextToken());
            sb.append(upper(arr, num) - lower(arr, num)).append(" ");
        }
        System.out.println(sb);
    }
    
    public static int lower(int[] arr, int num) {
        int low = 0;
        int up = arr.length;

        while (low < up) {
            int mid = (low + up) / 2;
            if (num <= arr[mid]) {
                up = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
    
    public static int upper(int[] arr, int num) {
        int low = 0;
        int up = arr.length;

        while (low < up) {
            int mid = (low + up) / 2;
            if (num < arr[mid]) {
                up = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}