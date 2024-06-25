package com.javaex.ex01;

public class Ex09 {
	
	public static void main(String[] args) {
		
		// 5/4 -> 1 (정수)/(정수) -> (정수)
		// 1을 실수형에 담는다 1 --> 1.0
		double v01 = 5/4;
		System.out.println(v01); //1.25?????? ㄱㅖ산 먼저니?????
		
		
		// (double)5 --? 5.0
		// 5.0 / 4 --> 5.0 / 4.0 (자동형변환)
		// 5.0/4.0 --> 1.23
		// 1.23 --> double
		double v02 = (double)5/4;
		System.out.println(v02); //1.25
		
		
		// 위 문제랑 같음 -> 다르게 보이면 더 공부해
		double v03 = 5 / (double)4;
		System.out.println(v03); //1.25
		
		
		//이게 더 쉬워야함 --> 아니면 더 공부해		
		double v04 = (double)5 / (double)4;
		System.out.println(v04); //1.25
		
		
		
		//
		int v05 = (int)1.3 + (int)1.8;
		System.out.println(v05); //2
		
		
		
	}
	
	
	
	

}
