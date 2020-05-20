package com.capgemini.pecunia.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.capgemini.pecunia.entity.Account;
import com.capgemini.pecunia.entity.Customer;


@Repository
public interface AccountManagementDao extends JpaRepository<Customer,Integer> {
	@Modifying
	@Query("update Customer SET customer_Name=?2 where account_Id=?1")
	void updateName(long accountId,String customerName);

	@Modifying
	@Query("update Customer SET contact_Number=?2 where account_Id=?1")
	void updateContact(long accountId,String customerName);

	@Modifying
	@Query("update Customer SET address=?2 where account_Id=?1")
	void updateAddress(long accountId,String customerName);
	
	//@Query("select f from Account f where account_Id=?1")
	//List<Account> findByAccountId(long accountId);
	
	
	@Modifying
	@Query("delete from Account e where account_Id=:accountId")
	void deleteAccount(@Param("accountId") long accountId);
	
	
	@Modifying
	@Query("delete from Customer e where account_Id=:accountId")
	void deletecustomer(@Param("accountId") long accountId);
    
	@Query("select f from Customer f where account_Id=?1")
	Customer findByAccountId(long accountId);

	

}

