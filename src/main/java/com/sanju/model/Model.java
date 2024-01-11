package com.sanju.model;

import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Document
@Getter
@Setter
@ToString
public class Model {
	@Id
	private String id;
	private Map<String, Object> model;
}
