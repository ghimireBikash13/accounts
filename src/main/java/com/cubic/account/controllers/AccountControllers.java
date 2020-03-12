package com.cubic.account.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cubic.account.dtos.AccountDto;
import com.cubic.account.services.AccountService;

@RestController
@RequestMapping("/account")
public class AccountControllers {
	
	@Autowired
	private AccountService accountService;
	
	@GetMapping(value="/boa")
	public List<AccountDto> getAllAccountInfo(){
		
		return accountService.getAllAccountInfo();
		
	}

}
