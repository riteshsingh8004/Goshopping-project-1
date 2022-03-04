package com.tns.framework;

public interface ShopFactory {

	public PrimeAcc getNewPrimeAccount(int AccNo, String accNm, float charges, boolean isPrime);

	public NormalAcc getNewNormalAccount(int AccNo, String accNm, float charges, float deliveryCharges);

}
