import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String string = br.readLine();
        int time = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) >= 'A' && string.charAt(i) <= 'C') {
                time += 3;
            } else if (string.charAt(i) >= 'D' && string.charAt(i) <= 'F') {
                time += 4;
            } else if (string.charAt(i) >= 'G' && string.charAt(i) <= 'I') {
                time += 5;
            } else if (string.charAt(i) >= 'J' && string.charAt(i) <= 'L') {
                time += 6;
            } else if (string.charAt(i) >= 'M' && string.charAt(i) <= 'O') {
                time += 7;
            } else if (string.charAt(i) >= 'P' && string.charAt(i) <= 'S') {
                time += 8;
            } else if (string.charAt(i) >= 'T' && string.charAt(i) <= 'V') {
                time += 9;
            } else if (string.charAt(i) >= 'W' && string.charAt(i) <= 'Z') {
                time += 10;
            }
        }
        System.out.println(time);
    }
}