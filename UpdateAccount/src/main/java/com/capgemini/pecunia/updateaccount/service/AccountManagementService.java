package com.capgemini.pecunia.updateaccount.service;

public interface AccountManagementService {
     void updateName(long accountId, String customerName);
     void updateContact(long accountId, String customerContact);
     void updateAddress(long accountId, String address);	
	
}