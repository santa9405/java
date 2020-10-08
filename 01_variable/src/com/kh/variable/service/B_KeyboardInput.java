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

	
	
	public void inputTest2() {
		// 사용자 정보를 입력받아 한번에 출력하기
		// 이름 : 강수정
		// 나이 : 27
		// 키 : 163.0
		// 강수정님은 27세이며 키는 163.0cm 입니다.
		
		Scanner sc = new Scanner(System.in);
		
		//System.out.print("이름 : ");
		//String name = sc.next();
		// 키보드로 입력된 한 줄의 문자열을 읽어와 String 변수 name에 대입;
		System.out.print("이름 : ");
		String na = sc.nextLine();
		
		//System.out.print("나이 : ");
		//int age = sc.nextInt();
		// 키보드로 입력된 정수값을 읽어와 int형 변수 age에 대입;
		System.out.print("나이 : ");
		int ag = sc.nextInt();
		
		//System.out.print("키 : ");
		//double height = sc.nextDouble();
		// 키보드로 입력된 실수값을 읽어와 double형 변수 height에 대입;
		System.out.print("키 : ");
		double he = sc.nextDouble();
		
		// 입력된 값을 이용하여 한 줄로 출력
		// 강수정님은 27세이며 키는 163.0cm 입니다.
		/*System.out.println(name + "님은 " + age + "세이며 키는"
							+ height + "cm 입니다."); */
		
		System.out.println(na + "님은 " + ag + "세 이며 키는"
							+ he + "cm 입니다.");
		
		
		
	}
	
		public void inputTest3() {
			// 사용자의 이름, 나이, 주소를 입력받아 한 줄로 출력하기
			
			// ↓입력 예시
			// 이름 : 강수정
			// 나이 : 27
			// 주소 : 서울시 중곡동 698
			// 강수정님은 27세이고, 서울시 중곡동 698에 살고 있습니다.
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("이름 : ");
			String name = sc.nextLine();
			
			System.out.print("나이 : ");
			int age = sc.nextInt();
			
			// 입력버퍼에 남아있는 개행문자(엔터) 제거하기
			// 31 뒤의 엔터 <- 제거
			sc.nextLine(); // 버퍼에 남아있는 개행문자를 읽어오서 버려주는 효과
			
			System.out.print("주소 : ");
			String address = sc.nextLine();
			
			System.out.println(name + "님은" + age + "세 이고,"
								+ address + "에 살고 있습니다.");
			
		}
	
}








