package com.kh.control.condition.service;

import java.util.Scanner;

public class A_If {

	/*
	 * 프로그래밍 언어의 해석은 기본적으로 위->아래, 왼쪽->오른쪽 으로 순차적으로 해석됨
	 * 
	 * 이러한 해석 순서를 제어하는 것을 제어문이라 함
	 * 
	 * <조건문> - 조건식을 통해 참 또는 거짓을 판단하여 조건을 만족하는 경우 해당 코드를 수행하는제어문
	 *
	 * (삼항연산자도 제어문이다.)
	 * 
	 */

	public void example1() {
		// 단일 if문
		// 정수 하나를 입력받아 양수, 음수, 0을 판별하여 출력

		Scanner sc = new Scanner(System.in);

		System.out.println("정수 하나 입력 : ");
		int input = sc.nextInt();

		if (input > 0) { // input이 양수일 경우
			System.out.println("양수 입니다.");
		}

		if (input < 0) { // input이 음수일 경우
			System.out.println("음수 입니다.");
		}

		if (input == 0) { // input이 0인 경우
			System.out.println("0 입니다.");
		}

	}

	public void example2() {
		// if - else문

		/*
		 * if(조건식){ true일 때 수행 } else{ false일 때 수행 }
		 */

		// 정수 하나를 입력 받아 짝수, 홀수 판별하기

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 하나 입력 : ");
		int input = sc.nextInt();

		if (input % 2 == 1) { // input이 홀수인 경우
			System.out.println("홀수입니다.");
		} else { // input이 홀수가 아닌 경우 == 짝수인 경우
			System.out.println("짝수입니다.");
		}
	}

	public void example3() {
		// 1 ~ 12 사이의 숫자를 입력 받아
		// 해당 월의 계절을 출력하세요.
		// 단, 1 ~ 12 사이의 숫자가 아닌 경우 "잘못 입력하셨습니다" 출력하기.

		Scanner sc = new Scanner(System.in);

		System.out.println("1 ~ 12 사이 숫자를  입력해 주세요 : ");
		int month = sc.nextInt();

		String season = null;

		// 봄 : 3,4,5 / 여름 : 6,7,8 / 가을 : 9/10/11 / 겨울 : : 12,1,2
		if (month >= 3 && month <= 5) {
			// month가 3 이상, 5 이하인 경우
			season = "봄";
		} else if (month >= 6 && month <= 8) {
			season = "여름";
		} else if (month >= 9 && month <= 11) {
			season = "가을";
		} else if (month == 12 || month == 1 || month == 2) {
			season = "겨울";
		} else { // 위 조건문이 모두 false인 경우
			season = "잘못 입력하셨습니다.";
		}
		System.out.println(season);
	}

	public void example4() {
		// 나이를 키보드로 입력 받아 어린이(13세 이하)인지,
		// 청소년(13세 초과 ~ 19세 이하)인지,
		// 성인(19세 초과)인지 출력하세요.

		Scanner sc = new Scanner(System.in);

		System.out.println("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		String result = null;

		if (age <= 13) {
			result = "어린이";
		} else if (age <= 19) {
			result = "청소년";
		} else {
			result = "성인";
		}

		System.out.println(result);
	}

	public void example5() {
		// 나이를 키보드로 입력 받아
		// 0 ~ 120세 사이인 경우
		// 어린이(13세 이하)인지,
		// 청소년(13세 초과 ~ 19세 이하)인지,
		// 성인(19세 초과)인지 판별하고
		// 나이 범위를 초과하는 경우 "잘못 입력하셨습니다." 출력

		Scanner sc = new Scanner(System.in);

		System.out.println("나이를 입력하세요 : ");
		int age = sc.nextInt();

		String result = null;

		if (age >= 0 && age <= 120) { // age가 0이상 120이하인 경우
			if (age <= 13) {
				result = "어린이";
			} else if (age <= 19) {
				result = "청소년";
			} else {
				result = "성인";
			}
		} else {
			result = "잘못 입력하셨습니다.";
		}
		
		System.out.println(result);
	}
	
	public void example6() {
		// 나이를 키보드로 입력 받아 어린이(13세 이하)인지,
		// 청소년(13세 초과 ~ 19세 이하)인지,
		// 성인(19세 초과)인지 출력하세요.

		Scanner sc = new Scanner(System.in);

		System.out.println("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		String result = null;

		if(age < 0 || age > 120) { // age가 0미만 또는 120 초과인 경우
			result = "잘못 입력하셨습니다.";
		} else if (age <= 13) {
			result = "어린이";
		} else if (age <= 19) {
			result = "청소년";
		} else {
			result = "성인";
		}

		System.out.println(result);
	}
	
	public void example7() {
		// 이름을 입력하여 본인인지 확인하기
		
		
		// 이름을 입력하세요 : 강수정
		// 본인 입니다.
		
		// 이름을 입력하세요 : 홍길동
		// 본인이 아닙니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		if(!name.equals("강수정")) { 
			// String 값을 비교하기 위해서 ==, != 비교연산을 사용할 수 없다
			// -> String 값을 비교하기 위해서는
			// 	  String.equals() 메소드를 사용해야 함
			// 		-> 두 String의 실제 값이 같은지를 비교하는 메소드
			//			같으면 true, 아니면 false 반환
			System.out.println("본인 입니다.");
		} else {
			System.out.println("본인이 아닙니다.");
		}
		
		
	}
	
}
