package inout;

import java.util.Scanner;

public class Basic24 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		String [] arrStr = str.split("");
		for(int i = 0; i < arrStr.length; i++) {
			System.out.println("'" + arrStr[i] + "'");
		}
	}

}
