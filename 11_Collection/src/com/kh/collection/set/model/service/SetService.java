package com.kh.collection.set.model.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import com.kh.collection.list.model.vo.Book;
import com.kh.collection.set.model.vo.Student;

public class SetService {

	// Set(집합)
	// - 데이터의 순서가 존재하지 않음
	// - 중복값을 허용하지 않음(null도 한번만 저장할 수 있음)

	public void example1() {
		// HashSet
		// - 저장되는 객체를 hashCode()를 이용하여 동일 여부를 판단
		// -> 동일한 객체가 저장될 경우 중복 제거를 진행

		Set<String> set = new HashSet<String>();

		set.add("안녕하세요");
		set.add("안녕");
		set.add("반갑습니다");
		set.add("공부하세요!");
		// 순서 유지 X
		System.out.println(set.toString());

		// 중복 데이터 X -> 중복 제거
		set.add("안녕");
		set.add(null);
		set.add(null);
		set.add(null);
		System.out.println(set.toString());

	}

	public void example2() {
		// HashSet, Student 사용
		// Student로 타입이 제한된 Set 객체를 참조하는 참조변수 set

		// Set<Student> set = new HashSet<>(); // 타입 추론

		Set<Student> set = new LinkedHashSet<>(); // 타입 추론
		// LinkedHashSet : 순서를 유지하는 Set

		// 참조변수에 선언된 제네릭을 통해 생성되는 객체의 제네릭을 추론함

		// 순서 유지 X
		set.add(new Student("유현재", 27, 100));
		set.add(new Student("강수정", 27, 200));
		set.add(new Student("이한솔", 27, 300));

		// 중복 삽입 X
		set.add(new Student("유현재", 27, 100));
		System.out.println(set);
		// 중복 제거를 위해서는 Student에 equals(), hashCode()가 오버라이딩 되어있어야 함!!

		/*
		 * hastCode - 객체에 대한 서명 또는 checksum(중복 검사) -> 객체를 서로 구분하는 용도의 정수
		 */

		// size()
		System.out.println("set 크기 : " + set.size());

		// remove(Student std)
		System.out.println("삭제 성공 : " + set.remove(new Student("이한솔", 27, 300))); // true가 출력됨
		System.out.println(set);

		// Set은 순서가 없기 때문에 원하는 데이터만을 꺼내 보는 것이 불가능
		// -> 내부에 있는 모든 데이터를 무작위로 다 꺼내는 것은 가능

		// 1. Set -> List로 변환
		List<Student> list = new ArrayList<Student>(set);
		System.out.println("Set -> List로 변환");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		// 2. Iterator 반복자를 이용한 출력
		// 단점 : Iterator는 한 방향으로만 접근이 가능(단방향)
		// -> ListIterator(양방향)

		System.out.println("Iterator 반복자");
		Iterator<Student> it = set.iterator();

		while (it.hasNext()) {
			// hasNext() : 다음 반복 접근할 객체가 있을 경우 true

			System.out.println(it.next());
			// next() : 다음 객체를 얻어옴
		}

		// 3. 향상된 for문
		// 배열 또는 컬렉션 요소에 반복 접근하는 용도
		System.out.println("향상된 for문");
		for (Student std : set) {
			System.out.println(std);
		}

	}

	public void example3() {
		// TreeSet
		// - 검색 기능이 강화된 Set으로
		// 계층구조를 활용한 이진트리 자료구조 형태의 Set
		// - 기본적인 Set의 특징(순서X, 중복X) + 정렬

		Set<Integer> treeSet = new TreeSet<Integer>();

		treeSet.add(5);
		treeSet.add(7);
		treeSet.add(3);
		treeSet.add(6);
		treeSet.add(2);

		System.out.println(treeSet);
	}

	public void example4() {
		// 로또 번호 생성기
		Set<Integer> lotto = new TreeSet<Integer>();

		while (lotto.size() < 7) {
			int random = (int) (Math.random() * 45 + 1);

			lotto.add(random);
		}

		System.out.println(lotto);

	}

	public void example5() {
		Set<Student> set = new TreeSet<Student>();

		set.add(new Student("이준호", 29, 80));
		set.add(new Student("김영주", 28, 90));
		set.add(new Student("김정화", 25, 85));
		set.add(new Student("고보석", 26, 100));
		set.add(new Student("박희도", 32, 95));

		for (Student std : set) {
			System.out.println(std);
		}

	}

	public void example6() {
		// 숫자 7개를 입력받아
		// 생성된 로또 번호와 몇개가 일치하는지 출력

		Scanner sc = new Scanner(System.in);

		// List<Integer> list = new ArrayList<Integer>();

		int lottoNumber[] = new int[7];
		System.out.print("숫자 7개 입력 : ");
		for (int i = 0; i <= lottoNumber.length - 1; i++) {
			int input = sc.nextInt();
			lottoNumber[i] = input;
		}

		Set<Integer> lotto = new TreeSet<Integer>();

		while (lotto.size() < 7) {
			int random = (int) (Math.random() * 45 + 1);

			lotto.add(random);

		}

		System.out.println("생성된 로또 번호 : " + lotto);

		List<Integer> list = new ArrayList<Integer>(lotto);

		String same = "";
		int count = 0;
		// 향상된 for문
		for (Integer num1 : list) {
			for (Integer num2 : lottoNumber) {
				if (num1 == num2) {
					same += num1 + " ";
					count++;
					break;
				}
			}
		}
		System.out.println("일치하는 번호 : " + same);
		System.out.println("count : " + count);
	}

	/* public void example6_0() {
		// 숫자 7개를 입력받아
		// 생성된 로또 번호화 몇개가 일치하는지 출력
		
		// 1. 입력
		Scanner sc = new Scanner(System.in);
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0 ; i<7 ; i++) {
			System.out.print(i + 1 + "번째 입력 : ");
			list.add(sc.nextInt());
		}
		
		// 2. 로또 생성
		Set<Integer> lotto = new TreeSet<Integer>();
		
		while(lotto.size() < 7) {
			int random = (int)(Math.random() * 45 + 1);
			lotto.add(random);
		}
		
		System.out.print("생성된 로또 번호 : ");
		for(int num : lotto) {
			System.out.print(num + " ");
		}
		
		// 3. 일치하는 번호 카운트
		int count = 0;
		for(int num : lotto) {
			
			
			for(int input : list) {
				if(input == num) {
					count++;
					break;
				}
			}
		}
		
		System.out.println("\ncount : " + count);
	}
	
	
	// 숫자 7개를 입력받아
	// 생성된 로또 번호화 몇개가 일치하는지 출력
	public void example6_1() {
		
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> inputSet = new HashSet<Integer>(); // 입력용 Set
		Set<Integer> lotto = new TreeSet<Integer>(); // 로또용 Set
		List<Integer> sameNum = new ArrayList<>(); // 일치 번호 저장용 List
		
		// 1. 번호 입력
		System.out.print("숫자 7개 입력 : ");
		
		while(inputSet.size() < 7) {
			inputSet.add(sc.nextInt());
		}
		
		// 2. 로또 생성 + 3. 일치하는 번호 카운트 + 일치 번호 저장
		int count = 0;
		
		while(lotto.size() < 7) {
			int random = (int)(Math.random() * 45 + 1);
			
			if(lotto.add(random)) { // set에 정상 추가될 경우 true
				for(int input : inputSet) {
					if(input == random) {
						sameNum.add(input);
						count++;
						break;
					}
				}
			}
		}
		
		System.out.print("생성된 로또 번호 : ");
		for(int num : lotto) 	System.out.print(num + " ");
		
		System.out.print("\n일치하는 번호 : ");
		for(int num : sameNum) 	System.out.print(num + " ");
		
		System.out.println("\ncount : " + count);
	}	
	
	
	
	// 숫자 7개를 입력받아
	// 생성된 로또 번호화 몇개가 일치하는지 출력
	public void example6_2() {
		
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> inputSet = new HashSet<Integer>(); // 입력용 Set
		Set<Integer> lotto = new TreeSet<Integer>(); // 로또용 Set
		List<Integer> sameNum = new ArrayList<>(); // 일치 번호 저장용 List
		
		// 1. 번호 입력
		int index = 1;
		while(inputSet.size() < 7) {
			System.out.print(index + "번째  입력 : ");
			if( !inputSet.add(sc.nextInt()) ){
				System.out.print("[중복]");
			}else {
				index++;
			}
		}
		
		// 2. 로또 생성 + 3. 일치하는 번호 카운트 + 일치 번호 저장
		int count = 0;
		
		while(lotto.size() < 7) {
			int random = (int)(Math.random() * 45 + 1);
			
			if(lotto.add(random)) {
				for(int input : inputSet) {
					if(input == random) {
						sameNum.add(input);
						count++;
						break;
					}
				}
			}
		}
		
		System.out.print("생성된 로또 번호 : ");
		for(int num : lotto) 	System.out.print(num + " ");
		
		System.out.print("\n일치하는 번호 : ");
		for(int num : sameNum) 	System.out.print(num + " ");
		
		System.out.println("\ncount : " + count);
	}	*/

}

// Collection<<interface>> == list와 set의 특성만을 뽑아 놓은 것
// Collection