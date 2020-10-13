package com.kh.control.practice;

import java.util.Scanner;

public class ControlPractice {
	public void practice1() {
		/*
		 * 아래 예시와 같이 메뉴를 출력하고 메뉴 번호를 누르면 “OO메뉴입니다“를, 종료 번호를 누르면 “프로그램이 종료됩니다.”를 출력하세요.
		 * ex. 1. 입력 2. 수정 3. 조회 4. 삭제 7. 종료 메뉴 번호를 입력하세요 : 3 조회 메뉴입니다.
		 */
		Scanner sc = new Scanner(System.in);

		System.out.println("종료 메뉴 번호를 입력하세요 : ");
		int input = sc.nextInt();

		switch (input) {
		case 1:
			System.out.println("입력 메뉴입니다.");
			break;
		case 2:
			System.out.println("수정 메뉴입니다.");
			break;
		case 3:
			System.out.println("조회 메뉴입니다.");
			break;
		case 4:
			System.out.println("삭제 메뉴입니다.");
			break;
		case 7:
			System.out.println("종료 메뉴입니다.");
			break;
		}

	}

	public void practice2() {
		/*
		 * 키보드로 정수를 입력 받은 정수가 양수이면서 짝수일 때만 “짝수다”를 출력하고 짝수가 아니면 “홀수다“를 출력하세요. 양수가 아니면
		 * “양수만 입력해주세요.”를 출력하세요. ex. 숫자를 한 개 입력하세요 : -8 양수만 입력해주세요.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("숫자를 한 개 입력하세요 : ");
		int input = sc.nextInt();

		String result = null;

		if (input < 0) {
			result = "양수만 입력해주세요.";
		} else if (input > 0 && input % 2 == 0) {
			result = "짝수다.";
		} else {
			result = "홀수다";
		}
		System.out.println(result);

	}

	public void practice3() {
		/*
		 * 국어, 영어, 수학 세 과목의 점수를 키보드로 입력 받고 합계와 평균을 계산하고 합계와 평균을 이용하여 합격 / 불합격 처리하는 기능을
		 * 구현하세요. (합격 조건 : 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우) 합격 했을 경우 과목 별 점수와 합계,
		 * 평균, “축하합니다, 합격입니다!”를 출력하고 불합격인 경우에는 “불합격입니다.”를 출력하세요. [출력 예시는 다음 장에]
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("국어점수 : ");
		int input1 = sc.nextInt();

		System.out.println("영어점수 : ");
		int input2 = sc.nextInt();

		System.out.println("수학점수 : ");
		int input3 = sc.nextInt();

		int sum = input1 + input2 + input3;
		double evr = sum / 3;

		String result = null;

		if (input1 < 40 && input2 < 40 && input3 < 40) {
			result = "국어점수 : " + input1 + "\n수학점수 : " + input3 + "\n영어점수 : " + input2 + "\n불합격입니다.";
		} else if (evr >= 60) {
			result = "국어 : " + input1 + "\n수학 : " + input3 + "\n영어 : " + input2 + "\n합계 : " + sum + "\n평균 : " + evr
					+ "\n축하합니다, 합격입니다!";
		} else {
			result = "불합격입니다.";
		}

		System.out.println(result);
	}

	public void practice4() {
		/*
		 * 1~12 사이의 수를 입력 받아 봄, 여름, 가을, 겨울 계절을 출력하세요. 잘못 입력한 경우 “OO월은 잘못 입력된 달입니다.”를
		 * 출력하세요. (switch문 사용) ex 1. 1~12 사이의 정수 입력 : 8 8월은 여름입니다. ex 2. 1~12 사이의 정수 입력
		 * : 99 99월은 잘못 입력된 달입니다.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("1 ~ 12 사이의 정수 입력 : ");
		int input = sc.nextInt();

		switch (input) {
		case 12:
			System.out.println(input + "월은 겨울입니다.");
			break;
		case 1:
			System.out.println(input + "월은 겨울입니다.");
			break;
		case 2:
			System.out.println(input + "월은 겨울입니다.");
			break;
		case 3:
			System.out.println(input + "월은 봄입니다.");
			break;
		case 4:
			System.out.println(input + "월은 봄입니다.");
			break;
		case 5:
			System.out.println(input + "월은 봄입니다.");
			break;
		case 6:
			System.out.println(input + "월은 여름입니다.");
			break;
		case 7:
			System.out.println(input + "월은 여름입니다.");
			break;
		case 8:
			System.out.println(input + "월은 여름입니다.");
			break;
		case 9:
			System.out.println(input + "월은 가을입니다.");
			break;
		case 10:
			System.out.println(input + "월은 가을입니다.");
			break;
		case 11:
			System.out.println(input + "월은 가을입니다.");
			break;
		default:
			System.out.println(input + "은 잘못 입력된 달입니다.");
		}

	}

	public void practice5() {
		/*
		 * 아이디, 비밀번호를 정해두고 로그인 기능을 작성하세요. 로그인 성공 시 “로그인 성공”, 아이디가 틀렸을 시 “아이디가 틀렸습니다.“,
		 * 비밀번호가 틀렸을 시 “비밀번호가 틀렸습니다.”를 출력하세요. ex 1. ex 2. ex 3. 아이디 : myId 아이디 : myId
		 * 아이디 : my 비밀번호 : myPassword12 비밀번호 : myPassword 비밀번호 : myPassword12 로그인 성공
		 * 비밀번호가 틀렸습니다. 아이디가 틀렸습니다.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("아이디 : ");
		String id = sc.nextLine();

		System.out.println("비밀번호 : ");
		String pw = sc.nextLine();

		if (id.equals("myId") && pw.equals("myPassword12")) {
			System.out.println("로그인 성공");
		} else if (id.equals("myId") || pw == "myPassword12") {
			System.out.println("비밀번호가 틀렸습니다.");
		} else {
			System.out.println("아이디가 틀렸습니다.");
		}

	}

	public void practice6() {
		/*
		 * 사용자에게 관리자, 회원, 비회원 중 하나를 입력 받아 각 등급이 행할 수 있는 권한을 출력하세요. 단, 관리자는 회원관리, 게시글 관리,
		 * 게시글 작성, 게시글 조회, 댓글 작성이 가능하고 회원은 게시글 작성, 게시글 조회, 댓글 작성이 가능하고 비회원은 게시글 조회만
		 * 가능합니다. ex. 권한을 확인하고자 하는 회원 등급 : 관리자 회원관리, 게시글 관리 게시글 작성, 댓글 작성 게시글 조회
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("권한을 확인하고자 하는 회원 등급 : ");
		String grade = sc.nextLine();

		/*
		 * switch (grade) { case "관리자": System.out.print("회원관리, "); case "회원":
		 * System.out.print("게시글 관리, 게시글 작성, 댓글 작성, "); case "비회원":
		 * System.out.print("게시글 조회");
		 */

		String str = ""; // 빈문자열
		switch (grade) {
		case "관리자":
			str += "회원관리, ";
		case "회원":
			str += "게시글 관리, 게시글 작성, 댓글 작성, ";
		case "비회원":
			str += "게시글 조회";
		}
		System.out.println(grade);
	}

	public void practice7() {
		/*
		 * 키, 몸무게를 double로 입력 받고 BMI지수를 계산하여 계산 결과에 따라 저체중/정상체중/과체중/비만을 출력하세요. BMI = 몸무게
		 * / (키(m) * 키(m)) BMI가 18.5미만일 경우 저체중 / 18.5이상 23미만일 경우 정상체중 BMI가 23이상 25미만일 경우
		 * 과체중 / 25이상 30미만일 경우 비만 BMI가 30이상일 경우 고도 비만 ex. 키(m)를 입력해 주세요 : 1.65 몸무게(kg)를
		 * 입력해 주세요 : 58.4 BMI 지수 : 21.45087235996327 정상체중
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("키(m)를 입력해 주세요 : ");
		double hieght = sc.nextDouble();

		System.out.println("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();

		double bmi = weight / (hieght * hieght);

		System.out.println("BMI 지수 : " + bmi);

		String result = null;

		if (bmi < 18.50) {
			result = "저체중";
		} else if (bmi < 23) {
			result = "정상체중";
		} else if (bmi < 25) {
			result = "과체중";
		} else if (bmi < 30) {
			result = "비만";
		} else {
			result = "고도 비만";
		}

		System.out.println(result);

	}

	public void practice8() {
		/*
		 * 키보드로 두 개의 정수와 연산 기호를 입력 받아 연산 기호에 맞춰 연산 결과를 출력하세요. (단, 두 개의 정수 모두 양수일 때만 작동하며
		 * 없는 연산 기호를 입력 했을 시 “잘못 입력하셨습니다. 프로그램을 종료합니다.” 출력) ex. 피연산자1 입력 : 15 피연산자2 입력 :
		 * 4 연산자를 입력(+,-,*,/,%) : / 15 / 4 = 3.750000
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("피연산자1 입력 : ");
		int num1 = sc.nextInt();

		System.out.println("피연산자2 입력 : ");
		int num2 = sc.nextInt();

		if (num1 > 0 && num2 > 0) { // 둘 다 양수일 경우
			System.out.println("연산자를 입력(+,-,*,/,%) : ");
			char ch1 = sc.nextLine().charAt(0);

			double result = 0;

			switch (ch1) {
			case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case '*':
				result = num1 * num2;
				break;
			case '/':
				result = (double) num1 / num2;
				break; // 자동 형변환
			case '%':
				result = num1 % num2;
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다."); return;
			}
				System.out.println(num1 + " " + ch1 + " " + num2 + " = " + result);

		} else {
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
		}

		// sc.nextLine(); // 입력 버퍼에 남아있는 개행문자 제거

		/*
		 * switch (ch1) { case '+': result = num1 + num2; break; case '-': result = num1
		 * - num2; break; case '*': result = num1 * num2; break; case '/': result = num1
		 * / num2; break; case '%': result = num1 % num2; break; default:
		 * System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다."); }
		 */

	}

	public void practice9() {
		Scanner sc = new Scanner(System.in);

		System.out.println("중간 고사 점수 : ");
		int num1 = sc.nextInt();

		System.out.println("기말 고사 점수 : ");
		int num2 = sc.nextInt();

		System.out.println("과제 점수 : ");
		int num3 = sc.nextInt();

		System.out.println("출석 회수 : ");
		int num4 = sc.nextInt();

		System.out.println("=============== 결과 ===============");

		double test1 = num1 * 0.2;
		double test2 = num2 * 0.3;
		double hw = num3 * 0.3;
		double check = num4;
		double sum = test1 + test2 + hw + num4;

		String result = null;

		if (num4 > 14) { // (num4 > 20 * 0.7) 출석 70% 초과 시
			if (sum >= 70) {
				result = "PASS";
			} else {
				result = "Fail [점수 미달]";
			}
		} else {
			System.out.println("Fail [출석 횟수 미달 (" + num4 + " / 20)");
			return;
		}

		/* if (num4 > 20 * 0.7)
		   System.out.println("중간 고사 점수(20) : " + test1);
		   System.out.println("기말 고사 점수(30) : " + test2);
		   System.out.println("과제 점수           (30) : " + hw);
		   System.out.println("출석 점수           (20) : " + check);
		   
		   System.out.println("총점 : " + sum);
		   
		   if(sum >= 70) {
		   		System.out.printlnt("FAIL [점수 미달] (총점 " + sum +")");
		 } else {
		 		System.out.printlnt("FAIL [출석 횟수 부족] (" + num4 + " / 20)");
		 } */
		
		System.out.println("중간 고사 점수(20) : " + test1);
		System.out.println("기말 고사 점수(30) : " + test2);
		System.out.println("과제 점수           (30) : " + hw);
		System.out.println("출석 점수           (20) : " + check);
		System.out.println("총점 : " + sum);
		System.out.println(result);
	}

	public void practice10() {

		Scanner sc = new Scanner(System.in);

		System.out.println("실행할 기능을 선택하세요.\r\n" + "1. 메뉴 출력\r\n" + "2. 짝수/홀수\r\n" + "3. 합격/불합격\r\n" + "4. 계절\r\n"
				+ "5. 로그인\r\n" + "6. 권한 확인\r\n" + "7. BMI\r\n" + "8. 계산기\r\n" + "9. P/F\r\n");
		
		/* 		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. P/F");
		System.out.print("선택 : "); */
		
		System.out.print("선택 : ");
		int choice = sc.nextInt();

		switch (choice) {
		case 1 : practice1(); break;
		case 2 : practice2(); break;
		case 3 : practice3(); break;
		case 4 : practice4(); break;
		case 5 : practice5(); break;
		case 6 : practice6(); break;
		case 7 : practice7(); break;
		case 8 : practice8(); break;
		case 9 : practice9(); break;
		}

	}
}
