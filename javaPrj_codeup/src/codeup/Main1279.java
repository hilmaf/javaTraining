package codeup;

import java.util.Scanner;

public class Main1279 {

	public static void main(String[] args) {
		
		int a;
		int b;
		int sum=0;
		
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		
		for( ; a<=b; a++) {
			if(a%2==1) {
				sum+=a;
			} else {
				sum=sum-a;
			}
		}
		
		System.out.println(sum);
		
	}

}
