package com.el.calculator.models;

public class Calculator {

	public static Double calculator(Double firstNumber, Double secondNumber, String operator)
	{
		if(operator.equals("+"))
		{
			Double result = firstNumber + secondNumber;
			return result;
		}
		if(operator.equals("_"))
		{
			Double result = firstNumber - secondNumber;
			return result;
		}
		if(operator.equals("*"))
		{
			Double result = firstNumber * secondNumber;
			return result;
		}
		if(operator.equals("/"))
		{
			Double result = firstNumber / secondNumber;
			return result;
		}
		if(operator.equals("^"))
		{
			Double result = Math.pow(firstNumber,  secondNumber);
			return result;
		}
		return -1.0;
	}
	
	
}
