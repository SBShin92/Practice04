package com.javaex.practice;

public class Ex08 {
	public static void main(String[] args) {
		
		int intArray[] = new int[6];
		
		for (int i = 0; i < intArray.length; i++) {
		intArray[i] = (int)(Math.random() * 45) + 1;
		}
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + "\t");
		}
		System.out.println("");
	}
}
