package com.br.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.br.spring.entidades.Bairro;
import com.br.spring.repository.BairroRepository;

@Controller
public class BairroController {
	
	@Autowired
	private BairroRepository bairroRepository;

	@RequestMapping(method = RequestMethod.GET, value = "/cadbairro")
	public String bairro() {
		return "/cadastro/cadbairro";
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/cadbairro")
	public String bairro(Bairro bairro) {
		bairroRepository.save(bairro);
		return "/cadastro/cadbairro";
	}
	
	
}
