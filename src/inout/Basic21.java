package inout;

import java.util.Scanner;

public class Basic21 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String str = scanner.nextLine();
		String [] str_ = str.split("\\.");
		System.out.println(str_[0]);
		System.out.println(str_[1]);

	}

}
