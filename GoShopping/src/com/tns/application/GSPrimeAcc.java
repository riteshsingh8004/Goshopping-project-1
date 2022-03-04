package com.tns.application;

import com.tns.framework.*;

public class GSPrimeAcc extends PrimeAcc {
	private static final float charges = 500;

	public float getCharges() {
		return charges;
	}

	public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges, isPrime);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void bookProduct(float charges) {

	}

	@Override
	public String toString() {
		return "GSPrimeAcc []";
	}
	
}
