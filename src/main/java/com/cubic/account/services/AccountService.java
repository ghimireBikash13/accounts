package com.cubic.account.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cubic.account.dtos.AccountDto;
import com.cubic.account.utils.InMemoryDataBase;

@Service
public class AccountService {

	public List<AccountDto> getAllAccountInfo() {

		ArrayList<AccountDto> accountsInfoList = new ArrayList<AccountDto>(InMemoryDataBase.accountList);

		return accountsInfoList;

	}

}
