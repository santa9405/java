package com.kh.operator.service;

public class A_SingleOperater {

	public void logicalNegationOp() {
		// 논리 부정 연산자 : !
		// 논리값(true / false)를 반대로 바꿔주는 연산자

		boolean isTrue = true;

		System.out.println("isTrue : " + isTrue); // true
		System.out.println("!isTrue : " + !isTrue); // false
	}

	public void increaseOp() {
		// 증가 연산자 : ++
		// 피연산자를 1씩 증가 시키는 연산자
		// -> 피연산자 : 연산을 당하는 수 또는 변수

		// ++(피연산자) : 전위 증가 연산자
		// 1) 먼저 피연산자를 증가 시킨 후
		// 2) 다음 연산을 진행

		// (피연산자)++ : 후위 증가 연산자
		// 1) 다른 연산을 진행 후
		// 2) 피연산자를 증가시킴

		int num1 = 10;

		// 전위 증가 연산자 테스트
		System.out.println("----- 전위 증가 연산자 -----");
		System.out.println("초기값 : " + num1); // 10
		System.out.println("++num1 1회 수행 : " + ++num1); // 11
		System.out.println("++num1 2회 수행 : " + ++num1); // 12
		System.out.println("++num1 3회 수행 : " + ++num1); // 13
		System.out.println("++num1 4회 수행 : " + ++num1); // 14
		System.out.println("++num1 5회 수행 : " + ++num1); // 15
		System.out.println("최종값 : " + num1);

		int num2 = 10;

		// 후위 증가 연산자 테스트
		System.out.println("----- 전위 증가 연산자 -----");
		System.out.println("초기값 : " + num2); // 10
		System.out.println("num1++ 1회 수행 : " + num2++); // 10
		System.out.println("num1++ 2회 수행 : " + num2++); // 11
		System.out.println("num1++ 3회 수행 : " + num2++); // 12
		System.out.println("num1++ 4회 수행 : " + num2++); // 13
		System.out.println("num1++ 5회 수행 : " + num2++); // 14
		System.out.println("최종값 : " + num2); // 15
	}
		public void practice1() {
			int num = 20;
			
			int result = num++ * 3 + ++num;
					// num++ * 3
					//    20 * 3 == 60, num = 21
					//    60 + ++num
					//    60 + 22 == 82
			
			System.out.println("result : " + result); // 82
			System.out.println("num : " + num); // 22
			
		}
	
		public void practice2() {
			// 문제 : 최종적으로 a, b, c 변수에 저장된 값과
			// 		result1, result2, result3 에 저장된 값 예측하기
			
			int a = 10;
			int b = 20;
			int c = 30;
			
			int result1 = a++; // 10
			//			11인 상태
			
			int result2 = ++a + b++; // 12 + 20 = 32
			//            1+11   21인 상태
			
			int result3 = a++ + --b + --c; // 12 + 20 + 29 = 61
			//			13인 상태 + 20 + 29
			
			System.out.println(result1);
			System.out.println(result2);
			System.out.println(result3);
			
		}
		
		
		
		
		
		
		
		
}
