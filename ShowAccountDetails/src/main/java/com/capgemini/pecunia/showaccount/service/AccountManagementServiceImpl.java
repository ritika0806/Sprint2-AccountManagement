package com.capgemini.pecunia.showaccount.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.pecunia.showaccount.dao.AccountManagementDao;
import com.capgemini.pecunia.showaccount.entity.Customer;


@Service
public class AccountManagementServiceImpl implements AccountManagementService {

	@Autowired
	private AccountManagementDao dao;
    //This method shows the account details of the customer
	//It takes acccountId as input and displays the customer details
	
	@Override
	public Optional<Customer> findByAccountId(long accountId) {
		return dao.findByAccountId(accountId);
	}

	
	

}
