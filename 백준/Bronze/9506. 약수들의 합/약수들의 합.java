import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == -1) {
                break;
            }
            int sum = 0;
            ArrayList<Integer> arr = new ArrayList<Integer>();
            for (int i = 1; i < n; i++) { //약수찾기
                if (n % i == 0) {
                    sum += i;
                    arr.add(i);
                }
            }
            if (sum != n) {
                System.out.println(n + " is NOT perfect.");
            } else {
                System.out.print(n + " = ");
                for (int i = 0; i < arr.size(); i++) {
                    System.out.print(arr.get(i));
                    if (i != arr.size() - 1) {
                        System.out.print(" + ");
                    }
                }
                System.out.println();
            }
        }
    }
}