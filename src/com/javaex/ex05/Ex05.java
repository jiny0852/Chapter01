package com.javaex.ex05;

//배열을 사용하여 1~45 까지의 숫자 중 임의의 6개의 숫자를 출력하세요 (중복체크는 하지 말것)
public class Ex05 {

	public static void main(String[] args) {

		int[] arr = new int[6];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*45)+1;
			System.out.println(arr[i]);
		}
		
	}

}
