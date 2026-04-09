package com.natraj.gettingdetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.natraj.gettingdetails.dto.EmployeDetails;
import com.natraj.gettingdetails.service.EmployeService;

@RestController
public class productController {

	@Autowired

	private EmployeService empservice;

	public void productController(EmployeService empservice) {
		this.empservice = empservice;
	}

	@GetMapping("/products")
	public List<EmployeDetails> getproduct() {
		return empservice.getProducts();

	}

}
