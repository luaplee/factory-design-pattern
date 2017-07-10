package com.paul.example.billing.invoker;

import com.paul.example.billing.BillingService;
import com.paul.example.billing.BillingServiceFactory;

public class BillingServiceInvoker {
	
	public static void main(String[] args) {
		BillingService bs = new BillingServiceFactory("PRE_CALCULATION").getService();
		bs.execute(1l);
	}

}
