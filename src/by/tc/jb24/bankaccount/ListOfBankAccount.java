package by.tc.jb24.bankaccount;

import java.util.ArrayList;
import java.util.List;

public class ListOfBankAccount {
	private List<BankAccount> listOfAccounts = new ArrayList<BankAccount>();
	
	public ListOfBankAccount(){
	}
	
	public List<BankAccount> getAccountInfo(){
		return listOfAccounts;
	}
	
	public void addToList (BankAccount account){
		listOfAccounts.add(account);
	}
	
	public BankAccount findByCurrency(String content){
		for (BankAccount account: listOfAccounts){
			if (account.getCurrency().equals(content)){
				return account;
			}		}
		return null;
	}
}
