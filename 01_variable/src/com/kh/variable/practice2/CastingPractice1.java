package com.kh.variable.practice2;

import java.util.Scanner;

public class CastingPractice1 {
	
	public void autoCasting() {
		// 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자");
		char e = sc.nextLine().charAt(0);
		int i = e;
		
		System.out.println(e + "unicode : " + i);
		
		// 변수 안하고 강제 형변환 한 경우
		// System.out.println(ch + "unicode : " + (int)ch);
		
		

	}
}
