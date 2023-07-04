package com.camera;

public class Wallet {
	private double currentWallet;
	public Wallet() {
		// TODO Auto-generated constructor stub
		this.currentWallet=0.0;
	}
	public double getCurrentWallet() {
		return currentWallet;
	}

	public void setCurrentWallet(Double currentWallet) {
		this.currentWallet = currentWallet;
	}
	public void deposite(Double money) {
		this.currentWallet=+money;
	}
	 public boolean hasSufficientBalance(double amount) {
	        return this.currentWallet >= amount;
	    }
	 public boolean deduct(double amount) {
	        if (hasSufficientBalance(amount)) {
	            currentWallet -= amount;
	            return true;
	        }
	        return false;
	    }
	 
}
