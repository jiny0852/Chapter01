package com.javaex.ex04;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("숫자를 입력하세요 : ");
			int n = sc.nextInt();
			
			if (n == 0) {
				System.out.println("종료");
				break;
			} else if (n%3 == 0 ) {
				System.out.println("3의 배수입니다.");
				continue;
			} else {
				System.out.println("3의 배수가 아닙니다.");
				continue;
			}
		}
		
		
		sc.close();
	}

}
