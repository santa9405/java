package com.kh.variable.service;

import java.util.Scanner;

public class B_KeyboardInput {
	
	public void inputTest1() {
		Scanner sc = new Scanner(System.in);
		
		String name; // 문자열 변수 선언
		
		System.out.print("이름을 입력하세요 : ");
		
		name = sc.nextLine();
		// 사용자가 키보드로 입력한 한 줄(엔터 전 까지)의 내용을 읽어와서
		// name 변수에 대입해라;
		
		System.out.println("당신의 이름은 " + name + "입니다.");
		
	}

}
