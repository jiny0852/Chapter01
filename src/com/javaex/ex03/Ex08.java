package com.javaex.ex03;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("과목번호를 입력하세요 : ");
		int n = sc.nextInt();
		
		
		if(n==1) {
			System.out.println("R101호");
		} else if (n==2) {
			System.out.println("R202호");
		} else if (n==3) {
			System.out.println("R303호");
		} else if (n==4) {
			System.out.println("R404호");
		} else {
			System.out.println("상담사에게 문의하세요");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		switch(n) {
		case 1:
			System.out.println("R101호");
			break;
		case 2:
			System.out.println("R202호");
			break;
		case 3:
			System.out.println("R303호");
			break;
		case 4:
			System.out.println("R404호");
			break;
		default :
			System.out.println("상담사에게 문의하세요.");
			break;
		}
		
		
		
		sc.close();
		
	}

}
