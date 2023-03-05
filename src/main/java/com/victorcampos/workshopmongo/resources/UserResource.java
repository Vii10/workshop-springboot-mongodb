package com.victorcampos.workshopmongo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.victorcampos.workshopmongo.domain.User;
import com.victorcampos.workshopmongo.services.UserService;

@RestController //Definindo que essa classe é um recurso Rest
@RequestMapping(value = "/users")//Definindo o caminho do EndPoint
public class UserResource {
	
	//Injetando um serviço automaticamente
	@Autowired
	private UserService service;
	
	//Pode-se usar o @GetMapping também
	@RequestMapping(method = RequestMethod.GET)//Obtendo informações no padrão REST com o GET do HTTP
	
	//O ResponseEntity server para nos retornar valores formatados, com possíveis cabeçalhos e afins.
	public ResponseEntity<List<User>> findAll(){
		//Refatorando o código
		List<User> list = service.findAll();
		//Lê-se: .ok -> resposta deu certo; .body -> o que vai ser retornado
		return ResponseEntity.ok().body(list);
	}
}
