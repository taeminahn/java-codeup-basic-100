package inout;

import java.util.Scanner;

public class Basic20 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		str = str.replace("-", "");
		System.out.print(str);
	}

}
