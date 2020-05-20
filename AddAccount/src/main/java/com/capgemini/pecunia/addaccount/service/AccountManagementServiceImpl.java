package com.capgemini.pecunia.addaccount.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.pecunia.addaccount.dao.CustomerDao;
import com.capgemini.pecunia.addaccount.entity.Customer;


@Service
@Transactional
public class AccountManagementServiceImpl implements AccountManagementService {

	@Autowired
	private CustomerDao dao;
	//This method creates an account of the customer 
	//It takes customer object as the input from the front end
	//Account gets created when all the inputs are correctly given
	@Override
	public Customer addAccount(Customer customer) {
	 return dao.save(customer);
	 
	}

}
