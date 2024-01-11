package com.sanju.runner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sanju.dto.ModelDTO;
import com.sanju.service.IModelService;

@Component
public class ModelRunner implements CommandLineRunner {
	@Autowired
	private IModelService modelService;

	@Override
	public void run(String... args) throws Exception {
		ModelDTO modelDTO = new ModelDTO();

		String firstName = "sanjaya";
		String lastName = "sahu";
		List<String> nickNames = List.of("sanju", "Lucky");
		Integer age = 23;
		Map<String, Object> address = new HashMap<>();
		address.put("street", "ABC street");
		address.put("city", "ABC city");
		address.put("state", "ABC street");
		address.put("zipCode", "ABC zipCode");
		address.put("country", "ABC country");

//		Address address1 = new Address("Gajapati Nagar 3rd Lane", "Berhampur", "Odisha", 761010, "India");
//		Address address2 = new Address("RajuTech Label 9, Synosure Building", "Hyderabad", "Telengana", 661010,
//				"India");

		Map<String, Object> map = new HashMap<>();

		map.put("firstName", firstName);
		map.put("lastName", lastName);
		map.put("nickNames", nickNames);
		map.put("age", age);
//		map.put("address1", address1);
//		map.put("address2", address2);

		modelDTO.setModel(map);

//		modelService.saveModel(modelDTO);
	}
}
