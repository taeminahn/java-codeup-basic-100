package inout;
import java.util.Scanner;
public class Basic85 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long h = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();
        long s = scanner.nextLong();

        float oneKb = 1024;

        double total = h * b * c * s;
        System.out.println(Math.round((total/8)/oneKb/oneKb * 10) / 10.0 + " MB");
    }
}
