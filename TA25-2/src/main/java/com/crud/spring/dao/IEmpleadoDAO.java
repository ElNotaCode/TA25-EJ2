package com.crud.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.spring.dto.Empleado;

public interface IEmpleadoDAO extends JpaRepository<Empleado, String> {

}
