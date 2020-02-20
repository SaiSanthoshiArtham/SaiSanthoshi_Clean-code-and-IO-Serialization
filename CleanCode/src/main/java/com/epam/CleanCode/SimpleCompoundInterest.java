package com.epam.CleanCode;

public class SimpleCompoundInterest {

	public double calculatingSimpleInterest(double principle, double rate, double time) {
		
		double simple;
		simple=(principle * time * rate)/100;
		return simple;
		
	}
	public double calculatingCompoundInterest(double principle, double rate, double time) {
		
		double compound;
		compound=principle * Math.pow(1.0+rate/100.0,time) - principle;
		return compound;
		
	}
}
