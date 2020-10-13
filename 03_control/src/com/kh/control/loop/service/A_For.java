package com.kh.control.loop.service;

import java.util.Scanner;

public class A_For {
	/*
	 * 1. for문 (단일 for문)
	 * 
	 * for(초기식; 조건식; 증감식){ 수행 될 코드; }
	 * 
	 * - 초기식 : for문 내부에서 사용할 변수를 선언할 수 있는 부분 -> 보통 반복문 제어를 위한 변수를 선언함
	 * 
	 * - 조건식 : 논리값이 반환되는 식을 작성 true인 경우 : 반복문 수행 false인 경우 : 반복문 종료
	 * 
	 * - 증감식 : 1회 반복 종료 시 마다 수행될 문장을 작성 -> 보통 초기식을 증가 또는 감소시켜 종료 조건을 만드는 용도로 사용
	 */

	public void example1() {
		// 1부터 5까지 출력

		for (int i = 5; i < 11; i++) {
			System.out.println(i);
		}
	}

	public void example2() {
		// 5부터 1까지 1씩 감소하면서 출력

		for (int i = 5; i >= 1; i--) {
			System.out.println(i);

		}
	}

	public void example3() {
		// 1 ~ 10 까지 0.5씩 증가하면서 출력
		for (double i = 1; i <= 10; i += 0.5) {
			System.out.println(i);
		}

	}

	public void example4() {
		// A ~ Z까지 순서대로 출력
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch);
		}

	}

	public void example5() {
		// 1에서 10 사이의 정수 중 홀수만 출력
		// 1 3 5 7 9
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				System.out.println(i + " ");

			}
		}

		System.out.println("\n=============================\n");

		for (int i = 1; i <= 10; i += 2) {
			// 1 3 5 7 9
			System.out.println(i + " ");
		}

	}

	public void example6() {
		// 실수를 3번 입력받아 합계, 평균 출력
		Scanner sc = new Scanner(System.in);

		// 합계 구하기
		double sum = 0;

		for (int i = 1; i <= 3; i++) {
			System.out.println("실수입력" + i + " : ");

			// 입력 받을 값을 sum변수에 누적
			sum += sc.nextDouble(); // 재사용을 안하기 때문에 변수에 안담아도 무방함
		}

		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + sum / 3);

	}

	public void example7() {
		// 정수 하나를 입력받아 구구단에서 해당하는 단을 출력

		// 정수 입력 : 5
		// 5 X 1 = 5
		// 5 X 2 = 10
		// 5 X 3 = 15
		// ...
		// 5 X 9 = 45

		Scanner sc = new Scanner(System.in);

		System.out.println("정수 입력 : ");
		int dan = sc.nextInt(); // 재활용 해야하기 때문에 변수에 담음

		if (dan >= 2 && dan <= 9) {
			for (int su = 1; su <= 9; su++) {
				System.out.println(dan + " x " + su + " = " + dan * su);
			}
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}

	}

	public void example8() {
		// 1~10 사이 임의의 정수(난수) 5개를 출력하고, 합계 출력

		/*
		 * java.lang.Math.random() - 자바에서 수학 관련 기능을 제공하는 Math 클래스의 메소드 중 하나 - 난수 발생 범위 :
		 * 0.0 <= random < 1.0 (double)
		 */

		// java.lang 패키지는 자바의 기본 패키지로
		// 컴파일 시 자동으로 import가 추가됨
		// -> java.lang에 속해있는 클래스는 별도의 import를 작성하지 않아도 됨
		// System.out.println(java.lang.Math.random()); // (Math.random) 으로 해도 됨

		int sum = 0;
		for (int i = 1; i <= 5; i++) {
			int random = (int) (Math.random() * 10 + 1);
			// 0.0 <= Mate.random() < 1.0
			// 0.0 <= Mate.random() * 10 < 10.0
			// 1.0 <= Mate.random() * 10 + 1 < 11.0
			// 1 <= (int)(Mate.random() * 10 + 1) < 11

			sum += random; // 합계 누적
			System.out.println(random);
		}

		System.out.println("합계 : " + sum);

	}

	public void example9() {
		// 1 ~ 20 사이 임의의 정수를 발생시켜
		// 1부터 발생한 임의의 수 까지의 합 출력하기

		int random = (int) (Math.random() * 20 + 1);

		int sum = 0;
		for (int i = 1; i <= random; i++) {
			sum += i;
		}
		System.out.println("random : " + random);
		System.out.println("sum : " + sum);
	}

	public void example10() {
		// 정수 2개를 입력받아
		// 두 정수 사이의 모든 정수의 합을 출력

		Scanner sc = new Scanner(System.in);
		System.out.println("입력1 : ");
		int num1 = sc.nextInt();

		System.out.println("입력2 : ");
		int num2 = sc.nextInt();

		if (num1 > num2) {
			// 두 변수에 저장된 값 바꾸기
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}

		int sum = 0;
		for (int i = num1; i <= num2; i++) {
			sum += i;
		}

		System.out.println("sum : " + sum);

	}

	// ==================================================================================================

	// 중첩 for문

	public void example11() {
		// 12345
		// 12345
		// 12345
		// 12345
		// 12345

		for (int i = 1; i <= 3; i++) { // 행 제어

			for (int j = 1; j <= 5; j++) { // 열 제어

				System.out.print(j);
			}

			System.out.println(); // 줄바꿈
		}

	}

	public void example12() {
		// 분, 초 출력하기
		// 0분 0초 ~ 59분 59초
		for (int min = 0; min < 60; min++) {

			for (int sec = 0; sec < 60; sec++) {

				System.out.println(min + "분" + sec + "초");

				try {
					Thread.sleep(1000);
				} catch (Exception e) {
				}

			}
		}

	}

	public void example13() {
		// 2단부터 9단까지 구구단 모두 출력

		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " x " + j + " = " + i * j);
			}
			System.out.println();
		}
	}

	public void example14() {
		// 구구단 거꾸로 출력

		for (int i = 9; i >= 2; i--) { // 단
			System.out.println("====" + i + "단====");
			for (int j = 9; j >= 1; j--) { // 숫자
				System.out.println(i + " x " + j + " = " + i * j);
			}
			System.out.println();
		}

	}

	public void example15() {
		// 정수 입력 : 5
		// 1
		// 12
		// 123
		// 1234
		// 12345
		// 결과에 맞는 조건과 초기식을 작성 해야 함
		// 입력된 숫자만큼의 행과 열

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int input = sc.nextInt();

		for (int i = 1; i <= input; i++) { // 행

			for (int j = 1; j <= i; j++) { // 열

				System.out.print(j);
			}

			System.out.println(); // 줄바꿈
		}

	}

	public void example16() {
		// 정수 입력 : 5
		/*
		 * 1 (1행 1열) 2 3 (2행 2열) 4 5 6 (3행 3열) 7 8 9 10 (4행 4열) 11 12 13 14 15
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int input = sc.nextInt();

		int count = 1;
		for (int i = 1; i <= input; i++) { // 행 (i가 1일 때 안쪽 for문이 수행)

			for (int j = 1; j <= i; j++) { // 열 (j가 i값과 같을 때까지 "System.out.print(count++ + " ");" 수행)
				System.out.print(count++ + " ");
				// count++; // 안쪽 for문이 수행된 후 count가 1씩 증가
			}
			System.out.println();
		}

	}

	public void example17() {
		// 한 줄에 별표문자를 입력된 줄 수와 칸 수만큼 출력
		// 단, 줄 수와 칸 수가 일치하는 위치에는 줄 번호에 대한 정수가 출력
		/*
		 * 줄 수 : 6 칸 수 : 6 1***** 특정 조건에 숫자가 입력 됨 *2**** 별에 조건문을 걸어야 함 **3*** ***4**
		 * ****5* *****6
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("줄 수 : ");
		int row = sc.nextInt();

		System.out.println("칸 수 : ");
		int col = sc.nextInt();

		for (int r = 1; r <= row; r++) { // 줄 수(행)

			for (int c = 1; c <= col; c++) { // 칸 수(열)

				if (r == c) {
					System.out.print(r);
				} else {
					System.out.print("*");
				}

			}

			System.out.println();
		}

	}

}
