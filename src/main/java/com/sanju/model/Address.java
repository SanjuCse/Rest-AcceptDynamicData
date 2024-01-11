package com.sanju.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Address {
	private String street;
	private String city;
	private String state;
	private Integer zipCode;
	private String country;
}
