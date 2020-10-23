package com.kh.poly.model.service;

import com.kh.poly.model.vo.Animal;
import com.kh.poly.model.vo.Fish;
import com.kh.poly.model.vo.Person;
import com.kh.poly.model.vo.Snake;

public class PolyService {
	public void example1() {
		// * x 50
		// 다형성
		// - 상속을 이용한 기술로 부모 타입 참조변수 하나로
		//   상속 관계에 있는 여러 타입의 자식 객체를 참조할 수 있는 기술
		
		// 부모 참조 = 부모 객체
		Animal a = new Animal();
		
		// 자식 참조 = 자식 객체
		Person p = new Person(); // Animal 객체가 내부에 포함되어 있음
		Fish f = new Fish(); // Animal 객체가 내부에 포함되어 있음
		Snake s = new Snake(); // Animal 객체가 내부에 포함되어 있음
		
		// 기존에 알고있던 정상 적인 객체 참조 방법
		// Person person = new Person();
		
		// 업캐스팅 : 참조변수의 타입이 부모 타입으로 변경되는 것
		// -> 부모타입의 참조변수로 자식 객체를 참조하는 것
		Animal person = new Person();
		
		// person.studyJava(); // 자식 객체의 고유 기능을 참조할 수 없음
		a.eat();
		person.eat();
		// 프로그램 실행 전(컴파일 단계까지) person(Animal)
		// person이(Anilam)이 참조하고 있는 객체는
		// person객체 내부에 존재하는 Animal 객체의 eat()를 호출함.
		// --> 정적 바인딩
		
		// 프로그램 실행 중
		// person(Animal) 이 참조하고 있는 객체의 eat()를 호출하면
		// 내부에 존재하는 Animal 객체의 eat()가 아닌
		// 오버라이딩 된 Person의 eat()를 호출함
		// --> 동적 바인딩
		
		Animal[] arr = new Animal[4];
		
		arr[0] = new Animal();
		arr[1] = new Person();
		arr[2] = new Fish();
		arr[3] = new Snake();
		
		for(int i=0; i<arr.length; i++) {
			arr[i].breath();
			// arr의 0, 1, 2번 인덱스 요소가 참조하고 있는
			// 자식 객체들이 부모인 Animal로 부터 상속받은
			// breath() 메소드를 오버라이딩 하였기 때문에
			// 컴파일 전에는 부모의 breath()로 바인딩 되어 있다가(정적 바인딩)
			// 실행 중에는 각자 오버라이딩 된 breath()가 실행됨(동적 바인딩)
		}
		
		
		// 부모 참조변수로 자식만의 메소드 호출
		
		// Person 객체 참조 중인 참조변수
		//arr[1].studyJava();
		// 부모 타입 참조변수로는 자식 내 부모 부분만 참조 가능
		
		// 다운 캐스팅
		// 부모 참조 변수 = 자식 객체
		// --> 자식 참조 변수 = 자식 객체
		// 참조변수가 부모->자식으로 변함으로써
		// 자식 객체를 온전히 참조할 수 있게됨
		
		// (Person)arr[1].studyJava(); // X
		// -> (자료형), . 두 연산 중 .(점 연산자)가 우선순위가 높음
		
		System.out.println("\n============ 다운 캐스팅 ============");
		((Person)arr[1]).studyJava();
		((Fish)arr[2]).swim();
		((Snake)arr[3]).lock();
		
		System.out.println("\n ==== instanceof ==== ");
		for(int i=0; i<arr.length; i++) {
			// instanceof 연산자
			// - 참조 변수가 특정 자료형 객체를 참조하고 있는지 확인하는 연산자
			// 1) 참조 변수가 참조하고 있는 객체에 특정 자료형 객체가 존재 하는가?
			// 2) 참조 변수가 특정 자료형으로 형변환을 할 수 있는가?
			
			if(arr[i] instanceof Person) { // arr[i]이  객체가 Person 으로 형변환 될 수 있는지?
				((Person)arr[i]).studyJava();
			}else if(arr[i] instanceof Fish) {
				((Fish)arr[i]).swim();
			}else if(arr[i] instanceof Snake) {
				((Snake)arr[i]).lock();
			}else {
				System.out.println("그냥 Animal 객체입니다.");
			}
	

		}
		
		
	}
	
	
	
	
	
	
	
}
