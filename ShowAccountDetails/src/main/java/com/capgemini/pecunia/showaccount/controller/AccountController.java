package com.capgemini.pecunia.showaccount.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.pecunia.showaccount.entity.Customer;
import com.capgemini.pecunia.showaccount.service.AccountManagementService;


@RestController
@RequestMapping("/bank")
@CrossOrigin("http://localhost:4200")
public class AccountController {

	@Autowired
	private AccountManagementService service;
	
	@GetMapping("/find/{accountId}")
	public Optional<Customer> findByAccountId(@PathVariable long accountId) {
		Optional<Customer> result=service.findByAccountId(accountId);
			return result;
	}
	
	
	
}
