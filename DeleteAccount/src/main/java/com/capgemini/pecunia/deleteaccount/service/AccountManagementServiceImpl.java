package com.capgemini.pecunia.deleteaccount.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.pecunia.deleteaccount.dao.AccountManagementDao;
import com.capgemini.pecunia.exceptions.Id_NotFound_Exception;



@Service
@Transactional
public class AccountManagementServiceImpl implements AccountManagementService {
 
	@Autowired
	private AccountManagementDao dao;
     //This method deletes the account from the database
	//It takes accountId as input
	//If the accountId is not found, it throws an exception
	@Override
	public String deleteAccount(long accountId) throws Id_NotFound_Exception {
		System.out.println("this is service"+accountId);
		
		  dao.deletecustomer(accountId);
		  dao.deleteAccount(accountId);
		 return "deleted account";
	
	}
	}



	
