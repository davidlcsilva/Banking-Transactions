package com.bank.transactions.rest;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/transactions")
public interface TransactionsApi {
	
	@GetMapping
	public String retrieveTransaction();
	
	@PostMapping
	public String addTransaction();
	
	@PutMapping
	public String changeTransaction();
	
	@DeleteMapping
	public String deleteTransaction();

}
