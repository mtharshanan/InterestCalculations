package com.xinifynetworks.InterestCalculation;

import java.util.Locale;

import com.xinifynetworks.InterestCalculation.services.impl.SimpleInterest;

public class App {
	public static void main(String[] args) {
		double principal = 1000;
		float annualRate = 5;

		SimpleInterest annualSimpleInterest = new SimpleInterest();
		
		System.out.println("Annual Simple Interest: " + annualSimpleInterest
				.formattedCurrency(annualSimpleInterest.yearlySimpleInterest(principal, annualRate)));
		System.out.println("Monthly Simple Interest: " + annualSimpleInterest
				.formattedCurrency(annualSimpleInterest.monthlySimpleInterest(principal, annualRate), Locale.UK));
		System.out.println("Daily Simple Interest: " + annualSimpleInterest
				.formattedCurrency(annualSimpleInterest.perDiemSimpleInterest(principal, annualRate), Locale.CHINA));
	}
}
