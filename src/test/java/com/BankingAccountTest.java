package com;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.enums.Operation;
import com.model.Account;
/**
 * 
 * @author affes
 *
 */
public class BankingAccountTest {
	@Rule
	public ExpectedException exceptionRule = ExpectedException.none();
	private static List<String> listOperation= new ArrayList<String>();
	private static final double DELTA = 1e-15;
	Account account = new Account(1, 20, 12,listOperation);
	@Test
	public final void ShouldReturnAmountAfterDeposit() throws Exception {
			double amount= 2;
			double actual= BankingAccount.save(amount,Operation.Deposit,account);
			assertEquals(22,actual,DELTA);
	}
	
	@Test
	public final void ShouldReturnAmountAfterWithdrawal() throws Exception {
			double amount= 3;
			double actual= BankingAccount.save(amount,Operation.Withdrawal,account);
			assertEquals(17,actual,DELTA);
	}
	@Test
	public final void ShouldThrowExceptionIfNegativeInArgs() throws Exception {
			double amount= 50;
		    exceptionRule.expectMessage("Only Positive Numbers!");
			BankingAccount.save(amount,Operation.Withdrawal,account);

	}
	@Test
	public final void ShouldReturnHistory() throws Exception {
		List<String> actual= BankingAccount.getHistoryOperation(account);			
		assertEquals(listOperation,actual);

	}
}
