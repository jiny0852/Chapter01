package com.javaex.ex03;

import java.util.Scanner;

public class Ex05 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 : ");
		int n = sc.nextInt();
		
		
		if ( n >= 90 ) {
			
			System.out.println("A등급");
			
		} else if ( 90 > n && n >= 80 ) {   //90>n>=80   //n >= 80 ) {
			
			System.out.println("B등급");
			
		} else if ( 80 > n && n >= 70 ) {    //80>n>=70  //n >= 70 ) {
			
			System.out.println("C등급");
			
		} else if ( 70 > n && n >= 60 ) {    //70>n>=60  //n >= 60 ) {
			
			System.out.println("D등급");
			
		} else {
			
			System.out.println("F등급");
			
		}
		
		sc.close();
		
	}

}
