package com.victorcampos.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.victorcampos.workshopmongo.domain.User;

@RestController //Definindo que essa classe é um recurso Rest
@RequestMapping(value = "/users")//Definindo o caminho do EndPoint
public class UserResource {
	
	//Pode-se usar o @GetMapping também
	@RequestMapping(method = RequestMethod.GET)//Obtendo informações no padrão REST com o GET do HTTP
	
	//O ResponseEntity server para nos retornar valores formatados, com possíveis cabeçalhos e afins.
	public ResponseEntity<List<User>> findAll(){
		User maria = new User("1", "Maria", "maria@gmail.com");
		User alex = new User("2", "alex", "alex@gmail.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(maria,alex));
		
		//Lê-se: .ok -> resposta deu certo; .body -> o que vai ser retornado
		return ResponseEntity.ok().body(list);
	}
}
