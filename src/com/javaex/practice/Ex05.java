package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double numArray[] = new double[5];
		
		
		for (int i = 0; i < 5; i++) {
			numArray[i] = sc.nextDouble();
		}
		double avg = 0;
		for (int i = 0; i < numArray.length; i++) {
			avg += numArray[i];
		}
		avg /= (double)numArray.length;
		
		System.out.printf("평균은 %.1f 입니다.", avg);
		sc.close();
	}
}
