package com.javaex.ex05;

public class Ex03 {

	public static void main(String[] args) {
		
		int[] noArr  = new int[3];
		
		noArr[0] = 3;
		noArr[1] = 6;
		noArr[2] = 9;
		
		System.out.println(noArr[0]);
		System.out.println(noArr[1]);
		System.out.println(noArr[2]);
		
		System.out.println("--------------");
		//int a = noArr.length;
		//System.out.println(a);
		
		//전부 출력
		for (int i = 0; i <= noArr.length ; i++ ) {
			System.out.println(noArr[i]);
		}
		

	}

}
