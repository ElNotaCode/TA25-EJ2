package com.crud.spring.service;

import java.util.List;

import com.crud.spring.dto.Departamento;

public interface IDepartamentoService {

	//listar
	public List<Departamento> listarDepartamentos();
	//C
	public Departamento createDepartamento(Departamento departamento);
	//R
	public Departamento readDepartamento(Long codigo);
	//U
	public Departamento updateDepartamento(Departamento departamento);
	//D
	public void deleteDepartamento(Long codigo);
}
