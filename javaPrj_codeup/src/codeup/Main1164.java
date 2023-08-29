package codeup;

import java.util.Scanner;

public class Main1164 {

	public static void main(String[] args) {
		
		int tunnel1, tunnel2, tunnel3;
		final int CAR = 170;
		
		Scanner sc = new Scanner(System.in);
		tunnel1 = sc.nextInt();
		tunnel2 = sc.nextInt();
		tunnel3 = sc.nextInt();
		
		if(tunnel1<=CAR || tunnel2<=CAR || tunnel3<=CAR) {
			System.out.println("CRASH");
		} else {
			System.out.println("PASS");
		}
		
	}

}
