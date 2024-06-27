package com.javaex.ex04;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단을 입력해주세요 \n단 : ");
		int n = sc.nextInt();
		int i = 1;
		
		while(i<10) {
			System.out.println(n + " * " + i + " = " + n*i);
			i++;
		}
		
		
		
		sc.close();
	}

}
