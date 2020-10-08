package com.kh.variable.practice1;

import java.util.Scanner;

public class VariablePractice3 {
	
	public void practice() {
		
		Scanner sc = new Scanner(System.in);
		
		/* 키보드로 가로, 세로 값을 값을 실수형으로 입력 받아 사각형의 면적과 둘레를 계산하여 출력하세요.
		계산 공식 ) 면적 : 가로 * 세로
		둘레 : (가로 + 세로) * 2
		
		ex.
		가로 : 13.5
		세로 : 41.7
		면적 : 562.95
		둘레 : 110.4 */
		
		System.out.print("가로  : ");
		double e = sc.nextDouble();
		
		System.out.print("세로 : ");
		double i = sc.nextDouble();
		
		System.out.println("면적 : " + (e * i));
		System.out.println("둘레 : " + (e + i) * 2);
		
		
	}
}
