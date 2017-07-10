package com.paul.example.billing;

public class BillingServiceFactory {
	
	private String command;
	
	public BillingServiceFactory(String command){
		this.command = command;
	}
	
	public BillingService getService(){
		BillingCommandEnum bce = BillingCommandEnum.parse(command);
		
		switch(bce){
		case CALCULATION:
			return new BillingCalculation();
		case PRE_CALCULATION:
			return new BillingPreCalculation();
		default:
			throw new IllegalArgumentException();
		}
	}
	

}
