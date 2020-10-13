package com.kh.control.loop.service;

import java.util.Scanner;

public class B_While {
	/* while문
	 * 
	 * - for문과 달리 종료 조건이 불확실한 경우에 사용하는 반복문
	 * 
	 * [초기식] * [] <- 대괄호는 생략될 수 있음을 의미함
	 * while(조건식){
	 * 		수행코드;
	 * 		[증감식]
	 * }
	 */
	public void example1() {
		// 1 ~ 5 까지 출력
		int i = 1; // 초기식
		while(i <= 5) { // 조건식
			System.out.println(i);
			i++; // 증감식
		}
		
	}
	
	public void example2() {
		int i = 5;
		while(i >= 1) {
			System.out.println(i);
			i--;
		}
	}
	
	public void example3() {
		// 입력되는 모든 수 더하기
		// 단, 0 입력 시 더해진 수를 출력하고 종료
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int input = -1; 
		// -1은 while문이 바로 종료되지 않게 부여한 임의의 값
		
		while(input != 0) { // 조건식
			System.out.println("정수 입력 : "); // 수행 코드
			input = sc.nextInt();
			
			sum += input;
		}
		
		System.out.println("합계 : " + sum);
		
		/* count input sum
		 *  1	 1    1
		 *  2	 2    3
		 *  3	 5    8
		 *  4	 0    8 -> 0이 입력되어 while문 종료
		 *  */
		
	}
	
	public void example4() {
		// 입력되는 모든 수 더하기
		// 단, -1 입력 시 합계를 출력하고 종료
		// (-1 입력 시 sum에 더해지지 않게 하시오)
		Scanner sc = new Scanner(System.in);
		
		int sum = 0; // 합계 저장용 변수
		int input = 0; // 입력받은 수를 저장할 임시 변수
		
		boolean flag = true;
		
		while(flag) { // flag가 true 이므로 while문 실행 됨
			System.out.print("정수 입력 : ");
			input = sc.nextInt();
			
			if(input == -1) {
				flag = false; // -1일 때 깃발을 내림
			} else {
				sum += input;				
			}
			
		}
		
		System.out.println("합계 : " + sum);
		
		/* count input sum
		 *  1	  5    5
		 *  2	  3    8
		 *  3	 -1    7
		 *  */
		
	}
	
	public void example5() {
		// 입력되는 모든 수 더하기
		// 단, -1 입력 시 합계를 출력하고 종료 
		// (-1 입력 시 sum에 더해지지 않게 하시오)
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0; // 합계 저장용 변수 
		int input = 0; // 입력받은 수를 저장할 임시 변수
		
		
		while(input != -1) {
			System.out.print("정수 입력 : ");
			input = sc.nextInt();
			
			if(input != -1) {
				sum += input;
			}
			
		}
		
		System.out.println("합계 : " + sum);
		
	}
	
	
	
	
	
	
	
}
