package com.capgemini.pecunia;

import java.net.URI;
import java.net.URISyntaxException;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.capgemini.pecunia.entity.Account;
import com.capgemini.pecunia.entity.Customer;




@SpringBootTest
class AccountManagementApplicationTests {

	@Test
	public void addAccount() throws URISyntaxException {
		
		 RestTemplate restTemplate = new RestTemplate();
	     
		    final String baseUrl = "http://localhost:" + 1234 + "/bank/create";
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
		    Assertions.assertEquals(200, result.getStatusCodeValue());
		    Assertions.assertNotNull(customer);
 }
	@org.junit.jupiter.api.Test
	public void showAccountDetailsTest() throws URISyntaxException {
		RestTemplate restTemplate=new RestTemplate();
		final String Url= "http://localhost:"+1234 +"/bank/find/1875662215";
		URI uri=new URI(Url);
		 ResponseEntity<Customer> result = restTemplate.getForEntity(uri, Customer.class);
		    Customer customer = result.getBody();
		    Assertions.assertEquals(200, result.getStatusCodeValue());
		    Assertions.assertNotNull(customer);
	}
	@Test
	public void deleteAccountTest() throws URISyntaxException {
		RestTemplate restTemplate=new RestTemplate();
		final String Url= "http://localhost:"+1234+"/bank/delete/1875662209";
		
		
		URI uri=new URI(Url);
		ResponseEntity<String> result=restTemplate.exchange(uri,HttpMethod.DELETE,null,String.class);
		System.out.println(result);
				Assertions.assertEquals(200,result.getStatusCodeValue());
	}
	@Test
	public void updateName() throws URISyntaxException {

	RestTemplate restTemplate = new RestTemplate();
    
    final String baseUrl = "http://localhost:" + 1234 + "/bank/updateName/1875662208/agarwal";
    URI uri = new URI(baseUrl);
 
    Customer customer=new Customer();
    
	HttpHeaders headers = new HttpHeaders();
    headers.set("X-COM-MERGE", "successfully updated");      
    HttpEntity<Customer> request = new HttpEntity<>(customer, headers);
    HttpEntity<String> result = restTemplate.exchange(uri, HttpMethod.PUT, request, String.class);
    Assertions.assertEquals(200, ((ResponseEntity<String>) result).getStatusCodeValue());
	 }

	
	@Test
	public void updateContact() throws URISyntaxException {
	RestTemplate restTemplate = new RestTemplate();
    final String baseUrl = "http://localhost:" + 1234 + "/bank/updateContact/1875662208/923456785";
    URI uri = new URI(baseUrl);
    Customer customer=new Customer();
    HttpHeaders headers = new HttpHeaders();
    headers.set("X-COM-MERGE", "successfully updated");      
    HttpEntity<Customer> request = new HttpEntity<>(customer, headers);
    HttpEntity<String> result = restTemplate.exchange(uri, HttpMethod.PUT, request, String.class);
    Assertions.assertEquals(200, ((ResponseEntity<String>) result).getStatusCodeValue());
	 }

	@Test
	public void updateAddress() throws URISyntaxException {
    RestTemplate restTemplate = new RestTemplate();
    final String baseUrl = "http://localhost:" + 1234 + "/bank/updateAddress/1875662208/Hyderbadd";
    URI uri = new URI(baseUrl);
    Customer customer=new Customer();
    HttpHeaders headers = new HttpHeaders();
    headers.set("X-COM-MERGE", "successfully updated");      
    HttpEntity<Customer> request = new HttpEntity<>(customer, headers);
    HttpEntity<String> result = restTemplate.exchange(uri, HttpMethod.PUT, request, String.class);
    Assertions.assertEquals(200, ((ResponseEntity<String>) result).getStatusCodeValue());
	 }
}
