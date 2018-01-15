package com.adapter.pattern;

public interface XPay {
	String getCreditCardNumber();

	String getCustomerName();

	String getCardExpMonth();

	String getCardExpYear();

	short getCardCVVNo();

	double getAmount();

}
