package inout;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Basic27 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        StringTokenizer st = new StringTokenizer(str, ".");
        String year = st.nextToken();
        String month = st.nextToken();
        String day = st.nextToken();

        System.out.print(day + "-" + month + "-" + year);
    }

}