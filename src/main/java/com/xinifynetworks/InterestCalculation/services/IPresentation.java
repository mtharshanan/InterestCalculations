package com.xinifynetworks.InterestCalculation.services;

import java.util.Locale;

public interface IPresentation {

	public String formattedCurrency(double amount);

	public String formattedCurrency(double amount, Locale locale);

}
