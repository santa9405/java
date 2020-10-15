package com.kh.array.service;

import java.util.Arrays;
import java.util.Scanner;

public class C_ArrayOverlap {
	// 배열 중복 제거
	// [1, 3, 3, 4, 5]

	public void example1() {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++) { // 입력받을 배열 요소 제어
			System.out.println(i + "번 인덱스 값 입력 : ");
			arr[i] = sc.nextInt();

			// 이미 입력된 값이 또 입력된 경우
			// "이미 입력된 값입니다." 출력 후 재입력 받기

			for (int j = 0; j < i; j++) { // 비교 대상 제어

				if (arr[i] == arr[j]) {
					// 현재 입력받은 arr[i] 값이
					// 비교대상인 arr[j]와 같은 경우

					System.out.println("이미 입력된 값입니다.");
					i--;
					break; // 중복된 값이 입력된 경우 다시 비교할 필요 없이 멈추고 비교 대상 제어로 for문으로 돌아감

				}
			}
		}

		System.out.println(Arrays.toString(arr));

	}

	public void example2() {
		// 1 ~ 10 사이 중복되지 않은 난수 5개 생성
		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++) {

			// 난수 생성 후 대입
			arr[i] = (int) (Math.random() * 10 + 1); // Math.random 이 double형 이므로 int로 강제 형변환

			// 중복 검사
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}

		System.out.println("결과 : " + Arrays.toString(arr));

	}

	public void createLoottoNumber() {
		// 입력 받은 금액 만큼 로또번호 생성
		// 1000원당 1줄씩
		// ex) 금액 : 3000
		// 로또 번호 : [39, 10, 4, 3, 38, 23, 20]
		// 로또 번호 : [11, 21, 32, 36, 37, 38, 40]
		// 로또 번호 : [8, 15, 20, 24, 34, 36, 45]

		/*
		 * int[] lotto2 = new int[7];
		 * 
		 * for(int i=0; i<lotto2.length; i++) { lotto2[i] = (int)(Math.random() * 45 +
		 * 1);
		 * 
		 * for(int j=0; j<i; j++) {
		 * 
		 * }
		 * 
		 * }
		 */

		// 1 ~ 45 까지 중복되지 않은 수 7개

		Scanner sc = new Scanner(System.in);

		System.out.print("금액 : ");
		int won = sc.nextInt();

		for (int k = 1; k <= won / 1000; k++) {

			int[] lotto = new int[7];

			// 로또 번호 생성
			for (int i = 0; i < lotto.length; i++) {
				lotto[i] = (int) (Math.random() * 45 + 1); // Math.random 이 double형 이므로 int로 강제 형변환

				for (int j = 0; j < i; j++) {
					if (lotto[i] == lotto[j]) {
						i--;
						break;
					}
				}
			}

			// 생성된 로또 번호 정렬(삽입정렬)
			for (int i = 1; i < lotto.length; i++) { // 주체 선정, i=인덱스 시작 번호
				for (int j = i - 1; j >= 0; j--) { // 대상 선정
					if (lotto[j + 1] < lotto[j]) { // 대상 오른쪽 값이 대상 값보다 작은 경우
						int temp = lotto[j + 1]; // 자리 바꿈
						lotto[j + 1] = lotto[j];
						lotto[j] = temp;
					}

				}
			}

			System.out.println("로또번호 : " + Arrays.toString(lotto));

		}

	}

}
