package com.victorcampos.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.victorcampos.workshopmongo.domain.User;
import com.victorcampos.workshopmongo.repository.UserRepository;

//Informando que essa classe vai ser um serviço injetável
@Service
public class UserService {
	
	//Instanciando um objeto UserRepository para acessar todos os usuários do banco
	@Autowired //O Springboot procura a definição automatica com o uso dessa anotação
	private UserRepository repo;
	
	public List<User> findAll(){
		return repo.findAll(); //Usando .findAll automático do SpringData para realizar o retorno de valores
		
	}
}
