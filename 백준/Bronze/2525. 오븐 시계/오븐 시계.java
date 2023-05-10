import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    
    int d = a*60 + b + c;
    
    int e = d / 60;			//시
    int f = d % 60;			//분
    
    if(e >= 24) {
    	e = e - 24;
    }
    System.out.println(e + " " + f);

    }
}