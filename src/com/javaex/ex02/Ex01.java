package com.javaex.ex02;

//클래스
public class Ex01 {
	// 메인 메소드
	public static void main(String[] args) {

		System.out.println("안녕");
		System.out.println("하세요");

		System.out.print("안녕");
		System.out.println("하세요");

		System.out.println("---------------");

		int i = 2345;
		double d = 3.14;
		char c = '한'; // 실제 값을 가지고 있다
		String s = ""; // 주소를 가지고 있다
		String name = "신지연";
		String str = "굿모닝";

		System.out.println(str);
		System.out.println(str + str);
		System.out.println(str + name + str);
		System.out.println(i + i); //정수 + 정수
		System.out.println(i + d); //정수 + 실수    정수(자동현변환->) + 실수

		System.out.println(str + i); //굿모닝2345
		
		String str2 = str + i; //문자열 + 숫자(정수, 실수) --> 문자열
		
		System.out.println(str + " 랑 " + name);
		System.out.println("제이름은 " + name + "입니다.");
		
		System.out.println(c);
		System.out.println(c + c);
		
		//제이름은 "황일영"입니다.
		System.out.println("제이름은 \"" + name + "\"입니다.");
		
		//제이름은 \황일영\ 입니다.
		System.out.println("제이름은 \\" + name + "\\ 입니다.");
		System.out.println("제이름은 \t" + name + "\t 입니다.");
		System.out.println("제이름은 \n" + name + " 입니다.");
		
	}

}
