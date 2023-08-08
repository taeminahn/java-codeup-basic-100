package inout;
import java.util.Scanner;
public class Basic96 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] checkerboard = new int[19][19];

        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            checkerboard[x-1][y-1] = 1;
        }
        for (int i = 0; i < checkerboard.length; i++){
            for(int j = 0; j < checkerboard[i].length; j++){
                System.out.print(checkerboard[i][j] + " ");
            }
            System.out.println();
        }
    }
}