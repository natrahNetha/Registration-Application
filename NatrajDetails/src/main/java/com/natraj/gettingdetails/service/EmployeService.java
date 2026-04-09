package com.natraj.gettingdetails.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.natraj.gettingdetails.dto.EmployeDetails;

@Service
public class EmployeService {

	/*
	 * private String url = "https://fakestoreapi.com/products";
	 * 
	 * public List<EmployeDetails> getproducts() {
	 * 
	 * RestTemplate restTemplate = new RestTemplate(); EmployeDetails[] forObject =
	 * restTemplate.getForObject(url, EmployeDetails[].class); return
	 * Arrays.asList(forObject);
	 * 
	 * }
	 * 
	 * }
	 */
	
	private final WebClient webClient = WebClient.create("http://fakestoreapi.com");


	public List<EmployeDetails> getProducts() {

	    return webClient.get()
	            .uri("/products")
	            .retrieve()
	            .onStatus(status -> status.isError(), response -> {
	                System.out.println("Error status: " + response.statusCode());
	                return response.createException();
	            })
	            .bodyToFlux(EmployeDetails.class)
	            .collectList()
	            .block();
	}
}