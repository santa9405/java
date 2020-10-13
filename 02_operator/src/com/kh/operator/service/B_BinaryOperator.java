package com.kh.operator.service;

import java.util.Scanner;

public class B_BinaryOperator {

	
	public void arithmeticOp() {
		// arithmetic : 산수
		// 산술 연산자 : 
		// 기존 사칙연산(+ - * /)에 %(modulars, mod) 추가
		// % : 나눴을 때의 나머지
		
		// 두 정수를 입력받아 + - * / % 결과를 출력하기
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		
		System.out.println("두 번째 정수 : ");
		int num2 = sc.nextInt();
		
		System.out.println("num1 + num2 = " + (num1 + num2));
		System.out.println("num1 - num2 = " + (num1 - num2));
		System.out.println("num1 * num2 = " + (num1 * num2));
		System.out.println("num1 / num2 = " + (num1 / num2));
		System.out.println("num1 % num2 = " + (num1 % num2));	
	}
	
	public void comparisonOp() {
		// ComparisonOp : 비교
		
		// 비교 연산자(관계 연산자)
		// 두 피연산자를 비교하여 논리값 (true, false)을 반환하는 연산자
		
		// * 반환 : 결과를 돌려(전달)받음
		
		// a < b : a가 b 미만? / b가 a 초과?
		// a > b : a가 b 초과? / b가 a 미만?
		// a <= : a가 b 이하?
		// a >= : a가 b 이상?
		// a == b : a와 b가 같은가?
		// a != b : a와 b가 다른가?
		
		// tip. 복합 기호에서 '=' 표시는 무조건 오른쪽!
		
		int num1 = 10;
		int num2 = 25;
		int num3 = 25;
		
		boolean result1, result2;
		// 같은 자료형 변수 선언 시 한 줄로 연달아 선언 가능
		// --> 관례상 사용하지 않음
		// 한 줄에는 하나의 의미만을 갖도록 작성하는 것이 좋기 때문에
		
		result1 = num1 == num2; // == 우선순위가 높으므로 num1 == num2 결과를 result1 에 저장함. 결과는 false
		result2 = num2 != num3; // != 우선순위가 높으므로 num2 != num3 결과를 result2에 저장함. 결과는 false
		
		
		System.out.println("num1 > num2 : " + (num1 > num2));
		System.out.println("num1 < num2 : " + (num1 < num2));

		System.out.println("num2 >= num3 : " + (num2 >= num3));
		System.out.println("num2 <= num3 : " + (num2 <= num3));
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result1 == result2 : " + (result1 == result2));
		
		// %, == , != 이용하여 홀수, 짝수, 배수 판별
		num1 = 5;
		
		System.out.println("num1은 짝수인가? : " + (num1 % 2 == 0) );
		System.out.println("num1은 홀수인가? : " + (num1 % 2 == 1) );
		
		System.out.println("num1은 5의 배수인가? : " + (num1 % 5 == 0) );
		
	}
	
	public void logicalOp() {
		// 논리 연산자
		// - 논리값 두 개를 비교하는 연산자
		
		// && (AND) : 둘 다 true일 때만 true
		// -> 그리고, ~면서, ~이면서, ~부터, ~까지, ~사이
		
		// || (OR) : 둘 다 false일 때만 false
		// -> 또는, ~거나, ~이거나
		
		// 입력받은 정수가 1 ~ 100 사이 숫자인지 확인
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나 입력 : ");
		int input = sc.nextInt();
		
		boolean result = (input >= 1) && (input <= 100);
		System.out.println(input + "은/는 1~100 수 인가? : " + result);
		
	}
	
	public void logicalOp2() {
		// 입력받은 알파벳이 대문자(A~Z)인지 검사
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("알파벳 하나 입력 : ");
		char ch = sc.nextLine().charAt(0);
		
		// 'A' <= ch <= 'Z'
		boolean result = ('A' >= ch) && (ch <= 'Z');
		// char 자료형에 실제 저장되는 값은 정수이므로
		// 문자끼리의 범위 비교가 가능하다.
		
		System.out.println(ch + "은/는 대문자 인가? : " + result);
		
	}
	
	public void logicalOp3() {
		// 입력 받은 문자가 'Y' 인지 검사(대소문자 구분 X)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자 하나 입력 : ");
		char ch = sc.nextLine().charAt(0);
		
		// 입력받은 문자가 'Y' 이거나 'y'
		boolean result = (ch == 'Y') || (ch == 'y');
		
		System.out.println(ch + "은/는 'Y' 또는 'y' 인가? : " + result);
		
		
	}
	
	public void logicalOp4() {
		// 증감 + 산술 + 비교 + 논리
		
		int a = 2;
		int b = 3;
		
		boolean c = a > b; // false
		boolean d = ++a <= b++; // true 
					//3 <= 3
						// 4인 상태
		
		System.out.println("a : " +a); // 3
		System.out.println("b : " +b); // 4
		System.out.println("c : " +c); // false
		System.out.println("d : " +d); // true
		
		System.out.println();
		
		System.out.println("!c : " + !c); // true
		System.out.println("c != d : " + (c != d)); // true
		
		System.out.println();
		
		System.out.println("(a % b) == 1 : " + ((a % b) == 1)); // false
		System.out.println("(a == 3) && (b == 4) : " + ((a == 3) && (b == 4))); // true
		System.out.println("!d || (a-b) > 0 : " + (!d || (a-b) > 0)); // false 
													// false  || (3-4) > 0
	
		
		System.out.println();
		
		System.out.println("!(c == d) && ((a * b == 10) || ( b % 2 == 0)) : " + (!(c == d) && ((a * b == 10) || ( b % 2 == 0)))); 
																			//	t (f || t)
		
	}
	
	public void compoundAssignmentOp() {
		// 복합 대인 연산자
		// - 다른 연산자와 대입 연산자를 함께 사용하는 연산자
		// - 자기 자신과 연산 후
		//	  결과를 다시 자기 자신에 대입
		
		// * 복합 대입 연산은 연산 처리속도가 훨씬 빠르므로 사용 권장
		
		int num = 12;
		
		// 3증가
		// num = num + 3;
		num += 3;
		System.out.println("3증가 : " + num); // 15
		// 5감소
		num -= 5;
		System.out.println("5감소 : " + num);	// 10
		// 6배 증가
		num *= 6;
		System.out.println("6배증가 : " + num); // 60
		// 1/2배 감소
		num /= 2;
		System.out.println("1/2배 감소 : " + num);	// 30
		// 4로 나눴을 때 나머지
		num %= 4;
		System.out.println("4로 나눴을 때 나머지 : " + num); // 2
		
	}
	
	
	
	
	
	
	
}
