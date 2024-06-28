package com.javaex.ex05;

public class Ex98 {

	public static void main(String[] args) {

		int[] leftArray = new int[] {10, 10, 30, 40};
		int[] RightArray = new int[] {10, 20, 30, 10};
		
		if ( leftArray.length != RightArray.length ) {
				System.out.println("두배열의 크기가 다릅니다");
			
		} else if (leftArray != RightArray) {
			
			for ( int i = 0 ; i < leftArray.length ; i++ ) {
				if ( leftArray[i] != RightArray[i] ) {
					System.out.println( i + " 번쨰 값이 다릅니다.");
				}
			}
			
		}
		
		
		

	}

}
