package com.javaex.ex04;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단을 입력해주세요 \n단 : ");
		int n = sc.nextInt();
		int i = 0;
		
		for (int t = 1; t<10 ; t++ ) {
			System.out.println(n + " * " + t + " = " + n*t);
		}
		
		
		
		sc.close();
	}

}
