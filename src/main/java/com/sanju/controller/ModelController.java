package com.sanju.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sanju.dto.ModelDTO;
import com.sanju.dto.ResponseDTO;
import com.sanju.service.IModelService;

@RestController
public class ModelController {
	@Autowired
	private IModelService modelService;

	@PostMapping
	private ResponseEntity<ResponseDTO> saveModel(@RequestBody ModelDTO modelDTO) {
		String id = modelService.saveModel(modelDTO);
		return new ResponseEntity<ResponseDTO>(new ResponseDTO(id, HttpStatus.CREATED.toString()), HttpStatus.CREATED);
	}
}
