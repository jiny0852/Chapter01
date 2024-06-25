package com.javaex.ex03;

import java.util.Scanner;

public class Ex04 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t;  //시간
		int p;  //월급
		
		System.out.print("근무 시간을 입력하세요 : ");
		t = sc.nextInt();
		
		if ( t <= 8 ) {
			p = t * 10000;
			
			System.out.println("근무시간 : " + t + "\n" 
			                   + "임금은 " + p + "원 입니다.");
			
		} else {
			
			p = (t-8) * 15000 + 80000;
			
			System.out.println("근무시간 : " + t + "\n" 
			                   + "임금은 " + p + "원 입니다.");
			
		}
		
		
		
		sc.close();
		
	}

}
