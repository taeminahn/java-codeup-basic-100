package inout;
import java.util.Scanner;
public class Basic83 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for(int i = 1; i <= num; i++){
            char ch = (i % 3 == 0) ? 'X' : (char)(i + '0');
            System.out.print(ch + " ");
        }
    }
}
