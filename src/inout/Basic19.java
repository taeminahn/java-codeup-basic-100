package inout;

import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Basic19 {

	public static void main(String[] args) throws ParseException {

		Scanner scanner = new Scanner(System.in);
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy.MM.dd");
		String str = scanner.nextLine();
		Date date = formatter.parse(str);
		System.out.print(formatter.format(date));
	}

}
