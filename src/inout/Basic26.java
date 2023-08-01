package inout;

import java.util.Scanner;

public class Basic26 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String[] time = scanner.nextLine().split(":");
		int m = Integer.parseInt(time[1]);
		System.out.printf("%d",m);
	}

}
