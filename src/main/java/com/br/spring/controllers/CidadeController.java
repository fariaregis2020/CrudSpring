package com.br.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.br.spring.entidades.Cidade;
import com.br.spring.repository.CidadeRepository;

@Controller
public class CidadeController {

	@Autowired
	private CidadeRepository cidadeRepository;

	@RequestMapping(method = RequestMethod.GET, value = "/salvarcidade")
	public String cidade() {
		return "/cadastro/cadcidade";
	}

	@RequestMapping(method = RequestMethod.POST, value = "/salvarcidade")
	public String cidade(Cidade cidade) {
		cidadeRepository.save(cidade);
		return "/cadastro/cadcidade";
	}

}
