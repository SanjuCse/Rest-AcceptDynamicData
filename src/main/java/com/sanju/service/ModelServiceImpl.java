package com.sanju.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanju.dto.ModelDTO;
import com.sanju.mapper.ModelMapper;
import com.sanju.model.Model;
import com.sanju.repo.IModelRepo;

@Service
public class ModelServiceImpl implements IModelService {
	@Autowired
	private IModelRepo modelRepo;

	/**
	 * Saves a Model and returns its ID.
	 */
	@Override
	public String saveModel(ModelDTO modelDTO) {
		String id = modelRepo.save(ModelMapper.mapToModel(modelDTO, new Model())).getId();
		return id;
	}

	/**
	 * Method for get All the Models from DB.
	 */
	@Override
	public List<ModelDTO> getAllModel() {
		List<ModelDTO> modelDTOs = new ArrayList<>();
		modelRepo.findAll().stream().forEach(model -> modelDTOs.add(ModelMapper.mapToModelDTO(model, new ModelDTO())));
		return modelDTOs;
	}
}
