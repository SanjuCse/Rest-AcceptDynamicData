package com.sanju.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sanju.model.Model;

public interface IModelRepo extends MongoRepository<Model, String> {

}
