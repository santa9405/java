package com.kh.variable.service;

public class C_Casting {
	
	public void autoCasting() {
		/* 자동 형변환
		 * 서로 다른 자료형의 연산이 일어나는 경우
		 * 값의 범위가 작은 자료형을 큰 자료형으로
		 * 컴파일러가 자동적으로 변환해주는 것.
		 */
		
		int iNum = 12;
		double dNum = 3.3;
		double result = iNum + dNum;
		
		System.out.println("result :" + result);
		// iNum + dNum
		// 12 + 3.3
		// 12.0 + 3.3
		// = 15.3
		
		
		// int + long
		
		int iNum2 = 2147483647; // int 최대값
		long lNum2 = 10000000000l; // 100억
		long result2 = iNum2 + lNum2;
		
		System.out.println("result2 : " + result2);
		
		// long -> float
		long lNum3 = 100000000000l; // 1000억
		float fNum3 = lNum3;
		System.out.println("fNum3 : " + fNum3);
		
		
		// char -> int
		char ch4 = 'A'; // 'A' == 65
		int iNum4 = ch4;
		System.out.println("iNum4 : " + iNum4);
		
		// (참고) 특정 숫자가 유니코드 표에서 어떤 문자를 가리키고 있는가 확인
		char ch5 = 97;
		System.out.println("ch5 : " + ch5);
		
	}
	
		// 강제 형변환
		public void forcedCasting() {
			
			int iNum1 = 290;
			byte bNum1 = (byte)iNum1;
			//			강제 형변환 방법
			System.out.println("iNum1 : " + iNum1);
			System.out.println("bNum1 : " + bNum1);
			
			// int + double = int
			int iNum2 = 12;
			double dNum2 = 3.3;
			//int result2 = iNum2 + (int)dNum2;
			int result2 = (int)(iNum2 + dNum2);
			
			System.out.println("result2 : " + result2);
			
			// 실수형 -> 정수형 강제형변환 시 소수점 아래가 버림 처리됨.
			
			//(참고) 입력된 실수 중 정수, 소수 부분 따로 출력하기
			
			// 숫자 입력 : 12.3
			// 정수 : 12
			// 소수 : 0.3
			
			double dNum3 = 12.3;
			int result3 = (int)dNum3; // 정수만 저장됨.
			double result4 = dNum3 - result3; // 자동 형변환 후 소수 부분만 저장됨.
			
			System.out.println("숫자 : " + dNum3);
			System.out.println("정수 : " + result3);
			System.out.println("소수 : " + result4);
			
			// byte, short 자료형 연산 시 유의 사항
			byte num1 = 1; // 1,2는 int의 리터럴 표기법
			byte num2 = 2; // byte, short는 별도의 리터럴 표기법이 없음
							// byte, short 자료형 초기화 시에만
							// int 리터럴 표기법을 사용할 수 있음.(중요!)
			
			byte num3 = (byte)(num1 + num2);
			//				1(int) + 2(int) = 3(int)
			
			
		}
	
	
	
	
	
	
	
	
	
	

}
