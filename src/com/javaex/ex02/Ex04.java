package com.javaex.ex02;

import java.util.Scanner;

public class Ex04 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int age;
		String name;

		
		System.out.println("나이를 입력해주세요");
		System.out.print("나이 : ");
		age = sc.nextInt();
		
		sc.nextLine(); //숫자받고 문자열 받을 시 버그있음 계행문자 처리 아님 문자열 받고 숫자
		
		System.out.println("이름을 입력해주세요");
		System.out.print("이름 : ");
		name = sc.nextLine();


		System.out.println("당신의 이름은 " + name + " 나이는 " + age + " 입니다.");

		sc.close();

	}

}
