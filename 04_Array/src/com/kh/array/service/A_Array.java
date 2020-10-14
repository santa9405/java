package com.kh.array.service;

import java.util.Arrays;
import java.util.Scanner;

public class A_Array {
	/*
	 * 배열 - 같은 자료형인 변수를을 하나의 묶음으로 다루는 것. - 배열에는 이름이 하나만 부여되기 때문에 묶여진 여러 배열을
	 * 숫자(index)로 구분. (index는 0부터 시작)
	 */

	public void example1() {
		// 1. 배열 선언
		// 자료형[] 배열명;
		// 자료형 배열명[];
		// [] 기호가 1차원 배열을 의미함.

		int[] arr; // int형 배열 선언
		// 배열 선언은 배열의 자료형과 이름을 지정하는 것일 뿐
		// 실제 데이터를 저장할 공간을 만드는 것은 아니다!

		// 2. 배열 할당
		// 배열명 = new 자료형[배열크기];
		arr = new int[5];

		// 3. 배열 초기화
		// 3-1. 인덱스를 이용하여 하나씩 초기화
		/*
		 * arr[0] = 1; arr[1] = 2; arr[2] = 3; arr[3] = 4; arr[4] = 5;
		 */

		// 3-2. for문을 이용한 초기화
		for (int i = 0; i < arr.length; i++) { // 배열 크기 : 5
			// 배열명.length : 배열의 길이(크기)를 반환
			arr[i] = i + 1;
		}

		/*
		 * System.out.println(arr[0]); System.out.println(arr[1]);
		 * System.out.println(arr[2]); System.out.println(arr[3]);
		 * System.out.println(arr[4]);
		 */

		for (int i = 0; i < arr.length; i++) { // arr.length는 arr의 값
			System.out.println(arr[i]);
		}

	}

	public void example2() {
		// 사용자로 부터 정수 5개를 입력받고
		// 입력받은 정수를 거꾸로 출력

		Scanner sc = new Scanner(System.in);

		int[] inputs = new int[5];

		for (int i = 0; i < inputs.length; i++) {
			System.out.println(i + "인덱스 입력 : ");
			inputs[i] = sc.nextInt(); // inputs 배열에 담길 index
		}

		System.out.println("==========결과==========");

		for (int i = inputs.length - 1; i >= 0; i--) {
			System.out.println(i + "인덱스 값 : " + inputs[i]);

		}
	}

	public void example3() {
		// 배열 선언, 할당, 초기화

		double[] dArr = { 1.1, 2.2, 3.3 };
		// 배열 선언 후 할당, 초기화를 {}를 이용하여 진행하는 경우
		// new 연산자 없이 작성할 수 있으며
		// {} 내의 데이터의 개수만큼 배열 크기가 할당된다

		String[] sArr = { "두리안", "아보카도", "샤인머스캣", "용과", "패션후르츠" };

		Scanner sc = new Scanner(System.in);
		System.out.print("0 ~ 4 사이 정수 입력 : ");
		int sel = sc.nextInt();
		
		System.out.println("선택한 과일 : " + sArr[sel]);
		// ArrayIndexOutOfBoundsException
		// --> 참조하려는 배열 index값이 해당 배열의 범위를 넘었다는 오류

	}
	
	public void example4() {
		// 사용자로부터 4명의 키를 입력받아
		// 입력받은 키, 합계, 평균을 출력하세요
		
		// 입력 1 : 170.5
		// 입력 2 : 185.5
		// 입력 3 : 190.0
		// 입력 4 : 160.0
		
		// 170.5 185.5 190.0 160.0
		// 합계 : xxx.xx
		// 평균 : xxx.xx
		
		// Scanner, 배열(double, 4칸), sum, sum/4
		
		Scanner sc = new Scanner(System.in);
		
		double[] height = new double[4];
		// 4명의 키를 입력받고 저장 할 배열 height 선언 및 할당
		
		for(int i=0; i<height.length ; i++) {
			// 4명의 키를 입력받기 위한 반복문
			
			System.out.println("입력 " + (i + 1) + " : ");
			height[i] = sc.nextDouble();
			// 입력받은 키를 각각의 배열 요소에 저장
		}
		
		// 배열에 저장된 값 합계 구하기
		double sum = 0; // 자동 형변환이 되므로 int의 표기법 사용
		for(int i=0 ; i<height.length ; i++) {
			sum += height[i];
			// 배열요소에 반복 접근하여 sum에 누적
		}
		
		// 결과 출력하기
		for(int i=0; i<height.length ; i++) {
			System.out.println(height[i] + " ");
		}
		
		System.out.println("\n합계 : " + sum);
		// \n : 줄 바꿈(개행)을 의미하는 escape 문자
		
		System.out.println("\n평균 : " + sum/height.length);
		
	}
	
	public void example5() {
		// 입력받을 사람의 수를 먼저 입력하고
		// 키를 입력받아 키, 합계, 평균 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사람 수 입력 : ");
		double[] hieght = new double[sc.nextInt()];

		double sum = 0.0; // 합계
		for(int i=0 ; i<hieght.length ; i++) { // length 인덱스의 길이
			System.out.print("키 입력" + (i+1) + " : ");
			hieght[i] = sc.nextDouble();
			sum += hieght[i]; // 입력 받은 키 누적
		}
		
		System.out.println( Arrays.toString(hieght) );
		// Arrays 클래스 : java에서 제공하는 배열 관련 유용한 기능을 모아놓은 클래스
		// Arrays.toString(배열명) :
		// 배열에 저장된 값을 한 줄로 출력, 출력되는 값 사이에 ','를 찍어줌
		// ex) (123, 123, 123, 123)
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + sum / hieght.length);
		
	}
	
	

}
