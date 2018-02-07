package com.geekideas.service.serviceprovider;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/service")
public class ServiceResource {
	
	@GetMapping("/firstService")
	public String getFirstService(){
		return "My First Microservices Service.... ";
		
	}
	@GetMapping("secondService")
	public String getSecondService(){
		
		return "This method SecondService called from service-provider directly";
	}

}
