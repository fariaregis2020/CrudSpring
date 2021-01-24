package com.br.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.br.spring.entidades.Cliente;
import com.br.spring.repository.ClienteRepository;

@Controller
public class ClienteController {

	

	@Autowired
	private ClienteRepository clienteRepository; 

	
	@RequestMapping(method = RequestMethod.GET, value ="/cadastarCliente")
	public String cliente() { 
		return "/cadastro/cadastroCliente";
	}
	

	@RequestMapping(method = RequestMethod.POST, value ="/salvar_cliente")
	public String salvar(Cliente cliente ) {
		clienteRepository.save(cliente);
		return "/cadastro/cadastroCliente";
	}


	
	
	

}
