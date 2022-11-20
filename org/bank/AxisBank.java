package org.bank;

public class AxisBank extends BankInfo {

	public void deposit() {
		System.out.println("Deposited in AxisBank");
	}
		
	public static void main(String[] args) {
				
		AxisBank axis =new AxisBank();
		axis.deposit();

	}

}
