package com.kh.variable.practice2;

import java.util.Scanner;

public class CastingPractice2 {
	
	public void aaa() {
		
		/* 실수형으로 국어, 영어, 수학 세 과목의 점수를 입력 받아 총점과 평균을 출력하세요.
		이 때 총점과 평균은 정수형으로 처리하세요. 
		ex.
		국어 : 90.0
		영어 : 90.0
		수학 : 90.0
		총점 : 270
		평균 : 90
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		double k = sc.nextDouble();
		
		System.out.print("영어 : ");
		double e = sc.nextDouble();
		
		System.out.print("수학 : ");
		double m = sc.nextDouble();
		
		int sum = (int)(k + e + m);
		int avg = (sum / 3);
		
		System.out.println("총점 : " + sum + "\n평균 : " + avg);
		
		
	}

}
