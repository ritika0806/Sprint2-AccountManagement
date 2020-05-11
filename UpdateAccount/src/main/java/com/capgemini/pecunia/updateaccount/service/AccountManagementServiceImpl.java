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

	@Override
	public void updateName(Long accountId, String customerName) {
		dao.updateName(accountId, customerName);
		
	}	
	@Override
	public void updateContact(Long accountId, String customerContact) {
		dao.updateContact(accountId, customerContact);
	}
	@Override
	public void updateAddress(Long accountId, String Address) {
		dao.updateAddress(accountId, Address);
		
		
	
		
	}

	
		
	}

/*
 public void updateAccount(String accountId,String customerName) {
		System.out.println("This is accountId"+accountId);
		dao.updateAccount(accountId,customerName);
		
 public void updateAccount(String accountId, String contactNumber) {
		System.out.println("This is accountId"+accountId);
		dao.updateAccount(accountId,contactNumber);
		
		public void updateAccount(String accountId, String address) {
		System.out.println("This is accountId"+accountId);
		dao.updateAccount(accountId,address);
 */

	
