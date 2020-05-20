package com.capgemini.pecunia.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.pecunia.dao.AccountManagementDao;
import com.capgemini.pecunia.entity.Customer;




@Service
@Transactional
public class AccountManagementServiceImpl implements AccountManagementService {

	@Autowired
	private AccountManagementDao dao;
	
	@Override
	public Customer addAccount(Customer customer) {
	 return dao.save(customer);
	 
	}
	@Override
	public String updateName(long accountId, String customerName) {
		dao.updateName(accountId, customerName);
		return "Account updated succesfully";
		
		
	}	
	@Override
	public String updateContact(long accountId, String customerContact) {
		dao.updateContact(accountId, customerContact);
		return "Account updated successfully";
	}
	@Override
	public String updateAddress(long accountId, String Address) {
		dao.updateAddress(accountId, Address);
		return "Account updated successfully";
		
	}
	@Override
	public String deleteAccount(long accountId)  {
		System.out.println("this is service"+accountId);
		
		  dao.deletecustomer(accountId);
		  dao.deleteAccount(accountId);
		 return "deleted account";
	
	}
	@Override
	public Customer findByAccountId(long accountId) {
		return dao.findByAccountId(accountId);
	}


}