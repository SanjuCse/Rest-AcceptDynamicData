package com.sanju.mapper;

import com.sanju.dto.ModelDTO;
import com.sanju.model.Model;

public class ModelMapper {
	public static Model mapToModel(ModelDTO modelDTO, Model model) {
		model.setModel(modelDTO.getModel());
		return model;
	}

	public static ModelDTO mapToModelDTO(Model model, ModelDTO modelDTO) {
		modelDTO.setModel(model.getModel());
		return modelDTO;
	}
}
