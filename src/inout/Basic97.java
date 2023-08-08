package inout;
import java.util.Scanner;
public class Basic97 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] checkerboard = new int[19][19];

        for(int i = 0; i < checkerboard.length; i++){
            for(int j = 0; j < checkerboard[i].length; j++) {
                checkerboard[i][j] = scanner.nextInt();
            }
        }

        int n = scanner.nextInt();

        for(int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            for(int j = 0; j < checkerboard.length; j++) {
                checkerboard[j][y-1] = (checkerboard[j][y-1] == 0) ? 1 : 0;
                checkerboard[x-1][j] = (checkerboard[x-1][j] == 0) ? 1 : 0;
            }
        }

        for (int i = 0; i < checkerboard.length; i++){
            for(int j = 0; j < checkerboard[i].length; j++){
                System.out.print(checkerboard[i][j] + " ");
            }
            System.out.println();
        }
    }
}