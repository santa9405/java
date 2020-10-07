// 메인 클래스
package com.kh.variable.run;

import com.kh.variable.service.A_Variable;
import com.kh.variable.service.B_KeyboardInput;

public class VariableRun {
	public static void main(String[] args) {
		A_Variable var = new A_Variable();
		// import 해야 함
		
		//var.noVariable();
		//var.usingVariable();
		//var.declareVariable();
		
		B_KeyboardInput bki = new B_KeyboardInput();
		
		bki.inputTest1();
		
	}
}	