package com.pecunia.addaccount;

import java.net.URI;
import java.net.URISyntaxException;

import org.junit.Test;
//import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;


import com.capgemini.pecunia.addaccount.entity.Account;
import com.capgemini.pecunia.addaccount.entity.Customer;
import junit.framework.Assert;




@SuppressWarnings("deprecation")
@SpringBootTest
public class AddAccountApplicationTests {
	
	@Test
	public void addAccount() throws URISyntaxException {
		
		 RestTemplate restTemplate = new RestTemplate();
	     
		    final String baseUrl = "http://localhost:" + 8097 + "/bank/create";
		    URI uri = new URI(baseUrl);
		 
		    Customer customer=new Customer();
			Account account=new Account();
			
			account.setAccountType("savings");
			account.setBranch("Hyd");
			account.setAmount((long) 2000);
			customer.setAadharNumber("258963147722");
			customer.setCustomerName("shreya");
		
			customer.setContactNumber("234567896");
			customer.setPanNumber("abvgft123");
			customer.setDateOfBirth("31-JAN-1999");
			customer.setGender("female");
			customer.setAddress("Khammam");
			customer.setAccount(account);
	        
	        HttpHeaders headers = new HttpHeaders();
	        headers.set("X-COM-PERSIST", "account successfully created ");      
	        HttpEntity<Customer> request = new HttpEntity<>(customer, headers);
	        
	        ResponseEntity<String> result = restTemplate.postForEntity(uri, request, String.class);
		    Assert.assertEquals(200, result.getStatusCodeValue());
		    Assert.assertNotNull(customer);
		
	}
}