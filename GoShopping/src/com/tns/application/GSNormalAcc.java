package com.tns.application;

import com.tns.framework.*;

public class GSNormalAcc extends NormalAcc {

	public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		super(accNo, accNm, charges, deliveryCharges);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void bookProduct(float charges) {

	}

	@Override
	public String toString() {
		return "GSNormalAcc []";
	}

}
