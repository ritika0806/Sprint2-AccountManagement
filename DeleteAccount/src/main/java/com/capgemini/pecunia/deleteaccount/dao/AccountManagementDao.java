package com.capgemini.pecunia.deleteaccount.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.capgemini.pecunia.deleteaccount.entity.Account;
import com.capgemini.pecunia.deleteaccount.entity.Customer;


@Repository
public interface AccountManagementDao extends JpaRepository<Customer, Integer>{


		
	@Query("select f from Account f where account_Id=?1")
	List<Account> findByAccountId(long accountId);
	
	
	@Modifying
	@Query("delete from Account e where account_Id=:accountId")
	void deleteAccount(@Param("accountId") long accountId);
	
	
	@Modifying
	@Query("delete from Customer e where account_Id=:accountId")
	void deletecustomer(@Param("accountId") long accountId);
    

	
	
	
	



}
	
	  

	
	
	


