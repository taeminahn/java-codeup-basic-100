package inout;
import java.util.Scanner;
public class Basic82 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int hex = Integer.parseInt(input,16);
        for(int i = 1; i < 16; i++){
            System.out.format("%X*%X=%X%n",hex,i,hex*i);
        }
    }
}
