package com.javaex.ex01;

import java.util.Scanner;

public class Sds {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int age;
		String name;  // = new String();
		double hi;
		
		System.out.println("이름을 입력해주세요");
		System.out.print("이름 : ");
		name = sc.nextLine();
		
		//sc.nextLine();
		
		System.out.println("나이를 입력해주세요");
		System.out.print("나이 : ");
		age = sc.nextInt();
		
		//sc.nextInt();
		//sc.nextLine();
		
		System.out.println("키를 입력해주세요");
		System.out.print("키 : ");
		hi = sc.nextDouble();
		
		//sc.nextDouble();
		//sc.nextLine();
		
		System.out.println("당신의 이름은 " + name + " 나이는 " + age 
				           + " 키는 " + hi + " 입니다.");
		
		
		
		sc.close();
		
		
	}

}
