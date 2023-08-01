package inout;
import java.util.Scanner;
public class Basic80 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = 0;
        for(int i = 0; i <= num; i++){
            sum += i;
            if(sum >= num){
                System.out.println(i);
                return ;
            }
        }
    }
}
