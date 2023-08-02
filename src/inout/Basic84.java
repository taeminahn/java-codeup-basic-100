package inout;
import java.util.Scanner;
public class Basic84 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int g = scanner.nextInt();
        int b = scanner.nextInt();
        int c = 0;
        for(int i = 0; i < r; i++){
            for(int j = 0; j < g; j++){
                for(int k = 0; k < b; k++){
                    System.out.println(i + " " + j + " " + k + " ");
                    c++;
                }
            }
        }
        System.out.println(c);
    }
}
