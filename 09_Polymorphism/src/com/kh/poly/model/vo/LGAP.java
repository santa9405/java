package com.kh.poly.model.vo;

import com.kh.poly.ex1.model.vo.AllinOnePrinter;

public class LGAP extends AllinOnePrinter {

	public LGAP() {}
	
	public LGAP(String brand, String name) {
		super(brand, name);
	}

	@Override
	public double maxPaperSize() {
		// TODO Auto-generated method stub
		return 420;
	}
	
	public void print3D() {
		System.out.println("3D 프린트 가능");
	}

	@Override
	public void print() {
		System.out.println("삼성보다 느리게");		
	}

	@Override
	public void powerOn() {
		System.out.println("터치식");		
	}

	@Override
	public void powerOff() {
		System.out.println("터치식");		
		
	}

	@Override
	public void scan() {
		System.out.println("삼성보다 좋게");		
	}
	

}
