package inout;
import java.util.Scanner;
public class Basic90 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextInt();
        int r = scanner.nextInt();
        int n = scanner.nextInt();
        for(int i = 1; i < n; i++){
            a *= r;
        }
        System.out.println(a);
    }
}