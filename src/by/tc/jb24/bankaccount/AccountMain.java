package by.tc.jb24.bankaccount;

import java.util.List;

public class AccountMain {

	public static void main(String[] args) {

		BankAccount accountUSD = new BankAccount(0001, "Mister X", 1000, "USD");
		BankAccount accountBYN = new BankAccount(0002, "Mister B", 175.25,
				"BYN");

		ListOfBankAccount listOfAccounts = new ListOfBankAccount();

		listOfAccounts.addToList(accountUSD);
		listOfAccounts.addToList(accountBYN);

		BankAccount findAccount = listOfAccounts.findByCurrency("EUR");

		if (findAccount != null) {
			print(findAccount);
		} else {
			printListOfBankAcoounts(listOfAccounts);
		}

	}

	public static void printListOfBankAcoounts(ListOfBankAccount listOfAccounts) {
		List<BankAccount> printAccountsInfo = listOfAccounts.getAccountInfo();

		for (int i = 0; i < printAccountsInfo.size(); i++) {
			BankAccount account = printAccountsInfo.get(i);
			System.out.println(account.toString());
		}
	}

	public static void print(BankAccount account) {
		System.out.println("Account ID :" + account.getAccountID() + " ; "
				+ " User FullName:" + account.getUserFullName() + " ; "
				+ " Balance: " + account.getBalance() + " ; " + " Currency: "
				+ account.getCurrency() + " ;");
	}

}
