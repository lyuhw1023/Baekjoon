import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<String> d = new HashSet<String>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        for (int i = 0; i < N; i++) {
            d.add(br.readLine()); // a b c
        }
        ArrayList<String> arr = new ArrayList<String>();
        for (int i = 0; i < M; i++) {
            String str = br.readLine();
            if (d.contains(str)) {
                arr.add(str);
            }
        }
        Collections.sort(arr);
        System.out.print(arr.size());
        for (int i = 0; i < arr.size(); i++) {
            System.out.print("\n" + arr.get(i));
        }
    }
}