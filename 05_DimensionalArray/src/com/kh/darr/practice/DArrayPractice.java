package com.kh.darr.practice;

public class DArrayPractice {

	public void practice1() {
		/*
		 * 3행 3열짜리 문자열 배열을 선언 및 할당하고 인덱스 0행 0열부터 2행 2열까지 차례대로 접근하여 “(0, 0)”과 같은 형식으로 저장
		 * 후 출력하세요.
		 * 
		 * ex. 
		 * (0, 0)(0, 1)(0, 2) 
		 * (1, 0)(1, 1)(1, 2) 
		 * (2, 0)(2, 1)(2, 2)
		 */

		String[][] result = new String[3][3];

		for (int i = 0; i < result.length; i++) { // 행제어

			for (int j = 0; j < result[i].length; j++) { // 열제어
				System.out.print("(" + i + "," + j + ")");

			}
			System.out.println();
		}

	}
	
	public void practice2() {
		/* 4행 4열짜리 정수형 배열을 선언 및 할당하고
			1) 1 ~ 16까지 값을 차례대로 저장하세요.
			2) 저장된 값들을 차례대로 출력하세요.
		    ex.
			1 2 3 4
			5 6 7 8
			9 10 11 12
			13 14 15 16 */
		
		String[][] result = new String[4][4];
		
		//int[][] result2 = new int[4][4];
		
		
		for (int i=0; i<result.length; i++) {
			
			for (int j=0; j<result[i].length; j++) {
				//sum += j;
				System.out.print(j+1+ " ");
			}
			System.out.println();
		}
		
		
	}
	

}
