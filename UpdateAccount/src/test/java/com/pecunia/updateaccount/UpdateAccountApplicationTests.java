package com.pecunia.updateaccount;

import java.net.URI;

import java.net.URISyntaxException;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.capgemini.pecunia.updateaccount.entity.Customer;



@SpringBootTest
public class UpdateAccountApplicationTests {
	
	
	@Test
	public void updateName() throws URISyntaxException {

	RestTemplate restTemplate = new RestTemplate();
    
    final String baseUrl = "http://localhost:" + 9980 + "/bank/updateName/44/agarwal";
    URI uri = new URI(baseUrl);
 
    Customer customer=new Customer();
    
	HttpHeaders headers = new HttpHeaders();
    headers.set("X-COM-MERGE", "successfully updated");      
    HttpEntity<Customer> request = new HttpEntity<>(customer, headers);
    
    //ResponseEntity<String> result = restTemplate.postForEntity(uri, request, String.class);
    HttpEntity<String> result = restTemplate.exchange(uri, HttpMethod.PUT, request, String.class);
    Assert.assertEquals(200, ((ResponseEntity<String>) result).getStatusCodeValue());
	 }

	
	@Test
	public void updateContact() throws URISyntaxException {

	RestTemplate restTemplate = new RestTemplate();
    
    final String baseUrl = "http://localhost:" + 9980 + "/bank/updateContact/44/923456785";
    URI uri = new URI(baseUrl);
 
    Customer customer=new Customer();
    
	HttpHeaders headers = new HttpHeaders();
    headers.set("X-COM-MERGE", "successfully updated");      
    HttpEntity<Customer> request = new HttpEntity<>(customer, headers);
    
    //ResponseEntity<String> result = restTemplate.postForEntity(uri, request, String.class);
    HttpEntity<String> result = restTemplate.exchange(uri, HttpMethod.PUT, request, String.class);
    Assert.assertEquals(200, ((ResponseEntity<String>) result).getStatusCodeValue());
	 }

	@Test
	public void updateAddress() throws URISyntaxException {

	RestTemplate restTemplate = new RestTemplate();
    
    final String baseUrl = "http://localhost:" + 9980 + "/bank/updateAddress/44/Hyderbadd";
    URI uri = new URI(baseUrl);
 
    Customer customer=new Customer();
    
	HttpHeaders headers = new HttpHeaders();
    headers.set("X-COM-MERGE", "successfully updated");      
    HttpEntity<Customer> request = new HttpEntity<>(customer, headers);
    
    //ResponseEntity<String> result = restTemplate.postForEntity(uri, request, String.class);
    HttpEntity<String> result = restTemplate.exchange(uri, HttpMethod.PUT, request, String.class);
    Assert.assertEquals(200, ((ResponseEntity<String>) result).getStatusCodeValue());
	 }

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
