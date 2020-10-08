package com.kh.variable.practice1;

import java.util.Scanner;

public class VariablePractice1 {
	
	public void practice() {
		// 실습문제1
		// 이름, 성별, 나이, 키를 사용자에게 입력 받아 각각의 값을 변수에 담고 출력하세요.
		/* ex.
		이름을 입력하세요 : 아무개
		성별을 입력하세요(남/여) : 남
		나이를 입력하세요 : 20
		키를 입력하세요(cm) : 180.5
		키 180.5cm인 20살 남자 아무개님 반갑습니다^^
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		System.out.print("성별을 입력하세요(남/여) : ");
		char gender = sc.nextLine().charAt(0);
		// String.charAt(index) : 문자열 중에 index 번째 문자 하나만을 꺼내옴.
		// * index는 0부터 시작
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		sc.nextLine(); //개행문자 제거
		
		System.out.print("키를 입력하세요 : ");
		double hieght = sc.nextDouble();
		
		System.out.println("키 " + hieght + "cm 인 " + age 
							+ "살 " + gender + "자 "+ name + "님 반갑습니다^^");
	}
}