package com.javaex.ex01;

public class Ex07 {
	
	public static void main(String[] args) {
		
		
	
		//일반적인 방식
		double pi = 3.14;
		double result01 = pi * 5 * 5;
		System.out.println(result01);
		
		
		//pi값을 변경
		pi = 3.1415926;
		double result02 = pi * 5 * 5;
		System.out.println(result02);
		
		
		///////////////////////////////////////////
		final double PI = 3.14;
		double result03 = pi * 5 * 5;
		System.out.println(result03);
		
		//PI값을 변경
		//PI = 3.1415926; //상수로 선언되서 바꿀수 없다
		
		
		
		
		
		
		
	}
	
	

}
