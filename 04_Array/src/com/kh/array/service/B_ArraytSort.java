package com.kh.array.service;

import java.util.Arrays;

public class B_ArraytSort {
	// 배열 정렬
	// - 변수끼리 값 바꾸는 방법을 익히고 있어야 함
	// - for문을 이용한 배열 접근 방법을 작 숙지하고 있어야 함

	// 1) 배열 요소 끼리 값 바꾸기
	// 2) 삽입 정렬
	// 3) 버블 정렬

	public void example1() {
		int[] arr = { 2, 1, 3 };

		// 오름차순 : 작은 값 -> 큰 값 정렬
		// 내림차순 : 큰 값 -> 작은 값 정렬

		// 변수 끼리 값 바꾸기
		int temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public void insertionSort() {
		// 시험 문제로 나올 것 같음
		// 삽입 정렬
		// - 정렬 알고리즘에서 가장 간단하고 기본이 되는 알고리즘
		// - 배열의 n번째 요소를
		// 0 ~ n-1 요소가 비교하여 정렬을 진행

		int[] arr = { 2, 5, 4, 1, 3 };

		System.out.println("초기값 : " + Arrays.toString(arr));

		// 1. 비교 주체를 선택하는 for문
		for (int i = 1; i < arr.length; i++) {
			System.out.println("비교 주체 : " + arr[i]); // 비교 주체 : 5

			// 2. 비교 대상을 선택하는 for문
			for (int j = i - 1; j >= 0; j--) {

				// 비교 주체가 대상보다 값이 작다면 값 교환
				if (arr[j + 1] < arr[j]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;

					// 값 교환이 일어난 후 배열 출력
					System.out.println(Arrays.toString(arr));
				}
			}
		}

		System.out.println("결과 : " + Arrays.toString(arr));

	}

	public void bubbleSort() {
		// 버블 정렬
		// - 인접한 두 요소를 검사하여 정렬하는 방법으로
		// 배열의 뒤쪽부터 정렬이 완성되는게 특징
		// - 구현이 쉽다라는 장점이 있고,
		// 이미 정렬된 데이터를 다시 정렬할 때 속도가 가장 빠름(ex. 새로운 값이 들어온 경우)

		// - 처음부처 정렬 할 경우 다른 정렬 방법보다 정렬속도가 느림

		int[] arr = { 2, 5, 4, 1, 3 };

		System.out.println("초기값 : " + Arrays.toString(arr));

		// 1. 회차 지정
		// 전체 데이터 수 -1회 만큼 반복
		for (int i = 0; i < arr.length - 1; i++) { // i=arr의 인덱스 값, 4회까지 반복
			System.out.println(i+1 + "회차");

			// 2. 인접 요소 지정을 위한 for문(bubble 이동)
			for (int j = 0; j < (arr.length - 1) - i; j++) { // j는 회차에서 인덱스 값을 뺀 조건까지
				// 4

				if (arr[j + 1] < arr[j]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
					System.out.println(Arrays.toString(arr));
				}
			}

		}

		System.out.println("결과 : " + Arrays.toString(arr));

	}

}
