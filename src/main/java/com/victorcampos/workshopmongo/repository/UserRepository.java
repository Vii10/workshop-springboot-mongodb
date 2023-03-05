package com.victorcampos.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.victorcampos.workshopmongo.domain.User;

//Implementando repository com SpringData

@Repository
//Como parametro vai: O tipo de classe que será gerenciada; O Tipo do ID da classe
public interface UserRepository extends MongoRepository<User, String> {	
	
}
