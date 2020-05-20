package com.capgemini.pecunia.updateaccount.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.pecunia.updateaccount.service.AccountManagementService;

@RestController
@RequestMapping("/bank")
@CrossOrigin("http://localhost:4200")
public class AccountController {

	@Autowired
	AccountManagementService service;
	
	@PutMapping("/updateName/{accountId}/{customerName}")
	public void updateName(@PathVariable long accountId,@PathVariable String customerName) {
		service.updateName(accountId,customerName);
	}
	
	@PutMapping("/updateContact/{accountId}/{customerContact}")
	 public void updateContact(@PathVariable long accountId ,@PathVariable String customerContact) {
		service.updateContact(accountId,customerContact);
	}
	@PutMapping("/updateAddress/{accountId}/{Address}")
	public void updateAddress(@PathVariable long accountId ,@PathVariable String Address) {
          service.updateAddress(accountId,Address);
}
	
	
}

	
	
