package com.javaex.ex04;

public class Ex13 {

	public static void main(String[] args) {
		
		int i = 1;
		
		System.out.println("---------------");
		
		while (true) {
			
			if (i>3) {
				break;
			}
			System.out.println(i);
			i++;
		}
		
		System.out.println("---------------");
		
		boolean flag = true;
		
		i = 1;
		while (flag) {
			
			if (i>3) {
				flag = false;				
				//break;
			}
			System.out.println(i);
			i++;
		}
		

	}

}
