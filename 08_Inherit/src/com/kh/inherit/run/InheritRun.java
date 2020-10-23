package com.kh.inherit.run;

import com.kh.inherit.model.service.CalculatorService;
import com.kh.inherit.model.service.InheritService;

public class InheritRun {
	public static void main(String[] args) {
		InheritService service = new InheritService();
		//service.example1();
		
		CalculatorService cs = new CalculatorService();
		//cs.example();
	}
}
