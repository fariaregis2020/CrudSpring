package com.br.spring.repository;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.br.spring.entidades.Cliente;

@Repository
@Transactional
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}
