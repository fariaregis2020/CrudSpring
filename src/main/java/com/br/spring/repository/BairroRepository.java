package com.br.spring.repository;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.br.spring.entidades.Bairro;

@Repository
@Transactional
public interface BairroRepository extends CrudRepository<Bairro, Long> {

}
