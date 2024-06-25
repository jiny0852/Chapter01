package com.javaex.ex03;
import java.util.Scanner;

public class Sd {
	
	public static void main(String[] args) {
		
		final int soda1 = 1000, soda2 = 1500, soda3 = 1200;
		int coin;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 콜라 1,000원\n2.제로콜라 1,500원\n3.사이다 1,200원");
		System.out.print("음료를 선택하세요 : ");
		int soda = sc.nextInt();
		
		System.out.print("돈을 넣으세요 : ");
		coin = sc.nextInt();
		
		
		if ( soda == 1 ) {
			System.out.println("콜라 1,000원을 선택하셨습니다");
			
			while ( coin < soda1 ) {
				System.out.println( "투입금액 : " + coin  + "원");
				System.out.print( "금액이 부족합니다. \n돈을 넣으세요 : ");
				int plusCoin = sc.nextInt();
				coin = plusCoin + coin;
			}
			System.out.print("콜라가 출력되었습니다.\n잔돈 : " + (coin - soda1) + "원");
			
			
		} else if ( soda == 2 ) {
			System.out.println("제로콜라 1,500원을 선택하셨습니다");
			
			while ( coin < soda2 ) {
				System.out.println( "투입금액 : " + coin  + "원");
				System.out.print( "금액이 부족합니다. \n돈을 넣으세요 : ");
				int plusCoin = sc.nextInt();
				coin = plusCoin + coin;
			}
			System.out.print("제로콜라가 출력되었습니다.\n잔돈 : " + (coin - soda2) + "원");
			
			
		} else if ( soda == 3 ) {
			while ( coin < soda3 ) {
				System.out.println( "투입금액 : " + coin + "원");
				System.out.print( "금액이 부족합니다. \n돈을 넣으세요 : ");
				int plusCoin = sc.nextInt();
				coin = plusCoin + coin;
				
			}
			System.out.println("사이다가 출력되었습니다.\n잔돈 : " + (coin - soda3));
			
			
			int change = coin - soda3;  
			int n1000 = change/1000;
			int n500 = 0;
			int n100 = change/100 - n1000*10;
			int n50 = 0;
			int n10 = change/10 - n1000*100 - n100*10;
			
			
			if ( n100 >= 5 ) {
				n500 = 1;
				n100 = n100-5;
			}
			if ( n10 >= 5 ) {
				n50 = 1;
				n10 = n10-5;
			}
			
			
			System.out.println("1000원 " + n1000 +"\n500원 " + n500 + "\n100원 " + n100 +
					"\n50원 " + n50 + "\n10원 " + n10);
			
			
			
			
			
			
		}
		
		
		/*
		
		if ( coin < soda1 ) {
			
			System.out.print( "금액이 부족합니다. \n돈을 넣으세요 : ");
			int plusCoin = sc.nextInt();
			coin = plusCoin + coin;
			
		} else if ( coin >= soda1 ) {
			System.out.print("사이다가 출력되었습니다.\n잔돈 : " + (coin - soda3));
		}
		
	///////////////////////
		while ( coin < soda2 ) {
			System.out.print( "금액이 부족합니다. \n돈을 넣으세요 : ");
			int plusCoin = sc.nextInt();
			coin = plusCoin + coin;
			System.out.print( "투입금액 : " + coin);
		}
		System.out.print("콜라가 출력되었습니다.\n잔돈 : " + (coin - soda2));
		
		////////////////////////////////
		 System.out.println("콜라 1,000원을 선택하셨습니다");
			
			while ( coin < soda1 ) {
				System.out.println( "투입금액 : " + coin  + "원");
				System.out.print( "금액이 부족합니다. \n돈을 넣으세요 : ");
				int plusCoin = sc.nextInt();
				coin = plusCoin + coin;
			}
			System.out.print("콜라가 출력되었습니다.\n잔돈 : " + (coin - soda1) + "원");
		
		
		*/
		sc.close();
		
	}

}
