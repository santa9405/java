package com.kh.operator.practice;

import java.util.Scanner;

public class OperatorPractice {
	public void practice1() {
		/* 키보드로 입력 받은 하나의 정수가 양수이면 “양수다“, 양수가 아니면 “양수가 아니다“를 출력하세요.
		ex.
		정수 : -9
		양수가 아니다*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int input = sc.nextInt();
		
		String result1 = (input > 0) ? "양수다" : "양수가 아니다";
		
		System.out.println(result1);
		
	}
	
	public void practice2() {
		/* 키보드로 입력 받은 하나의 정수가 양수이면 “양수다“,
		양수가 아닌 경우 중에서 0이면 “0이다“, 0이 아니면 “음수다”를 출력하세요.
		ex.
		정수 : -9
		음수다*/
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력 : ");
		int input = sc.nextInt();
		
		String result2 = (input > 0) ? "양수다" : (input == 0) ? "0이다" : "음수다";
		System.out.println(result2);
		
		
		
	}

	public void practice3() {
		/* 키보드로 입력 받은 하나의 정수가 짝수이면 “짝수다“, 짝수가 아니면 “홀수다“를 출력하세요.
		ex.
		정수 : 5
		홀수다*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력 : ");
		int input = sc.nextInt();
		
		String result3 = (input % 2 == 0) ? "짝수다" : "홀수다";
		System.out.println(result3);
		
		
	}
	public void practice4() {
	/* 모든 사람이 사탕을 골고루 나눠가지려고 한다. 인원 수와 사탕 개수를 키보드로 입력 받고
		1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하세요.
		ex.
		인원 수 : 29
		사탕 개수 : 100
		1인당 사탕 개수 : 3
		남는 사탕 개수 : 13*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("인원 수 : ");
		int input = sc.nextInt(); // 29
		
		System.out.println("사탕 개수 : ");
		int input2 = sc.nextInt(); // 100
		
		int result4 = input2 / input; // 100 / 29
		int result5 = input2 % input;
		
		System.out.println("1인당 사탕 개수 : " + result4);
		System.out.println("남는 사탕 개수 : " + result5);
	}
	public void practice5() {
	/* 키보드로 입력 받은 값들을 변수에 기록하고 저장된 변수 값을 화면에 출력하여 확인하세요.
		이 때 성별이 ‘M’이면 남학생, ‘M’이 아니면 여학생으로 출력 처리 하세요.
		ex.
		이름 : 홍길동
		학년(숫자만) : 3
		반(숫자만) : 4
		번호(숫자만) : 15
		성별(M/F) : M
		성적(소수점 아래 둘째 자리까지) : 85.75
		3학년 4반 15번 홍길동 남학생의 성적은 85.75이다.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름 : ");
		String name = sc.nextLine();
		
		System.out.println("학년(숫자만) : ");
		int a = sc.nextInt();
		System.out.println("반(숫자만) : ");
		int b = sc.nextInt();
		System.out.println("번호(숫자만) : ");
		int c = sc.nextInt();
		sc.nextLine();
		System.out.println("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		System.out.println("성적(소수점 아래 둘째 자리까지) : ");
		double db = sc.nextDouble();
		
		String result6 = (gender == 'M') ? "남학생" : "여학생";
		
		System.out.println(a + "학년 " + b + "반 " + c + "번 " + name + " " + result6 + "의 성적은 " + db + "이다." );
		
	}
	
	public void practice6() {
		/* 나이를 키보드로 입력 받아 어린이(13세 이하)인지, 청소년(13세 초과 ~ 19세 이하)인지,
		성인(19세 초과)인지 출력하세요.
		ex.
		나이 : 19
		청소년*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이 : ");
		int iNum1 = sc.nextInt();
		
		String result7 = (iNum1 <= 13 ) ? "어린이" : ((iNum1 > 13 && iNum1 <= 19) ? "청소년" : "성인");
		
		System.out.println(result7);
		
	}

	public void practice7() {
	/* 국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력 받고,
		세 과목에 대한 합계(국어+영어+수학)와 평균(합계/3.0)을 구하세요.
		세 과목의 점수와 평균을 가지고 합격 여부를 처리하는데
		세 과목 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격, 아니라면 불합격을 출력하세요.
		ex.
		국어 : 60
		영어 : 80
		수학 : 40
		합계 : 180
		평균 : 60.0
		합격*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어 : ");
		int iNum1 = sc.nextInt();
		System.out.println("영어 : ");
		int iNum2 = sc.nextInt();
		System.out.println("국어 : ");
		int iNum3 = sc.nextInt();
		
		int result8 = iNum1 + iNum2 + iNum3;
		double result9 = result8/3;
		
		System.out.println(result8);
		System.out.println(result9);
		
		String result10 = (iNum1 >= 40) && (iNum2 >= 40) && (iNum3 >= 40) && (result9 >= 60) ? "합격" : "불합격" ;
		
		System.out.println(result10);
	}
	
	public void practice8() {
		/* 주민번호를 이용하여 남자인지 여자인지 구분하여 출력하세요. (charAt() 활용)
		ex.
		주민번호를 입력하세요(- 포함) : 132456-2123456
		여자 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주민번호를 입력하세요(- 포함)");
		char ch1 = sc.nextLine().charAt(7);
		
		String result11 = (ch1 == '2' || ch1 == '4') ? "여자" : "남자";
		
		System.out.println(result11);
		
		
	}
	
	public void practice9() {
	/* 키보드로 정수 두 개를 입력 받아 각각 변수(num1, num2)에 저장하세요.
		그리고 또 다른 정수를 입력 받아 그 수가 num1 이하거나 num2 초과이면 true를 출력하고
		아니면 false를 출력하세요.
		(단, num1은 num2보다 작아야 함)
		ex.
		정수1 : 4
		정수2 : 11
		입력 : 13
		true */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수1을 입력하세요 : ");
		int num1 = sc.nextInt();
		
		System.out.println("정수2을 입력하세요 : ");
		int num2 = sc.nextInt();
		
		System.out.println("정수3을 입력하세요 : ");
		int num3 = sc.nextInt();
		
		String result = (num3 <= num1 || num3 >= num2) ? "true" : "false";
		
		System.out.println(result);
	}
	
	public void practice10() {
		/* 3개의 수를 키보드로 입력 받아 입력 받은 수가 모두 같으면 true, 아니면 false를 출력하세요.
		ex.
		입력1 : 5
		입력2 : -8
		입력3 : 5
		false */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요 : ");
		int num1 = sc.nextInt();
		
		System.out.println("숫자를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		System.out.println("숫자를 입력하세요 : ");
		int num3 = sc.nextInt();
		
		String result = (num1 == num2 && num2 == num3) ? "true" : "false";
		System.out.println(result);
	}
	public void practice11() {
		
		/* A, B, C 사원의 연봉을 입력 받고 각 사원의 연봉과 인센티브를 포함한 연봉을 계산하여 출력하고
		인센티브 포함 급여가 3000만원 이상이면 “3000 이상”, 미만이면 “3000 미만”을 출력하세요.
		(A 사원의 인센티브는 0.4, B 사원의 인센티브는 없으며, C 사원의 인센티브는 0.15)
		ex.
		A사원의 연봉 : 2500
		B사원의 연봉 : 2900
		C사원의 연봉 : 2600
		A사원 연봉/연봉+a : 2500/3500.0
		3000 이상
		B사원 연봉/연봉+a : 2900/2900.0
		3000 미만
		C사원 연봉/연봉+a : 2600/2989.9999999999995
		3000 미만*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("A사원의 연봉 : ");
		int money1 = sc.nextInt();
		
		System.out.println("B사원의 연봉 : ");
		int money2 = sc.nextInt();
		
		System.out.println("C사원의 연봉 : ");
		int money3 = sc.nextInt();
		
		double in1 = (money1 + money1 * 0.4);
		double in2 = money2;
		double in3 = (money3 + money3 * 0.15);
		
		String result1 = (in1 >= 3000) ? "3000 이상" : "3000 미만";
		String result2 = (in2 >= 3000) ? "3000 이상" : "3000 미만";
		String result3 = (in3 >= 3000) ? "3000 이상" : "3000 미만";
		
		System.out.println("A사원 연봉/연봉+a : " + money1 + "/" + result1);
		System.out.println("B사원 연봉/연봉+a : " + money2 + "/" + result2);
		System.out.println("C사원 연봉/연봉+a : " + money3 + "/" + result3);
		
		
		
		
		
		
		
	
	}
}
