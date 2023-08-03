package inout;
import java.util.Scanner;
public class Basic94 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int []arr = new int[n];
        for(int i = 0; i < n; i++){
            int randomNum = scanner.nextInt();
            arr[i] = randomNum;
        }
        for(int i = n-1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }
    }
}