package com.kh.poly.model.vo;

import com.kh.poly.ex1.model.vo.AllinOnePrinter;
import com.kh.poly.ex1.model.vo.Fax;

public class SamsungAP extends AllinOnePrinter implements Fax {
	// 클래스 상속과 인터페이스 상속을 동시에 할 수 있다

	public SamsungAP() {
	}

	public SamsungAP(String brand, String name) {
		super(brand, name);
	}

	// AllinOnePrinter 클래스에서 상속받은 미완성 메소드를
	// 강제적으로 오버라이딩함
	@Override
	public double maxPaperSize() {
		return 210.0;
	}

	// 스마트폰 연결
	public void connectPhone() {
		System.out.println("스마트폰과 연동하여 사진 출력 가능");
	}

	@Override
	public void print() {
		System.out.println("음성인식");
	}

	@Override
	public void powerOn() {
		System.out.println("음성인식");
	}

	@Override
	public void powerOff() {
		System.out.println("음성인식");
	}

	@Override
	public void scan() {
		System.out.println("선명하고 깔끔하게 스캔");
	}

	@Override
	public void sendFax() {
		System.out.println("번호 누르고 전송");
	}

	@Override
	public void receiveFax() {
		System.out.println("언제든지 수신가능");
	}

}
