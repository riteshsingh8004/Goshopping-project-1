package com.tns.framework;

public abstract class ShopAcc {

	private int accNo;
	private String accNm;
	private float charges;

	public int getAccNo() {
		return accNo;
	}

	public String getAccNm() {
		return accNm;
	}

	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}

	public float getCharges() {
		return charges;
	}

	public ShopAcc(int accNo, String accNm, float charges) {
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.charges = charges;
	}

	public abstract void bookProduct(float f);

	public void items(float f) {
//		System.out.println("Shop any of this:");
		System.out.println("1.Mobile\n2.Laptop\n3.Shirt\n4T-shirt\n5.Jeans");
		
		
	}

	@Override
	public String toString() {
		return "ShopAcc []";
	}
}
