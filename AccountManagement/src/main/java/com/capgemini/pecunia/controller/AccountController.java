package com.capgemini.pecunia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.pecunia.entity.Customer;
import com.capgemini.pecunia.exception.IdNotFoundException;
import com.capgemini.pecunia.service.AccountManagementService;

@RestController
@RequestMapping("/bank")
@CrossOrigin("http://localhost:4200")
public class AccountController {

	@Autowired
	private AccountManagementService service;
	
	@PostMapping("/create")
	public ResponseEntity<Customer> addAccount(@RequestBody Customer customer ) {
			Customer cust=service.addAccount(customer);
			ResponseEntity<Customer> responseEntity = new ResponseEntity<Customer>(cust,HttpStatus.OK);
			return responseEntity;
		}
	
	@PutMapping("/updateName/{accountId}/{customerName}")
	public ResponseEntity<String> updateName(@PathVariable("accountId")long accountId,@PathVariable("customerName")String customerName) throws IdNotFoundException {	
		Customer customer=service.findByAccountId(accountId);
		if(customer==null) {
			throw new IdNotFoundException("Please enter Valid account Id");
		}
		else {
			
			ResponseEntity<String> responseEntity = new ResponseEntity<String>(service.updateName(accountId, customerName),HttpStatus.OK);
			return responseEntity;
		}	
	}

	
	@PutMapping("/updateContact/{accountId}/{customerContact}")
	 public ResponseEntity<String> updateContact(@PathVariable("accountId") long accountId ,@PathVariable("customerContact") String customerContact) throws IdNotFoundException  {
		Customer customer=service.findByAccountId(accountId);
		if(customer==null) {
			throw new IdNotFoundException("Please enter Valid account Id");
		}
		else {
			
			ResponseEntity<String> responseEntity = new ResponseEntity<String>(service.updateContact(accountId,customerContact),HttpStatus.OK);
			return responseEntity;
		}	
	}
	
	@PutMapping("/updateAddress/{accountId}/{Address}")
	public ResponseEntity<String> updateAddress(@PathVariable("accountId") long accountId ,@PathVariable("Address") String Address) throws IdNotFoundException {
          Customer customer=service.findByAccountId(accountId);
  		if(customer==null) {
  			throw new IdNotFoundException("Please enter Valid account Id");
  		}
  		else {
  			
  			ResponseEntity<String> responseEntity = new ResponseEntity<String>(service.updateAddress(accountId,Address),HttpStatus.OK);
  			return responseEntity;
  		}	
}
	
	@DeleteMapping("/delete/{accountId}")
	public ResponseEntity<String> deleteAccount(@PathVariable("accountId") long accountId) throws IdNotFoundException 
	{
		Customer customer=service.findByAccountId(accountId);
		if(customer==null) {
			throw new IdNotFoundException("AccountId does not exists!");
		}
		else {
			ResponseEntity<String> rs =  new ResponseEntity<String>(service.deleteAccount(accountId),HttpStatus.OK);
			return rs;
		}
	}
	
	@GetMapping("/find/{accountId}")
	public Customer findByAccountId(@PathVariable long accountId)  {
		return service.findByAccountId(accountId);
	}
	
	
	
}
