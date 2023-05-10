import java.io.*;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        HashSet<String> hash = new HashSet<>();
        String string = "";
        for (int i = 0; i < S.length(); i++) {
            string = "";
            for (int j = i; j < S.length(); j++) {
                string += S.substring(j, j + 1);
                hash.add(string);
            }
        }
        System.out.println(hash.size());
    }
}