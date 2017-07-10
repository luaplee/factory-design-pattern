package com.paul.example.billing.test;

import org.junit.Assert;
import org.junit.Test;

import com.paul.example.billing.BillingCalculation;
import com.paul.example.billing.BillingCommandEnum;
import com.paul.example.billing.BillingPreCalculation;
import com.paul.example.billing.BillingService;
import com.paul.example.billing.BillingServiceFactory;



public class BillingServiceFactoryTest {
	
	private static final long contractId = 1;
	
	@Test
	public void invokeBillingCalculationTest(){
		BillingService bs = new BillingServiceFactory(BillingCommandEnum.CALCULATION.toString()).getService();
		bs.execute(contractId);
		Assert.assertTrue(bs instanceof BillingCalculation);
	}
	
	@Test
	public void invokeBillingPreCalculationTest(){
		BillingService bs = new BillingServiceFactory(BillingCommandEnum.PRE_CALCULATION.toString()).getService();
		bs.execute(contractId);
		Assert.assertTrue(bs instanceof BillingPreCalculation);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void invokeInvalidCommandTest(){
		BillingService bs = new BillingServiceFactory("test").getService();
		bs.execute(contractId);
	}

}
