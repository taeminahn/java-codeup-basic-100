package inout;
import java.util.Scanner;
public class Basic92 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        int day = 1;
        while(true){
            if((day % n1 == 0) && (day % n2 == 0) && (day % n3 == 0)){
                System.out.println(day);
                break;
            }
            day++;
        }
    }
}