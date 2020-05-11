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

	@Override
	public Optional<Customer> findByAccountId(String accountId) {
		return dao.findByAccountId(accountId);
	}

	
	

}
