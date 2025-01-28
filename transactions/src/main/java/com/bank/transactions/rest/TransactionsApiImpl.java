package com.bank.transactions.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.bank.transactions.service.TransactionsService;

@RestController
public class TransactionsApiImpl implements TransactionsApi {
	
	@Autowired
	public TransactionsService transactionsService;

	@Override
	public String retrieveTransaction() {
		return transactionsService.retrieveTransaction();
	}

	@Override
	public String addTransaction() {
		return transactionsService.addTransaction();
	}

	@Override
	public String changeTransaction() {
		return transactionsService.changeTransaction();
	}

	@Override
	public String deleteTransaction() {
		return transactionsService.deleteTransaction();
	}

}
