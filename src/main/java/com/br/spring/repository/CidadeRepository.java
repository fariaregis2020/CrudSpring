package com.br.spring.repository;

import org.springframework.data.repository.CrudRepository;

import com.br.spring.entidades.Cidade;

public interface CidadeRepository extends CrudRepository<Cidade, Long> {

}
