package com.adapter.pattern;

public class PayDAdapterXPay implements PayD {

	private String custNo;
	private String cardOwnerName;
	private String expMonthDate;
	private int cvvNo;
	private double totalAmount;

	protected final XPay xPay;

	public PayDAdapterXPay(XPay xPay) {
		this.xPay = xPay;
		setProp();
	}

	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}

	public void setCardOwnerName(String cardOwnerName) {
		this.cardOwnerName = cardOwnerName;
	}

	public void setExpMonthDate(String expMonthDate) {
		this.expMonthDate = expMonthDate;
	}

	public void setCvvNo(int cvvNo) {
		this.cvvNo = cvvNo;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	@Override
	public String getCustNo() {
		return custNo;
	}

	@Override
	public String getCardOwnerName() {
		return cardOwnerName;
	}

	@Override
	public String getExpMonthDate() {
		return expMonthDate;
	}

	@Override
	public int getCVVNo() {
		return cvvNo;
	}

	@Override
	public double getTotalAmount() {
		return totalAmount;
	}

	private void setProp() {
		setCardOwnerName(this.xPay.getCustomerName());
		setCustNo(this.xPay.getCreditCardNumber());
		setExpMonthDate(this.xPay.getCardExpMonth() + xPay.getCardExpYear());
		setCvvNo(this.xPay.getCardCVVNo());
		setTotalAmount(this.xPay.getAmount());
	}

}
