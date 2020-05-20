package com.capgemini.pecunia.updateaccount.dao;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

//import com.capgemini.pecunia.updateaccount.entity.Account;
import com.capgemini.pecunia.updateaccount.entity.Customer;

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



}
 
	