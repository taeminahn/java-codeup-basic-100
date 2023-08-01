package inout;
import java.util.Scanner;
public class Basic81 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        for(int i = 1; i <= n1; i++){
            for(int j = 1; j <= n2; j++){
                System.out.println(i + " " + j);
            }
        }
    }
}
