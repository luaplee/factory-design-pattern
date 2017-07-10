package com.paul.example.billing;

public class BillingPreCalculation implements BillingService {

	@Override
	public void execute(long contractId) {
		preCalculateBilling(contractId);
	}
	
	private void preCalculateBilling(long contractId){
		System.out.println("PRE calculation invoked.");
	}
	
}
