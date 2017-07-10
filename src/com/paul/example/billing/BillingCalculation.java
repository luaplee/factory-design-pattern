package com.paul.example.billing;

public class BillingCalculation implements BillingService {

	@Override
	public void execute(long contractId) {
		calculateBilling(contractId);
	}
	
	private void calculateBilling(long contractId){
		System.out.println("Calculation invoked.");
	}
	
}
