package com.el.calculator.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.el.calculator.models.Calculator;
@Controller
public class CalculatorController {

	public CalculatorController() {
		// TODO Auto-generated constructor stub
	}
	@GetMapping("/")
	public ModelAndView calculator()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("calculator");
		return mv;
	}
	
	@PostMapping("/")
	public ModelAndView calculate(Double firstNumber, Double secondNumber, String operator)
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("calculator");
		Double Calc = Calculator.calculator(firstNumber, secondNumber, operator);
		String prettyNumb = Calc.toString();
		History.add(prettyNumb);
		mv.addObject("History", History);
		mv.addObject("Answer", Calc);
		return mv;	
	}
	
	ArrayList<String>History= new ArrayList<String>();
	
	
	
}
