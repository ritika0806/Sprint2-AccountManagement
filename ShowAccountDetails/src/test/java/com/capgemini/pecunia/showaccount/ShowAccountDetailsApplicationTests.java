package com.capgemini.pecunia.showaccount;

import java.net.URI;
import java.net.URISyntaxException;

import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.capgemini.pecunia.showaccount.entity.Customer;





@SpringBootTest
public class ShowAccountDetailsApplicationTests {

	
	

	@org.junit.jupiter.api.Test
	public void showAccountDetailsTest() throws URISyntaxException {
		RestTemplate restTemplate=new RestTemplate();
		final String Url= "http://localhost:"+9985 +"/bank/find/44";
		URI uri=new URI(Url);
		 ResponseEntity<Customer> result = restTemplate.getForEntity(uri, Customer.class);
		    Customer customer = result.getBody();
		    Assertions.assertEquals(200, result.getStatusCodeValue());
		    Assertions.assertNotNull(customer);
	}
}
	
		