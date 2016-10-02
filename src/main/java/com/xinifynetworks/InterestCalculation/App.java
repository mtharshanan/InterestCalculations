package com.xinifynetworks.InterestCalculation;

import java.util.Locale;

import com.xinifynetworks.InterestCalculation.services.ISimpleInterest;
import com.xinifynetworks.InterestCalculation.services.impl.SimpleInterest;

public class App {
	public static void main(String[] args) {
		double principal = 1000;
		float annualRate = 5;
		int years = 7;

		//Functional Interface illustration
		ISimpleInterest customInterest = (p, r, n) -> p * r * n / 100;
		SimpleInterest forFormatting = new SimpleInterest();
		
		double ci = customInterest.calculateSimpleInterest(principal, annualRate, years);
		System.out.println("Custom Interest (Unformatted)" + ci);
		System.out.println("Custom Interest (Formatted to defrault locale)" + forFormatting.formattedCurrency(ci));
		System.out.println("Custom Interest (Formatted to custom locale)" + forFormatting.formattedCurrency(ci, Locale.JAPAN));

		SimpleInterest simpleInterest = new SimpleInterest();

		System.out.println("\nAnnual Simple Interest (Unformatted): "
				+ simpleInterest.yearlySimpleInterest(principal, annualRate));
		System.out.println("Monthly Simple Interest (Unformatted): "
				+ simpleInterest.monthlySimpleInterest(principal, annualRate));

		System.out.println("\nFormatted Annual Simple Interest: "
				+ simpleInterest.formattedCurrency(simpleInterest.yearlySimpleInterest(principal, annualRate)));
		System.out.println("Formatted Monthly Simple Interest: "
				+ simpleInterest.formattedCurrency(simpleInterest.monthlySimpleInterest(principal, annualRate), Locale.UK));
		System.out.println("Formatted Daily Simple Interest: " + simpleInterest
				.formattedCurrency(simpleInterest.perDiemSimpleInterest(principal, annualRate), Locale.CHINA));
	}
}
