package inout;

import java.util.Scanner;

public class Basic25 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int length = (int)(Math.log10(num)+1);
		
		for(int i = length; i > 0; i--) {
			int place = (int)Math.pow(10, i-1);
//			System.out.println(num);
			System.out.println("[" + place * (num / place) + "]");
			num -= place * (num / place);
		}
	}

}
