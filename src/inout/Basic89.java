package inout;
import java.util.Scanner;

public class Basic89 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int d = scanner.nextInt();
        int n = scanner.nextInt();
        for(int i = 1; i < n; i++){
            a += d;
        }
        System.out.println(a);
    }
}