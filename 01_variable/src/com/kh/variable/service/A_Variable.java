package com.kh.variable.service;

public class A_Variable {
	
	// 변수를 사용하지 않는 경우
	public void noVariable() {
		System.out.println("----- 변수 사용X -----");
		System.out.println(2 * 3.141592653589793 * 5);
		System.out.println(3.141592653589793 * 5 * 5);
		System.out.println(3.141592635389793 * 5 * 5 * 20);
		System.out.println(4 * 3.141592653589793 * 5 * 5);
	}
	
	// 변수를 사용한 경우
	public void usingVariable() {
		double pi = 3.141592653589793; // 원주율
		int radius = 5; // 반지름
		int height = 20; // 높이
		
		System.out.println("----- 변수 사용O -----");
		System.out.println(2 * pi * radius); // 원의 둘레
		System.out.println(pi * radius * radius); // 원의 넓이
		System.out.println(pi * radius * radius * height); // 원기둥의 부피
		System.out.println(4 * pi * radius * radius); // 구의 겉넓이
		
		/* 변수 사용 시 장점
		 * 1. 값(data)에 의미를 부여할 수 있다.
		 * 2. 코드의 가독성과 의미파악이 좋아짐.
		 * 3. 변수에 저장되어 있는 값을 지속적으로 변화시킬 수 있음
		 *   -> 재사용성 및 유지보수 향상
		 */
	}

	// 변수 선언
	public void declareVariable() {

		// 1. 논리형
		boolean isTrue; // 1byte
		isTrue = true; // 값 대입
		// isTrue : 변수명
		// '=' : 대입 연산자, 오른쪽 data를 왼쪽 변수에 저장		
		//true : 리터럴
		
		
		
		
		
		// 2. 정수형
		byte bNum; // 1byte
		bNum = 100;
		
		short sNum; // 2byte
		sNum = 10000;
		
		// byte, short는 int형 리터럴 표기법을 사용함.
		// 왜? byte, short는 다른 프로그래밍 언어와의 호환을 위해
		//    필요한 자료형;
		// -> java만으로 코드 작성 시 사용할 일이 없는 자료형
		//	--> 별도의 리터럴 표기법이 존재하지 않음(그냥 int꺼 사용)
		
		
		int iNum; // 4byte, 정수 기본형
		iNum = 1000000000; // 10억
		iNum = 1_000_000_000; // _를 이용하여 자릿수 구분 가능
		
		
		
		long lNum; // 8byte
		lNum = 10000000000L; // 100억
		// (숫자뒤)L 또는 1 : long형 리터럴 표기법
		
		
		
		
		
		// 3. 실수형
		float fNum; // 4byte
		fNum = 3.141592f;
		// (실수)f 또는 F : float 리터럴 표기법
		
		double dNum; // 8byte, 실수 기본형
		dNum = 3.141592;
		
		
		// 4. 문자형
		char ch; // 2byte
		// 색깔은 예약어
		ch = 'A'; // 65와 같은 값
		// ch = 65; // 'A'와 같은 값
		// ch = '\u0041'; //'A'와 같은 값(16진수 유니코드 표기법)
		// char 리터럴 표기법 : ''
		
		// 5. 문자열(기본 자료형은 아님)
		String str; // 4byte
					// 참조형 (실제 데이터를 저장하지 않고,
					//		데이터가 저장된 주소를 저장함)
					// String은 클래스임
		str = "안녕하세요?";
		// String(문자열) 리터럴 표기법 : ""
		
		// 변수 선언과 동시에 초기화
		String start = "안녕하세요?";
		// 초기화 : 최초의 값을 대입한다
		
		// 변수 선언과 동시에 초기화
		int iNum2 = 200;
		// 초기화 : 최초의 값을 대입한다
		
		System.out.println("isTrue : " + isTrue);
		System.out.println("bNum : " + bNum);
		System.out.println("sNum : " + sNum);
		System.out.println("iNum : " + iNum);
		System.out.println("lNum : " + lNum);
		System.out.println("fNum : " + fNum);
		System.out.println("dNum : " + dNum);
		System.out.println("ch : " + ch);
		System.out.println("str : " + str);
		System.out.println("iNum2 : " + iNum2);
		
		int 정수;
		char 성;
		String 이름; // 자바는 한글로 코딩 가능
		
		
		//상수 선언 및 초기화
		
		System.out.println("----- 상수 -----");
		
		int age = 31;
		System.out.println("age : " + age); // age : 31
		
		age = 32;
		System.out.println("age : " + age); // age : 32
		
		// 상수 : 상수명은 모두 대문자. 연결된 단어는 '_'로 구분
		final int AGE = 31;
		System.out.println("AGE : " + AGE); // AGE : 31
		
		// AGE = 32; // 에러 발생! 상수는 초기화 후 값 변경이 불가능 함
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
