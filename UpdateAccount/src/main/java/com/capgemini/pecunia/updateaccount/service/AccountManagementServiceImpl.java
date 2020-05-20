package com.capgemini.pecunia.updateaccount.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.pecunia.updateaccount.dao.AccountManagementDao;


@Service
@Transactional
public class AccountManagementServiceImpl implements AccountManagementService{

	@Autowired
	private AccountManagementDao dao;
   //This method updates the customer Name
   //It takes accountId and Customer name as input and updates the name of the customer
	@Override
	public void updateName(long accountId, String customerName) {
		dao.updateName(accountId, customerName);
		
	}	
	//This method updates the customer contact
	 //It takes accountId and Customer contact as input and updates the contact no of the customer
	@Override
	public void updateContact(long accountId, String customerContact) {
		dao.updateContact(accountId, customerContact);
	}
	//This method updates the customer Address
	 //It takes accountId and Customer address as input and updates the address of the customer
	@Override
	public void updateAddress(long accountId, String Address) {
		dao.updateAddress(accountId, Address);
	}
		
	}

