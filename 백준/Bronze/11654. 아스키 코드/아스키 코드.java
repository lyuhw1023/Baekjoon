import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        int rs = st.charAt(0);
        System.out.println(rs);
        sc.close();
    }
}