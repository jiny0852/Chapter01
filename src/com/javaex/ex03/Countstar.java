package com.javaex.ex03;

import java.util.Scanner;

public class Countstar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("횟수를 입력하세요 : ");
		int n = sc.nextInt();
		int maxWidth = 2 * n - 1;
		
		//위 삼각형
		for (int i = 0 ; i < n ; i++) {
			for (int j = n-1 ; j > i ; j--) {
				System.out.print(" ");
			}
			for (int j = 0 ; j < 2 * i +1 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//아래 삼각형
		for (int i = 0; i < n-1 ; i++) {
			for(int j = 0; j < i + 1 ; j++) {
				System.out.print(" ");
			}
			for (int k = maxWidth -2; k > 2*i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
				
		sc.close();

	}

}

/*
for ( int i=1 ; i<n ; i++ ) {
	
	for (int y = n ; y < 5; y--) {
		System.out.print("*");
		break;
	}
	System.out.println();
	}
	*/