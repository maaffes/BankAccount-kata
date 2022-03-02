package com;


import java.util.ArrayList;
import java.util.List;

import com.enums.Operation;
import com.model.Account;

/**
 * 
 * @author affes
 *
 */

public class BankingAccount {
	private static List<String> listOperation= new ArrayList<String>();
	public static double save(double amount, Operation operation, Account account)
			throws Exception {
		    
		switch (operation) {
		case Deposit:
			account.setAmount(account.getAmount() + amount);
			listOperation.add("Deposit operation at:"+java.time.LocalDate.now()+" for: "+ amount);
			
			break;
		case Withdrawal:
			account.setAmount(account.getAmount() - amount);
			if (account.getAmount() < 0) {
				throw new IllegalArgumentException("Only Positive Numbers!");
			} else {
				listOperation.add("Withdrawal operation at:"+ java.time.LocalDate.now()+" for: "+ amount);
			}
			break;

		default:
			break;
		}			
		account.setHistory(listOperation);
		getHistoryOperation(account);
		return account.getAmount();
	}

	public static List<String> getHistoryOperation( Account account) {
		
		return account.getHistory();
	}

}
