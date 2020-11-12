package com.kh.eh.model.service;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.kh.eh.model.exception.InputZeroException;

public class ExceptionService {

	/*
	 * 런타임 에러 : 프로그램 실행 중 발생하는 에러
	 * 
	 * 예외(Exception) : 소스 코드 수정으로 해결 가능한 에러 -> 런타임 에러가 예외에 속함
	 * 
	 * + 예외 상황은 코드 작성 시 예측이 가능하므로 예외를 "예측 가능한 에러" 라고도 함 ex) 배열의 범위를 벗어나는 상황, 계산식의
	 * 오류(나누기 0)
	 */

	public void example1() {

		Scanner sc = new Scanner(System.in);

		System.out.println("입력된 정수 두개를 나눈 몫 구하기");
		System.out.print("입력1 : ");
		int num1 = sc.nextInt();

		System.out.print("입력2 : ");
		int num2 = sc.nextInt();

		/*
		 * if(num2==0) { System.out.print("0으로 나눌 수 없습니다."); }else {
		 * System.out.print("결과 : " + num1 / num2); }
		 */

		// try{} : 예외가 발생할 가능성이 있는 코드를 블록{} 내에 작성하고 시도하는 구문
		// catch{} : try 구문에서 발생한 예외를 잡아내서 처리하는 구문

		try {
			System.out.println("결과 : " + num1 / num2);
		} catch (ArithmeticException e) {
			// try 구문 내에서 ArithmeticException 예외가 발생할 경우
			// catch에 작성된 매개변수로 해당 예외를 잡음
			System.out.println("0으로 나눌 수 없습니다.");
		}

	}

	public void example2() {
		// String 배열에 저장된 각 요소들의 제일 앞글자만 출력하기

		String[] arr = new String[3];

		arr[0] = "아이스 아메리카노";
		arr[1] = "카페 라떼";

		for (int i = 0; i <= arr.length; i++) {
			try {
				System.out.println(arr[i].charAt(0));
			} catch (NullPointerException e) {
				// NullPointerException : 참조하고 있는 값, 객체가 없는 예외 상황
				System.out.println(i + "번째 인덱스에 참조할 값이 없습니다.");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("배열의 인덱스 범위를 벗어났습니다.");
			}

		}

	}

	public void example3() {
		// String 배열에 저장된 각 요소들의 제일 앞글자만 출력하기

		String[] arr = new String[3];

		arr[0] = "아이스 아메리카노";
		arr[1] = "카페 라떼";

		for (int i = 0; i <= arr.length; i++) {
			try {
				System.out.println(arr[i].charAt(0));
			} catch (NullPointerException e) {
				System.out.println(i + "번째 인덱스에 참조할 값이 없습니다.");
			} catch (Exception e) {
				// Exception : 모든 예외의 최상위 부모
				System.out.println("무슨 예외인지는 모르겠지만 예외 발생");
			}

			// catch문을 여러번 작성할 경우
			// try 구문에서 발생한 예외를
			// 작성된 catch문 순서대로 비교를 진행함
			// --> 매개변수가 맞는 catch가 있다!
			// --> 해당 catch구문에서 예외 처리 진행

			// 발생되는 예외들도 결국에는 클래스이고 상속 구조를 가짐
			// --> 상속이되면? 다형성이 된다
			// --> 부모타입의 예외 참조변수 = 자식 예외객체 참조;

		}

	}

	public void example4() {

		// 메뉴 번호를 입력 받을 때 문자를 입력하는 경우 처리

		Scanner sc = new Scanner(System.in);
		int sel = 0;
		do {
			System.out.println("1. example1() 호출");
			System.out.println("2. example2() 호출");
			System.out.println("3. example3() 호출");
			System.out.println("0. 종료");
			System.out.print("메뉴 선택>>");

			try {
				sel = sc.nextInt(); // 예외 발생 지점
				// 예외처리 구문이 하는 제일 중요한 역할
				// -> 프로그램의 비정상 종료를 막는 것

				switch (sel) {
				case 1:
					example1();
					break;
				case 2:
					example2();
					break;
				case 3:
					example3();
					break;
				case 0:
					System.out.println("프로그램 종료");
					break;
				default:
					System.out.println("1, 2, 3, 0만 입력해 주세요.");
				}

			} catch (InputMismatchException e) {
				System.out.println("정수만 입력해 주세요.");
				sel = -1;
				sc.nextLine();
			}

		} while (sel != 0);

	}

	public void example5() throws Exception {
		// finally : try - catch 구문 수행 후 마지막으로 반드시 실행해야 하는 코드를 작성하는 구문
		// try 구문에서 예외 발생 여부와 상관 없이 무조건 마지막에 실행됨

		// 정수 2개를 입력 받아 나누어 몫을 출력하는 프로그램

		// 발생할 수 있는 예외 : 0으로 나눴을 때, 정수가 아닌 값을 입력했을 때

		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("입력1 : ");
			int num1 = sc.nextInt();

			System.out.print("입력2 : ");
			int num2 = sc.nextInt();

			System.out.println("결과 : " + num1 / num2);

			throw new Exception();

		} catch (InputMismatchException e) {
			System.out.println("정수만 입력해 주세요.");
			e.printStackTrace(); // 예외가 발생한 모든 자취와 줄번호를 출력

		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
			System.out.println(e.getMessage());
			e.printStackTrace();

		} /*
			 * catch (Exception e) { e.printStackTrace();
			 * 
			 * }
			 */
		finally {
			System.out.println("프로그램 종료");
		}

	}

	// ---------------------------------------------------------------------------------------------------------------

	/*
	 * throws : 예외 발생 시 발생한 예외를 직접 처리하지 않고 예외가 발생한 메소드를 호출한 부분으로 전달
	 * 
	 */

	public void example6() {
		System.out.println("6 호출됨.");

		try {
			example6_1();
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		} catch (NullPointerException e) {
			System.out.println("NullPointerException이 발생했습니다.");
		}
	}

	public void example6_1() throws ArithmeticException, NullPointerException {
		System.out.println("6_1 호출됨.");
		example6_2();
	}

	public void example6_2() throws ArithmeticException, NullPointerException {
		System.out.println("6_2 호출됨.");
		example6_3();
	}

	public void example6_3() throws ArithmeticException, NullPointerException {
		System.out.println("6_3 호출됨.");

		// int num = 2 / 0;
		// ArithmeticException : / by zero

		// 예외를 강제로 발생시켜 던지기
		throw new NullPointerException();
		// NullPointerException은 RuntimeException의 후손으로
		// UncheckedException  분류에 포함되어
		// 별도의 예외처리가 없어도 된다.
		
		//throw new InputZeroException();
		// InputZeroException 클래스 처럼
		// RuntimeException이 아닌 다른 예외 클래스를 상속한 클래스들은
		// 모두 CheckedException 분류에 포함되어
		// 반드시 예외처리가 필요하다.

	}

	public void example7() {
		// 사용자 정의 예외
		// 자바 API에서 제공하는 예외 클래스만으로 처리할 수 없는 예외가 있을 경우
		// 사용자의 필요에 따라 생성하는 예외 클래스

		try {
			System.out.println("프로그램 실행");

			sumMethod();

			System.out.println("프로그램 정상 종료");

		} catch (InputZeroException e) {
			System.out.println(e.getMessage());
			System.out.println("비정상 종료");
			// e.printStackTrace();
		}

	}

	public void sumMethod() throws InputZeroException {
		// sumMethod() 메소드는 기능 수행 중 InputZeroException이 발생할 가능성이 있다.

		// 숫자 3개를 입력받아 합을 출력하는 메소드
		// 단, 중간에 0을 입력하면 합이 출력되지 않고 비정상 종료
		Scanner sc = new Scanner(System.in);

		int num = 0;
		int sum = 0;

		for (int i = 1; i <= 3; ++i) {
			System.out.print("입력" + (i) + " : ");
			num = sc.nextInt();

			if (num == 0) {
				//throw new InputZeroException();
				throw new InputZeroException("0좀 입력하지 말라고!");
			}
			sum += num;

		}

		System.out.println("합계 : " + sum);

	}

	public void sumMethod2() {
		Scanner sc = new Scanner(System.in);

		int sum = 0;
		int i = 1;

		while (i <= 3) {
			System.out.print("입력" + i + " : ");
			int num = sc.nextInt();

			if (num == 0)
				break;
			else {
				sum += num;
				i++;
			}
		}

		if (i == 4)
			System.out.println("합계 : " + sum);
		else
			System.out.println("0을 입력하셨습니다.");

	}

}
