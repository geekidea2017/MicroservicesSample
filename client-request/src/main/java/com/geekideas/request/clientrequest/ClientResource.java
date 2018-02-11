package com.geekideas.request.clientrequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("/rest/client")
public class ClientResource {

	@Autowired
	RestTemplate restTemplate;

	@HystrixCommand(fallbackMethod="fallBackMethodReturn")
	@GetMapping("/firstClient")
	public String getFirstService() {

		return restTemplate.getForObject("http://serviceprovider/rest/service/firstService", String.class);

	}
	public String fallBackMethodReturn(){
		return "FirstClient fall back method called : \n \n \t \t ***** Means Exception occured or Service server not responding";
	}
	
	@GetMapping("/secondClient")
	public String getSecondService(){
		
		return "This is second client service directly called from client-request";
	}

}
