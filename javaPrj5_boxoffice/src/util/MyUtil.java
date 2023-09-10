package util;

import main.Main;

public class MyUtil {
	public static int scanUserInput() {
		int num = Main.sc.nextInt();
		Main.sc.nextLine();
		return num;
	}
	
	public static String scanUserLine() {
		String str = Main.sc.nextLine();
		return str;
	}
}
