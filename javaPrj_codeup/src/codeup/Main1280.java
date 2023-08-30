package codeup;

import java.util.Scanner;

public class Main1280 {

	public static void main(String[] args) {
		
		int a;
		int b;
		int sum=0;
		
		Scanner sc = new Scanner(System.in);
		
		a=sc.nextInt();
		b=sc.nextInt();
		
		while(a<=b) {
			if(a%2==1) {
				sum = sum+a;
				System.out.print("+" + a);
				a++;
			} else {
				sum = sum-a;
				System.out.print("-" + a);
				a++;
			}
		}
		
		System.out.print("=" + sum);
		
		
	}

}
