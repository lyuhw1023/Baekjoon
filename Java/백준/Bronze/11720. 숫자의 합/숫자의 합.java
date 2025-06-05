import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String st = sc.next();
        sc.close();
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += st.charAt(i) - 48;
        }
        System.out.println(sum);
    }
}