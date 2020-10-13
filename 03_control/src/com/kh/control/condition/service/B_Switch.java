package com.kh.control.condition.service;

import java.util.Scanner;

public class B_Switch {
	
	/* switch문
	 * 
	 * -if문과 같은 조건문이지만
	 *  if문과 달리 조건식을 범위로 지정할 수 없음
	 *   (== 조건식의 결과가 딱 떨어지는 값이여야 함)
	 *   
	 * - 조건식의 결과가 true/false(논리값)이 아니어도 사용할 수 있음
	 * 
	 * - 동등 비교 : 값이 같은지를 비교
	 * - case 구문에서 break : 현재 switch가 연속으로 해석되는 것을 멈춤
	 * switch(동등 비교 대상자){
	 * case 값1 : 수행코드1; break;
	 * case 값2 : 수행코드2; break;
	 * default : 모든 case가 일치하지 않을 때 수행하는 코드;
	 * }
	 */

	public void example1() {
		// 1을 입력하면 "빨간불"
		// 2를 입력하면 "노란불"
		// 3을 입력하면 "초록불"
		// 다른 숫자를 입력하면 "잘못 입력하셨습니다" 출력.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 입력 : ");
		int input = sc.nextInt();
		
		switch(input) {
		case 1 : System.out.println("빨간불"); break;
		case 2 : System.out.println("노란불"); break;
		case 3 : System.out.println("초록불"); break;
		default : System.out.println("잘못 입력하셨습니다.");
		}
	}
	
		public void example2() {
			// 정수 두개와 산술 연산자를 1개를 입력받아
			// 연산자에 맞는 연산을 수행하여 결과 출력하기
			// 단, 잘못된 연산자를 입력한 경우 "해당하는 연산자가 존재하지 않습니다." 출력
			
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.println("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		sc.nextLine(); // 입력 버퍼에 남아있는 개행문자 제거
		
		System.out.println("연산자 : ");
		char op = sc.nextLine().charAt(0);
		
		int result = 0; // 연산 결과를 저장할 변수
		switch(op) {
		case '+' : result = num1 + num2; break;
		case '-' : result = num1 - num2; break;
		case '*' : result = num1 * num2; break;
		case '/' : result = num1 / num2; break;
		case '%' : result = num1 % num2; break;
		default : System.out.println("해당하는 연산자가 존재하지 않습니다."); return;
		}
		
		System.out.println(num1 + " " + op + " " + num2 + " = " + result);
		
		}
		
		
		public void example3() {
			// 등급별 권한부여
			// 관리자 : 조회
			//		    작성 
			//		    삭제
			// 회원    : 조회 
			//        작성
			// 비회원 : 조회
			
			
		Scanner sc = new Scanner(System.in);
		
		System.out.println("등급 지정 : ");
		String grade = sc.nextLine();
		
		switch(grade) {
		case "관리자" : System.out.println("삭제");
		case "회원" : System.out.println("작성");
		case "비회원" : System.out.println("조회");
		}
			
			
		}
		
		
		
	}
