import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            Stack<Character> stack = new Stack<>();
            String s = br.readLine() + "\n";
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == ' ' || s.charAt(j) == '\n') {
                    while (!stack.empty()) {
                        bw.write(stack.pop());
                    }
                    bw.write(s.charAt(j));
                } else {
                    stack.push(s.charAt(j));
                }
            }
            bw.flush();
        }
    }
}