package com.kh.control.practice;

import java.util.Scanner;

public class LoopPractice {

	public void practice1(){
		 /* 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
			 단, 입력한 수는 1보다 크거나 같아야 합니다.
			 만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
			 ex.
			 1이상의 숫자를 입력하세요 : 4
			 1 2 3 4 
			 1 이상의 숫자를 입력해주세요. 
		 	 1이상의 숫자를 입력하세요 : 0
			 */
		 
		Scanner sc = new Scanner(System.in);
		 
		System.out.println("1 이상의 숫자를 입력하세요 : ");
		int num1 = sc.nextInt();
		 
		if (num1 < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요");
		}
		
		for (int i = 1; i <= num1; i++) {
			System.out.print(i);
			
		}
		
		 
	 }

	public void practice2(){
		/* 1부터 사용자에게 입력 받은 수까지의 정수들의 합을 for문을 이용하여 출력하세요.
			ex.
			정수를 하나 입력하세요 : 8
			1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 = 36 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 하나 입력하세요 : ");
		int iNum = sc.nextInt();
		
		int sum = 0;
		
		for (int i=1; i<=iNum ; i++) {
			sum += i;
			System.out.print(i + " + " + sum );
		}
		
		
		
		
		
		
	}
}
