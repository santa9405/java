package com.kh.operator.service;

import java.util.Scanner;

public class C_TernaryOperator {
	
	
	// 삼항 연산자
	// (조건식) ? 식1 : 식2;
	// - 조건식 결과가 true이면 식1 수행
	// - 조건식 결과가 false이면 식2 수행
	public void example1() {
		// 정수 하나를 입력받아 양수인지, 양수가 아닌지 검사
		// 양수일 경우 "양수입니다."
		// 양수가 아닐 경우 "양수가 아닙니다."
		// 를 출력하시오.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 하나 입력 : ");
		int input = sc.nextInt();
		
		String result = (input > 0) ? "양수입니다." : "양수가 아닙니다.";
		System.out.println(input + "은/는 " + result);
		
	}
	
	public void example2() {
		// 삼항 연산자 중첩 사용
		
		// 정수 하나를 입력받아, 양수, 0 , 음수인지 검사
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 하나 입력 : ");
		int input = sc.nextInt();
		
		String result = (input > 0) ? "양수입니다." : (input == 0 ? "0입니다." : "음수입니다.");
		System.out.println(input + "은 " + result);
		
	}

}
