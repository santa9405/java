package com.kh.poly.ex1.model.vo;

public abstract class AllinOnePrinter implements Printer, Scanner{
	// implements : 구현하다
	// 부모 인터페이스 - 자식 클래스 상속 : implements
	// 인터페이스는 다중 상속 가능
	// * 추상 클래스가 인터페이스 상속 시
	//	  인터페이스의 추상 메소드를 오버라이딩 하지 않아도 에러 발생 없음
	//	 -> 왜? 추상 클래스도 내부적으로 추상 메소드를 포함할 수 있기 때문에
	
	// 복합기 (프린터 + 스캐너)
	
	// 추상 클래스
	// - 일반 멤버(변수 + 완성된 메소드) + 미완성 메소드가 포함된 클래스
	// - 미완성 상태이기 때문에 new를 이용한 객체 생성이 불가능함
	// -> 단, 부모타입 참조 변수로는 사용 가능함(다형성)
	
	// 일반 멤버 변수
	private String brand;
	private String name;

	// 생성자 : 반환형이 없고 클래스명과 같아야 함
	// 생성자는 필드 초기화의 목적을 가지고 있으며 생성자가 있어야 객체 생성이 가능함
	public AllinOnePrinter() {}
	
	public AllinOnePrinter(String brand, String name) {
		this.brand = brand;
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	// 미완성 메소드(abstract method)
	// -> 상속 관계에 있는 자식 메소드에서 오버라이딩을 강제화 함
	public abstract double maxPaperSize(); // 미완성 메소드가 포함된 클래스는 추상화 해줘야 함

}











