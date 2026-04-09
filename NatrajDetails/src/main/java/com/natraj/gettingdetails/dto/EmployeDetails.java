package com.natraj.gettingdetails.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeDetails {

	private int id;
	private String title;
	private double price;
	private String category;
	private String about;
	

}
