package inout;
import java.util.Scanner;
public class Basic95 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int []arr = new int[n];
        for(int i = 0; i < n; i++){
            int randomNum = scanner.nextInt();
            arr[i] = randomNum;
        }
        int min = arr[0];
        for(int i = 0; i < n; i++){
            if(i + 1 == n){
                System.out.println(min);
                return;
            } else {
                if(min >= arr[i]){
                    min = arr[i];
                }
            }
        }
    }
}