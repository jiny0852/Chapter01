package com.javaex.ex01;

import java.util.Scanner;

public class sdsdsd {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		
		System.out.print("점수를 입력하세요 : ");
		n = sc.nextInt();
		
		    
		if (n >= 60) {
			System.out.println("점수:" + n + "\n" + "합격입니다.");
		}
		/*
		else {
			System.out.println("점수:" + n + "\n" + "불합격입니다.");
		}*/
		
		
		
		sc.close();
		
	}
	

}
