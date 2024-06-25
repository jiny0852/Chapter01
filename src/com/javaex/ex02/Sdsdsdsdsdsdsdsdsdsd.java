package com.javaex.ex02;

import java.util.Scanner;

public class Sdsdsdsdsdsdsdsdsdsd {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int d; 
		
		System.out.print("월을 입력해주세요 : ");
		int m = sc.nextInt();
		
		switch (m) {
		
		case 2 :
			d = 28;
			System.out.println( d + "일 입니다.");
			break;
		    	
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			d = 31; 
			System.out.println( d + "일 입니다.");
		    break;
		    	
		case 4:
		case 6:
		case 9:
		case 11:
			d = 30;	
			System.out.println( d + "일 입니다.");
		    break;
		
		}
		
		//System.out.println( d + "일 입니다.");
		
		sc.close();
		
	}
	

}
