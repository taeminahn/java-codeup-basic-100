package inout;
import java.util.Scanner;
public class Basic86 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long h = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();

        float oneKb = 1024;

        double total = h * b * c;
        System.out.println("");
        System.out.println(Math.round((total/8)/oneKb/oneKb * 100) / 100.0 + " MB");
    }
}
