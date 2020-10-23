package com.kh.inherit.model.service;

import com.kh.inherit.model.service2.RectangleCalculator;

public class CalculatorService extends Object {
							//  -> 생략 될 경우 컴파일러가 Object 상속 구문을 자동 추가
	
	public void example() {
		
		// Calculator 클래스와 같은 패키지
		Calculator cal = new Calculator();
		
		//System.out.println(cal.MIN_INT); // (default) 같은 패키지 이므로 직접 접근 가능
		//System.out.println(cal.MAX_INT); // protected 같은 패키지 이므로 직접 접근 가능
		
		//cal.setSaveNum1(100);
		//cal.setSaveNum2(3.12345);
		
		//System.out.println(cal.toString());
		
		
		//RectangleCalculator rc = new RectangleCalculator(3.14, 2.51, 99.99, 123456);
		
		//System.out.println(rc.toString());
		
		//System.out.println(rc);
		// print 관련 구문내에서 참조 변수명을 작성한 경우
		// 참조 중인 객체의 toString()을 호출 할 수 있도록
		// 컴파일러가 .toString()을 자동으로 추가해줌
		
		
	}

}
