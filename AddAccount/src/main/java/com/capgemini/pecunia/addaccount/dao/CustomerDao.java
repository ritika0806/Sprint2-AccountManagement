package com.capgemini.pecunia.addaccount.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.pecunia.addaccount.entity.Customer;

@Repository
public interface CustomerDao extends JpaRepository<Customer,Integer> {
    
}
