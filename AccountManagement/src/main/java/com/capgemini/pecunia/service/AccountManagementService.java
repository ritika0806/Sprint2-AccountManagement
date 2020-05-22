package com.capgemini.pecunia.service;

import com.capgemini.pecunia.entity.Customer;
public interface AccountManagementService {
	Customer addAccount(Customer customer);
	String updateName(long accountId, String customerName);
	String updateContact(long accountId, String customerContact);
	String updateAddress(long accountId, String address);
	String deleteAccount(long accountId);
	Customer findByAccountId(long accountId);

		

}
