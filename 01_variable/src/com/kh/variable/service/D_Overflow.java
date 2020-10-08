package com.kh.variable.service;

public class D_Overflow {
	
	public void overflowEx1() {
		// 오버플로우 : 데이터 연산 처리 시 자료형의 값의 범위를 초과하는 경우
		//			발생하는 현상. (초기화는 제외)
		//			최대값 초과 시 -> 최소값으로 감
		//			최소값 초과 시 -> 최대값으로 감
		
		byte bNum1 = 127; // byte 최대값
		
		byte bNum2 = (byte)(bNum1 + 1);
		
		// 오버플로우 대처하기
		int iNum = bNum1 + 1;
		
		System.out.println("bNum1 :" + bNum1); // 127
		System.out.println("bNum2 :" + bNum2); // -128
		System.out.println("iNum : " + iNum); // 128
	}

}
