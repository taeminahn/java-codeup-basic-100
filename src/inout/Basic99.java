package inout;
import java.util.Scanner;
public class Basic99 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] antHome = new int[10][10];
        int x = 1;
        int y = 1;

        for(int i = 0; i < antHome.length; i++) {
            for(int j = 0; j < antHome[i].length; j++) {
                antHome[i][j] = scanner.nextInt();
            }
        }
        
        for(int i = 0; i < antHome.length; i++) {
            for(int j = 0; j < antHome[i].length; j++) {
                if(i >= x && j >= 1){
                    antHome[i][j] = 9;
                    if(antHome[i][j + 1] == 1) {
                        i++;
                    }else if(antHome[i][j + 1] == 2){
                        return;
                    }
                }

                System.out.print(antHome[i][j] + " ");
            }
            System.out.println();
        }
    }
}