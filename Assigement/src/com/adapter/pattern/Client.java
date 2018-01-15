package com.adapter.pattern;

public class Client {

	public static void main(String[] args) {

		XPayImpl x = new XPayImpl();
		x.setCustomerName("Thant Zin Aung");
		x.setCreditCardNumber("274328965321234");
		x.setCardExpMonth("August");
		x.setCardExpYear("2019");
		x.setCardCVVNo((short) 3257);
		x.setAmount(12500000.0);

		PayD payD = new PayDAdapterXPay(x);
		testPay(payD);

	}
	
	public static void testPay(PayD payD) {
		System.out.println(payD.getCardOwnerName());
		System.out.println(payD.getCustNo());
		System.out.println(payD.getExpMonthDate());
		System.out.println(payD.getCVVNo());
		System.out.println(payD.getTotalAmount());
	}

}
