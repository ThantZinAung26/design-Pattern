package com.adapter.pattern;

public class XPayImpl implements XPay {
	
	private String creditCardNumber;
	private String customerName;
	private String cardExpMonth;
	private String cardExpYear;
	private short cardCVVNo;
	private double amount;
	
	

	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public void setCardExpMonth(String cardExpMonth) {
		this.cardExpMonth = cardExpMonth;
	}

	public void setCardExpYear(String cardExpYear) {
		this.cardExpYear = cardExpYear;
	}

	public void setCardCVVNo(short cardCVVNo) {
		this.cardCVVNo = cardCVVNo;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String getCreditCardNumber() {
		return creditCardNumber;
	}

	@Override
	public String getCustomerName() {
		return customerName;
	}

	@Override
	public String getCardExpMonth() {
		return cardExpMonth;
	}

	@Override
	public String getCardExpYear() {
		return cardExpYear;
	}

	@Override
	public short getCardCVVNo() {
		return cardCVVNo;
	}

	@Override
	public double getAmount() {
		return amount;
	}

}
