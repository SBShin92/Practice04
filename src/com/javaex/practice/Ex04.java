package com.javaex.practice;

public class Ex04 {
	public static void main(String[] args) {
	
		int[] data = { 1, 3, 5, 8, 9, 11, 15, 19, 18, 20, 30, 33, 31 };
		
		int i = 0;
		int count = 0;
		int sum = 0;
		while (i < data.length) {
			if (data[i] % 3 == 0) {
				++count;
				sum += data[i];
			}
			i++;
		}		
		System.out.println("주어진 배열에서 3의 배수의 개수=>" + count);
		System.out.println("주어진 배열에서 3의 배수의 합=>" + sum);
	}
}
