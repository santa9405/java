package com.kh.oop.ch4_field.run;

import com.kh.oop.ch4_field.model.service.FieldService;

public class FieldRun {
	public static void main(String[] args) {
		
		FieldService fs = new FieldService();
		fs.num1 = 10; // 멤버 변수
		
		fs.num2 = 20; // static 변수를 사용하는 옳은 방법이 아님
		//System.out.println("fs.num2 : " + fs.num2);
		
		FieldService.num2 = 30; // static 변수를 사용하는 옳은 방법
		// 클래스명.static변수명
		//System.out.println("FieldService.num2 : " + FieldService.num2); // 30
		
		//System.out.println("fs.num2 : " + fs.num2); // 30
		
		FieldService fs2 = new FieldService();
		//System.out.println("fs2.num2 : " + fs2.num2); // 30
		
		
	}

}
