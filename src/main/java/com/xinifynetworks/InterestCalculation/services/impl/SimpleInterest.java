package com.xinifynetworks.InterestCalculation.services.impl;

import java.text.NumberFormat;
import java.util.Locale;

import com.xinifynetworks.InterestCalculation.services.IPresentation;
import com.xinifynetworks.InterestCalculation.services.ISimpleInterest;

public class SimpleInterest implements IPresentation, ISimpleInterest {

	public String formattedCurrency(double amount) {
		return this.formattedCurrency(amount, Locale.getDefault());
	}

	public String formattedCurrency(double amount, Locale locale) {
		NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);

		return currencyFormatter.format(amount);
	}

	@Override
	public double genericSimpleInterestCalculation(double principal, float annualRate, int years) {
		return principal*annualRate*years/100;
	}

}
