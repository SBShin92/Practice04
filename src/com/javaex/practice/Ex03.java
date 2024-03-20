package com.javaex.practice;

/*
 * inB의 0번째와 2번째에 숫자가 바뀌어서 출력될것이다
 * 20
 * 6
 * 10
 * 
 */

public class Ex03 {
	
	public static void main(String[] args) {
		int[] intA = {3, 6, 9};
		
		int[] intB;
		intB = intA;
		intB[0] = 20;
		intB[2] = 10;
		
		for (int i = 0; i < intA.length; i++) {
			System.out.println(intA[i]);
		}		
	}
}
