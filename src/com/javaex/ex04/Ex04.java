package com.javaex.ex04;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		int j = 0;
		
		for (int i = 1; i<11 ; i++) {
			j = i + j;
		}
		
		
		System.out.println("1~10까지의 정수의 합은 " + j + " 입니다.");
	}

}
