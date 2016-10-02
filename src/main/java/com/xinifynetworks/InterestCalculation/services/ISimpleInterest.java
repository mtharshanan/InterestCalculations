package com.xinifynetworks.InterestCalculation.services;

public interface ISimpleInterest {
	
	//Functional Interface
	double genericSimpleInterestCalculation(double principal, float annualRate, int years);

	public default double calculateSimpleInterest(double principal, float annualRate, int years) {
		return yearlySimpleInterest(principal, annualRate) * years;
	};

	public default double yearlySimpleInterest(double principal, float annualRate) {
		return (principal * annualRate) / 100;
	}

	public default double monthlySimpleInterest(double principal, float annualRate) {
		return yearlySimpleInterest(principal, annualRate) / 12;
	}

	public default double perDiemSimpleInterest(double principal, float annualRate) {
		return yearlySimpleInterest(principal, annualRate) / 365;
	}

	public default double perDiemSimpleInterest360dayBasis(double principal, float annualRate) {
		return yearlySimpleInterest(principal, annualRate) / 360;
	}

	public default double perDiemSimpleInterestLeapYear(double principal, float annualRate) {
		return yearlySimpleInterest(principal, annualRate) / 366;
	}

}
