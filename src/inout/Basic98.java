package inout;
import java.util.Scanner;
public class Basic98 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int w = scanner.nextInt();
        int h = scanner.nextInt();
        int n = scanner.nextInt();
        int[][] arr = new int[w][h];

        int[][] barArr = new int[n][4];

        for(int i = 0; i < n; i++){

            int length = scanner.nextInt();
            int distance = scanner.nextInt();
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            for(int j = 0; j < 3; j++){
                for(int k = 0; k < length; k++) {
                    if(distance == 1){ // 가로
                        arr[(x - 1) + k][y - 1] = 1;
                    }else if(distance == 0) { // 세로
                        arr[x - 1][(y - 1) + k] = 1;
                    }
                }
            }
        }

        for (int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}