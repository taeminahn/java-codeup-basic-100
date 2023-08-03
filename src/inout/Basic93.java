package inout;
import java.util.Scanner;
public class Basic93 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[23];
        for(int i = 0; i < n; i++){
            int randomNum = scanner.nextInt() - 1;
            arr[randomNum] += 1;
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}