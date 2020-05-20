package com.capgemini.pecunia.showaccount.service;

import java.util.Optional;

import com.capgemini.pecunia.showaccount.entity.Customer;

public interface AccountManagementService {

	Optional<Customer> findByAccountId(long accountId);

	
}
