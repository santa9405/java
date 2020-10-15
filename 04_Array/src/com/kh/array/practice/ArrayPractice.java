package com.kh.array.practice;

import java.util.Scanner;

public class ArrayPractice {

	public void practice1() {
		/*
		 * 길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여 순서대로 배열 인덱스에 넣은 후 그 값을 출력하세요. ex. 1 2
		 * 3 4 5 6 7 8 9 10
		 */

		int[] arr = new int[10];

		for (int i = 0; i <= arr.length; i++) {
			System.out.print(i + " ");
		}

	}

	public void practice2() {
		/*
		 * 길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여 역순으로 배열 인덱스에 넣은 후 그 값을 출력하세요. ex. 10
		 * 9 8 7 6 5 4 3 2 1
		 */

		int[] arr = new int[10];

		for (int i = arr.length; i >= 1; i--) {
			System.out.print(i + " ");
		}

	}

	public void practice3() {
		/*
		 * 사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고 1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요. ex. 양의 정수 : 5
		 * 1 2 3 4 5
		 */

		// Scanner, 배열, for문

		Scanner sc = new Scanner(System.in);

		System.out.print("양의 정수 : ");
		int num = sc.nextInt();

		for (int i = 0; i <= num; i++) {
			int[] arr = new int[num];
			System.out.print(num);
		}

	}

	public void practice4() {

		/*
		 * 길이가 5인 String배열을 선언하고 “사과”, “귤“, “포도“, “복숭아”, “참외“로 초기화 한 후 배열 인덱스를 활용해서 귤을
		 * 출력하세요. ex. 귤
		 */

		String[] sArr = { "사과", "귤", "포도", "복숭아", "참외" };
		System.out.println("선택한 과일 : " + sArr[1]);
	}

	public void practice6() {

		String[] Strings = { "월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일" };

		Scanner sc = new Scanner(System.in);

		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();

		if (num >= 0 && num <= 6) {
			System.out.print(Strings[num]);
		} else {
			System.out.print("잘못 입력하셨습니다.");
		}

	}

	public void practice7() {

		// System.out.print("사람 수 입력 : ");
		// double[] hieght = new double[sc.nextInt()];

		Scanner sc = new Scanner(System.in);

		System.out.println("정수 : ");
		int[] input = new int[sc.nextInt()];

		// for(int i=0; i<height.length ; i++) {

		for (int i = 0; i < input.length; i++) {
			System.out.println("배열 " + i + "번째 인덱스에 넣을 값 : ");
			input[i] = sc.nextInt();
		}
		
		//double sum = 0; // 자동 형변환이 되므로 int의 표기법 사용
		//for(int i=0 ; i<height.length ; i++) {
			//sum += height[i];
			// 배열요소에 반복 접근하여 sum에 누적
		int sum = 0;
		for (int i=0; i<input.length; i++) {
			sum += input[i];
			
			//for(int i=0; i<height.length ; i++) {
			//	System.out.println(height[i] + " ");
			//}
			
			for(int k=0; k<input.length; k++) {
				System.out.print(input[k] + " ");
			}
			
			System.out.println("총 합 : " + sum);
		}
		
	}

}
