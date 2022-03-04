package com.tns.framework;

public abstract class NormalAcc extends ShopAcc {

	private final float deliveryCharges;

	public NormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		super(accNo, accNm, charges);
		this.deliveryCharges = deliveryCharges;
	}

	public float getDeliveryCharges() {
		return deliveryCharges;
	}

	@Override
	public void bookProduct(float charges) {

	}

	@Override
	public String toString() {
		return "NormalAcc []";
	}

	

}
