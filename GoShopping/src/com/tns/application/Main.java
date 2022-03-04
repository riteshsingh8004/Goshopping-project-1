package com.tns.application;

import java.util.*;

import com.tns.framework.*;

public class Main {
	static Scanner sc = new Scanner(System.in);

	static int order() {
//		GSNormalAcc user = new GSNormalAcc(0, "default", 0, false);
		NormalAcc user = new GSNormalAcc(0, "default", 0, 0);

		String[] items = { "Mobile", "Laptop", "Watch", "Shirt", "T-shirt" };
		int charges[] = { 10000, 50000, 2000, 800, 400 };

		System.out.println("Enter product number(1-5):");
//		Product Number
		int productNo = sc.nextInt();
		switch (productNo) {
		case 1: {
			System.out.println(items[0] + " Rs." + charges[0]);
			user.bookProduct(productNo);
			break;
		}
		case 2: {
			System.out.println(items[1] + " Rs." + charges[1]);
			user.bookProduct(productNo);
			break;
		}
		case 3: {
			System.out.println(items[2] + " Rs." + charges[2]);
			user.bookProduct(productNo);
			break;
		}
		case 4: {
			System.out.println(items[3] + " Rs." + charges[3]);
			user.bookProduct(productNo);
			break;
		}
		case 5: {
			System.out.println(items[4] + " Rs." + charges[4]);
			user.bookProduct(productNo);
			break;
		}
		}

		return charges[productNo - 1];
	}

	public static void main(String[] args) {
		int accNo = 100;
		String accNm;
		float charges;
		boolean isPrime;
		float deliveryChg = 50;
		float total = 0;
		GSNormalAcc nn = new GSNormalAcc(201, "Ritesh", 0, deliveryChg);
		GSPrimeAcc pn = new GSPrimeAcc(202, "Avatika", 500, true);

		System.out.println("Welcome to GoShopping ");
		System.out.println("You have previous account or Create new Account");
		System.out.println("Press 1.Create Account \n2.Log in");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:// Create new Account
			System.out.println("Press 1.Prime Account\n2.Normal Account");
			choice = sc.nextInt();
			switch (choice) {
			case 1:// Prime Account
				System.out.println("Enter your Name:");
				accNm = sc.next();
				System.out.println("You have to pay 500Rs");
				System.out.println("Pay Amount");
				charges = sc.nextFloat();
				isPrime = true;
				GSPrimeAcc p = new GSPrimeAcc(accNo++, accNm, charges, isPrime);
				System.out.println("your account is activated");
				p.items(0);
				total = order() + p.getDeliverycharges();
				System.out.println("You have to pay" + total);
				break;
			case 2:// Normal Account
				System.out.println("Enter your Name:");
				accNm = sc.next();
				charges = 0;
//				isPrime = true;
				GSNormalAcc n = new GSNormalAcc(accNo++, accNm, charges, deliveryChg);
				System.out.println("your account is activated");
				n.items(0);
				total = order() + deliveryChg;
				System.out.println("You have to pay" + total);
				break;

			default:
				System.out.println("Invalid input");
				break;
			}
			break;

		case 2:// Login

			System.out.println("press 1.prime account\n2.Normal account");
			choice = sc.nextInt();
			switch (choice) {
			case 1:// Prime Account
				System.out.println("enter your account number");
				choice = sc.nextInt();
				if (choice == pn.getAccNo()) {
					pn.items(0);
					total = order() + pn.getDeliverycharges();
					System.out.println("You have to pay" + total);
				}

				break;
			case 2:// Normal Account
				System.out.println("enter your account number");
				choice = sc.nextInt();
				if (choice == nn.getAccNo()) {
					nn.items(0);
					total = order() + deliveryChg;
					System.out.println("You have to pay" + total);
				}
				break;

			default:
				System.out.println("Invalid input");
				break;

			}

			break;

		default:
			System.out.println("Invalid input");
			break;
		}
	}

}
