package com.javaex.ex03;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int n = sc.nextInt();
		
		if ( n > 0 ) {
			
			System.out.println("양수입니다.");
			
		} else if ( n < 0 ) {
			
			System.out.println("음수입니다.");
			    
		} else if ( n == 0 ) {
			
			System.out.println("0입니다.");
			
		}
		
		sc.close();

	}

}
