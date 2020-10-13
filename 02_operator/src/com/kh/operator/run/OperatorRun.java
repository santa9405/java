package com.kh.operator.run;

import com.kh.operator.service.A_SingleOperater;
import com.kh.operator.service.B_BinaryOperator;
import com.kh.operator.service.C_TernaryOperator;

public class OperatorRun {
	
	public static void main(String[] args) {
		A_SingleOperater aso = new A_SingleOperater();
		//aso.logicalNegationOp();
		//aso.increaseOp();
		//aso.practice1();
		//aso.practice2();
		
		B_BinaryOperator bbo = new B_BinaryOperator();
		//bbo.arithmeticOp();
		//bbo.comparisonOp();
		//bbo.logicalOp();
		//bbo.logicalOp2();
		//bbo.logicalOp3();
		//bbo.logicalOp4();
		//bbo.compoundAssignmentOp();
		
		C_TernaryOperator cto = new C_TernaryOperator();
		//cto.example1();
		//cto.example2();
	}

}
