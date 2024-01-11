package com.sanju.service;

import java.util.List;

import com.sanju.dto.ModelDTO;

public interface IModelService {
	String saveModel(ModelDTO modelDTO);

	List<ModelDTO> getAllModel();
}