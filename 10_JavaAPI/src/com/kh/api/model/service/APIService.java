package com.kh.api.model.service;

import java.util.StringTokenizer;

import com.kh.api.model.vo.Book;

public class APIService {
	// API(Application Programming Interface)
	// - 응용 프로그램 또는 프로그래밍 언어가 제공하는 기능을
	// 사용할 수 있도록 하는 인터페이스

	public void example1() {
		// Object.toString()
		// - 상속받은 자식 클래스에서 오버라이딩 하여
		// 해당 클래스의 멤버 변수 정보를 출력하는 용도로 사용할 수 있도록
		// 자바에서 제공해주는 메소드

		Book book1 = new Book("응용SW기초기술활용", "교육부", 5000);
		Book book2 = new Book("응용SW기초기술활용", "교육부", 5000);
		Book book3 = new Book("응용SW기초기술활용", "노동부", 5000);

		/*
		 * 
		 * // print 관련 구문에서 참조변수명만 입력할 경우 .toString()이 컴파일 단계에서 추가됨
		 * System.out.println(book1.toString()); System.out.println(book1); //
		 * toString() 오버라이딩 전 // Object.toString() : 패키지를 포함한 클래스명 + @ + 해쉬코드 16진수
		 * 
		 * // equals 오버라이딩 확인 System.out.println("booK1과 booK2가 참조하는 객체의 필드 값이 같은가?" +
		 * book1.equals(book2));
		 * 
		 * System.out.println("booK1과 booK2가 참조하는 객체의 필드 값이 같은가?" +
		 * book1.equals(book3));
		 * 
		 */

		System.out.println();

		System.out.println("book1의 hashCode() : " + book1.hashCode());
		// 오버라이딩 전 hashCode() : 366712642
		System.out.println("book2의 hashCode() : " + book2.hashCode());
		System.out.println("book3의 hashCode() : " + book3.hashCode());

		// equals(), hashCode() 둘 중 하나라도 오버라이딩을 하는 경우
		// 나머지 하나도 반드시 오버라이딩을 진행 해야함
	}

	public void example2() {

		// String Class

		// 1. String Literal(스트링 리터럴)
		String str1 = "abc"; // Heap 영역에 abc 생성
		String str2 = "abc"; // Heap 영역에 생성됐던 abc 재사용 == str1 == str2 주소값이 같음
		String str3 = new String("abc");

		// str1, 2, 3 비교연산자를 이용하여 주소값 비교
		System.out.println("str1 == str2 : " + (str1 == str2)); // 0x20 == 0x20 -> true
		System.out.println("str1 == str3 : " + (str1 == str3)); // 0x20 == 0x300 -> false

		// System.identityHashCode()
		// -> 실제 객체의 시작주소를 이용하여 특정 값을 만들어 내는 메소드
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));

	}

	public void example3() {
		// String 객체의 불변성(immutable)
		// String 데이터는 한 번 생성되면 변하지 않는 성질을 띄고 있음

		// str1 생성 후 주소 값
		String str1 = "abc";
		System.out.println("str1 : " + str1);
		System.out.println("System.identityHashCode(st1) : " + System.identityHashCode(str1));

		// str1 변경 후 주소 값
		str1 += "def";
		System.out.println("str1 : " + str1);
		System.out.println("System.identityHashCode(st1) : " + System.identityHashCode(str1));

		// String 데이터는 한 번 생성되면 변하지 않으므로
		// 수정이 필요 할 경우 새로운 String 데이터가 생성된다
		// -> 잦은 String 데이터 수정이 발생하는 경우 메모리 낭비가 심해짐

		// StringBuffer(가변성)
		System.out.println();
		System.out.println("StringBuffer 활용");

		StringBuffer sb = new StringBuffer(); // 초기 용량 16할당
		System.out.println("sb 용량 : " + sb.capacity());
		System.out.println("추가 전 주소값 : " + System.identityHashCode(sb));

		// StringBuffer에 데이터 추가
		sb.append("1234567890123456");
		System.out.println("sb 용량 : " + sb.capacity());
		System.out.println("추가 후 주소값 : " + System.identityHashCode(sb));

		sb.append("H");
		System.out.println("sb 용량 : " + sb.capacity());
		System.out.println("H 추가 후 주소값 : " + System.identityHashCode(sb));
		// 용량만 늘었다 줄기 때문에 항상 같은 주소임

		System.out.println("저장 결과 출력 : " + sb);
		System.out.println("저장 결과 출력 : " + sb.toString());

		// String lastStr = sb;
		// String = StringBuffer
		String lastStr = sb.toString();

	}

	// 활용도 높음
	public void example4() {
		// String.split(구분자)
		// 문자열을 지정된 구분자를 기준으로 하여 분리한 후
		// String[]로 반환하는 메소드

		String str = "사과, 바나나, 딸기, 파인애플, 오렌지, 멜론, 자두";

		String[] arr = str.split(",");
		// split에 들어가는 구분자 패턴은 마음대로 지정 가능

		// 향상된 for문 (for each문)
		// - 용도 : 특정 배열의 처음부터 끝까지 반복 접근하는 용도
		for (String s : arr) {
			// arr 배열 요소를 순서대로 하나씩 꺼내서
			// s 변수에 저장

			System.out.print(s);
		}
		/*
		 * for(int i=0; i<arr.length; i++) { System.out.println(arr[i]); }
		 */

		// String.join("구분자", String배열)
		// - 배열 요소를 하나의 문자열로 만들어 주는 메소드
		// - 요소 사이를 구분한 구분자를 작성해야 함
		String str2 = String.join("-", arr);
		System.out.println(str2);
	}

	public void example5() {
		// StringTokenizer
		// - 생성될 때 전달받은 문자열을 특정 구분하여 토큰화 시킴
		// (토큰 : 구분되는 데이터)

		// StringTokenizer(String str)
		// - 전달받은 문자열 내에 \t(tab키), \n, \r(개행문자), 띄어쓰기
		// white space를 구분자로 하여 토큰화를 시킴
		String str1 = "아 배고프다. 오늘 점심 뭐먹을까요?";
		StringTokenizer st1 = new StringTokenizer(str1);

		while (st1.hasMoreTokens()) {
			// hasMoreTokens() : 남아있는 토큰이 있으면 true

			System.out.println(st1.nextToken());
			// nextToken() : 다음 토큰을 얻어옴
		}

		String str2 = "어제. 내드린, 문제 어렵죠? ㅋㅋㅋ/ㅈㅅ";
		StringTokenizer st2 = new StringTokenizer(str2, ",");
		// str2를 ","로 구분

		while (st2.hasMoreTokens()) {
			// hasMoreTokens() : 남아있는 토큰이 있으면 true

			System.out.println(st2.nextToken());
			// nextToken() : 다음 토큰을 얻어옴
		}

	}

	public void example6() {
		// Wrapper Class
		// Wrapper : 포장지
		// -> 기본자료형을 객체로 사용할 수 있도록 포장하는 클래스

		// 왜 사용하는가?
		// 1) 기본 자료형으로는 수행할 수 없는 기능을 사용하기 위해서
		// 기본 자료형의 데이터 최대/최소 값
		// - String데이터 <-> 기본 자료형으로 변환
		// ex) "1204" + 1 = "12041"
		// Integer.parseInt("1204") + 1 = 1205

		// 2) 어쩔 수 없이 기본자료형을 사용할 수 없는 경우
		// 기본자료형 -> 객체로 변환하기 위해서 사용
		// ex) Object obj = 1; // 원래는 안되지만 jdk1.5부터 가능
		// -> Auto Boxing / UnBoxing

		// 기본 자료형별 Wrapper Class
		/*
		 * boolean -> Boolean byte -> Byte short -> Short int -> Integer long -> Long
		 * float -> Float double -> Double char -> Character
		 */

		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);

		String str = "123";

		int iNum = Integer.parseInt(str) + 100;
		double dNume = Double.parseDouble("3.14");
		// Integer.parseInt(문자열) : 숫자로만 이루어진 문자열을 -> int형으로 변환
		// parsing(파싱) : 데이터의 형태를 변경

		System.out.println("iNum : " + iNum);
		System.out.println("dNume : " + dNume);

		// Boxing : 기본 자료형을 Wrapper Class 객체로 변경
		int num1 = 10;
		Integer it1 = new Integer(num1);

		System.out.println("it1 : " + it1);
		System.out.println(it1.MAX_VALUE);

		// Unboxing : Wrapper Class -> 기본 자료형
		int i1 = it1.intValue();
		int i2 = (int) it1; // 객체가 기본 자료형으로 형변환

		// Auto Boxing/UnBoxing
		Integer it3 = 100;
		// 객체참조형 (int)
		// 100 이라는 숫자가 컴파일 시 자동으로 Integer 객체로 포장됨
		// --> Auto Boxing

		Object it4 = 100;

		int i3 = it1;
		// int = Integer --> int
		// Auto Unboxing

	}

}
