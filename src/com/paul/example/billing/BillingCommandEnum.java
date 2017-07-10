package com.paul.example.billing;

public enum BillingCommandEnum {
	CALCULATION,
	PRE_CALCULATION;
	
	public static BillingCommandEnum  parse(String value){
		for(BillingCommandEnum bce : BillingCommandEnum.values()){
			if(bce == BillingCommandEnum.valueOf(value.toUpperCase())){
				return bce;
			}
		}
		return null;
	}

}
