package com.geekideas.request.clientrequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/rest/client")
public class ClientResource {

	@Autowired
	RestTemplate restTemplate;

	@GetMapping("/firstClient")
	public String getFirstService() {

		return restTemplate.getForObject("http://serviceprovider/rest/service/firstService", String.class);

	}
	
	@GetMapping("/secondClient")
	public String getSecondService(){
		
		return "This is second client service directly called from client-request";
	}

}
