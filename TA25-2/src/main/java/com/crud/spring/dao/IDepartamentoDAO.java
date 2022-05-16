package com.crud.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.spring.dto.Departamento;

public interface IDepartamentoDAO extends JpaRepository<Departamento, Long> {

}
