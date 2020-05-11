package com.capgemini.pecunia.deleteaccount.service;

import com.capgemini.pecunia.exceptions.Id_NotFound_Exception;

public interface AccountManagementService {

	String deleteAccount(long accountId) throws Id_NotFound_Exception;

}
