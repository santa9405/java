package com.kh.darr.service;

import java.util.Scanner;

public class DarrService {

	public void example1() {
		// 2차원 배열
		// - 1차원 배열의 묶음

		// 2차원 배열 선언
		int[][] iArr; // int형 2차원 배열 참조 변수 선언

		// 2차원 배열 할당
		iArr = new int[2][3];
		// 2차원 배열 2행 3열을 할당하여
		// 시작 주소값을 iArr 참조 변수에 대입

		int count = 1; // 1 ~ 6 증가하는 변수
		// 배열의 각 요소에 1부터 6까지 저장
		for (int i = 0; i < iArr.length; i++) { // 행 제어
			// iArr.length : 행의 길이

			for (int j = 0; j < iArr[i].length; j++) { // 열 제어
				// iArr[i].length : i번째 행이 참조하고 있는 열의 길이

				iArr[i][j] = count++;
				// 배열 요소에 count 대입 후 count 1증가

			}
		}

		// 배열 값 출력
		for (int i = 0; i < iArr.length; i++) {

			for (int j = 0; j < iArr[i].length; j++) {

				System.out.print(iArr[i][j] + " ");

			} // 안쪽 for end
			System.out.println(); // 줄 바꿈

		}

	}

	public void example2() {
		// 2차원 배열 선언, 할당, 초기화
		int[][] arr = { { 10, 20, 30 }, { 4, 5, 6 }, { 19, 17, 21 } };

		// 2차원 배열에 저장된 값 합계 구하기
		int sum = 0;
		for (int i = 0; i < arr.length; i++) { // 행
			for (int j = 0; j < arr[i].length; j++) { // 열

				sum += arr[i][j]; // arr i j번째에 누적 하겠다
			}

		}

		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + (double) sum / (arr.length * arr[0].length));
	}

	public void example3() {
		// 학생 두명의 국어, 영어, 수학 점수를 입력받아
		// 각 학생의 점수 합계, 평균 출력
		// 두 학생의 국어 평균, 수학 평균, 영어 평균

		/*
		 * 1번 학생 점수 입력 국어 : 50 영어 : 60 수학 : 70
		 * 
		 * 2번 학생 점수 입력 국어 : 70 영어 : 80 수학 : 90
		 * 
		 * ------------ 
		 * 
		 * 1번 학생 성적 국어 : 50 영어 : 60 수학 : 70 합계 : 180 평균 : 60
		 * 
		 * 2번 학생 성적 국어 : 50 영어 : 60 수학 : 70 합계 : 180 평균 : 80
		 * 
		 * 국어 평균 : 60  영어 평균 : 70  수학 평균 : 80
		 */

		Scanner sc = new Scanner(System.in);

		// 학생 점수 정보를 저장할 2차원 배열 선언 및 할당
		int[][] score = new int[2][3];
		String[] subject = { "국어", "영어", "수학" };

		// 학생별 점수 입력 받기
		for (int i = 0; i < score.length; i++) { // 행 제어 
							// score.length = 2
			System.out.println(i + 1 + "번 학생 점수");
			for (int j = 0; j < score[i].length; j++) { // 열 제어
								// score.length = 3
				System.out.print(subject[j] + " : ");

				// subject 배열에 저장된 값을 순서대로 출력
				score[i][j] = sc.nextInt(); // 점수 입력
			}
			System.out.println(); // 줄바꿈
		}
		// 경계선 출력
		System.out.println("------------------------");

		// 학생 성적 정보 출력
		for (int i = 0; i < score.length; i++) {
			System.out.println(i + 1 + "번 학생 성적");
			
			int sum = 0; // 학생 한명의 점수 합
			for (int j = 0; j < score[i].length; j++) {
				System.out.println(subject[j] + " : " + score[i][j]);
				sum += score[i][j];
			}

			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + sum / score[i].length);
			System.out.println(); // 줄바꿈
		}

		// 각 과목 평균
		for(int j=0 ; j<score[0].length ; j++) { // 열
			
			int sum = 0; // 과목 합계
			for(int i=0 ; i<score.length ; i++) { // 행
				sum += score[i][j];
			}
			
			System.out.println(subject[j] + "평균 : " + sum / score.length);
		}
		
	}

}
