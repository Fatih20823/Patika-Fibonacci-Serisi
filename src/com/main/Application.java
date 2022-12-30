package com.main;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		long temp=0,n1=0,n2=1;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("n sayisi giriniz");
		int n = scan.nextInt();
		System.err.print(n1+" "+n2);
		for (int i = 2; i < n;i++) {
			temp = n1+n2;
			System.out.print(" "+temp);
			n1 = n2;
			n2 = temp;
		}

	}

}
