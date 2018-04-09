package by.tc.jb24.bankaccount;


public class BankAccount {
	int accountID;
	String userFullName;
	String currency;
	double balance;
	
	public BankAccount(int accountID, String userFullName, double balance, String currency){
		this.accountID=accountID;
		this.userFullName=userFullName;
		this.balance=balance;
		this.currency=currency;
	}
	
	public int getAccountID(){
		return accountID;
	}
	
	public void setAccountID(int accountID){
		this.accountID=accountID;
	}
	
	public String getUserFullName(){
		return userFullName;
	}
	
	public void setUserFullName(String userFullName){
		this.userFullName=userFullName;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public void setBalance(double balance){
		this.balance=balance;
	}
	
	public String getCurrency(){
		return currency;
	}
	
	public void setCurrency(String currency){
		this.currency=currency;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + accountID;
		long temp;
		temp = Double.doubleToLongBits(balance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result
				+ ((currency == null) ? 0 : currency.hashCode());
		result = prime * result
				+ ((userFullName == null) ? 0 : userFullName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankAccount other = (BankAccount) obj;
		if (accountID != other.accountID)
			return false;
		if (Double.doubleToLongBits(balance) != Double
				.doubleToLongBits(other.balance))
			return false;
		if (currency == null) {
			if (other.currency != null)
				return false;
		} else if (!currency.equals(other.currency))
			return false;
		if (userFullName == null) {
			if (other.userFullName != null)
				return false;
		} else if (!userFullName.equals(other.userFullName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BankAccount [accountID=" + accountID + ", userFullName="
				+ userFullName + ", currency=" + currency + ", balance="
				+ balance + "]";
	}	
}
