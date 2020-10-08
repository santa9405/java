package com.kh.variable.practice1;

import java.util.Scanner;

public class VariablePractice2 {
	
	public void practice() {
		
		// 키보드로 정수 두 개를 입력 받아 두 수의 합, 차, 곱, 나누기한 몫을 출력하세요.
		/* ex.
		첫 번째 정수 : 23
		두 번째 정수 : 7
		더하기 결과 : 30
		빼기 결과 : 16
		곱하기 결과 : 161
		나누기 몫 결과 : 3 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 : ");
		int e = sc.nextInt();
		
		System.out.print("두 번째 정수 : ");
		int i = sc.nextInt();
		
		//변수 사용
		int ej = e + i;
		int je = e - i;
		int ee = e * i;
		int jj = e / i;
		
		System.out.println("\n더하기 결과 : " + ej);
		System.out.println("빼기 결과 : " + je);
		System.out.println("곱하기 결과 : " + ee);
		System.out.println("나누기 결과 : " + jj);
		
		
		//System.out.println("\n더하기 결과 : " + (e + i));
		//System.out.println("빼기 결과 : " + (e - i));
		//System.out.println("곱하기 결과 : " + e * i);
		//System.out.println("나누기 몫 결과 : " + e / i);
	
		
		
		
		
		
		
		
	}
}
