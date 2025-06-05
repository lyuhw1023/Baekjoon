import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = 1;
        int q = 1;
        int r = 2;
        int b = 2;
        int kn = 2;
        int p = 8;

        StringTokenizer st = new StringTokenizer(br.readLine());
        k = k - Integer.parseInt(st.nextToken());
        q = q - Integer.parseInt(st.nextToken());
        r = r - Integer.parseInt(st.nextToken());
        b = b - Integer.parseInt(st.nextToken());
        kn = kn - Integer.parseInt(st.nextToken());
        p = p - Integer.parseInt(st.nextToken());

        System.out.print(k + " ");
        System.out.print(q + " ");
        System.out.print(r + " ");
        System.out.print(b + " ");
        System.out.print(kn + " ");
        System.out.print(p);

    }
}