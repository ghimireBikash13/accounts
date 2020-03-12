package com.cubic.account.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.cubic.account.dtos.AccountDto;

public class InMemoryDataBase {

	public static List<AccountDto> accountList;

	static {
		accountList = new ArrayList<AccountDto>();

		AccountDto a1 = new AccountDto();
		a1.setCustomerUuid("6134619c-d037-4159-b845-a27340ce6743");
		a1.setAccountType("Debit");
		a1.setAmountDeposited("$5000");
		a1.setAccountCreated("05/15/2016");
		a1.setAccountNo("002245698765256587");
		a1.setRoutingNo("5543645");

		AccountDto a2 = new AccountDto();
		a2.setCustomerUuid("6134619c-d037-4159-b845-a27340ce6743");
		a2.setAccountType("Debit");
		a2.setAmountDeposited("$5000");
		a2.setAccountCreated("05/15/2016");
		a2.setAccountNo("002245698765256587");
		a2.setRoutingNo("5543645");

		accountList.add(a1);
		accountList.add(a2);

	}

}
